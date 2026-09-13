package domain;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_aluno")
    private Long id;

    @Column(name = "numero_matricula", nullable = false, unique = true, length =30)
    private String numeroMatricula;

    @Column(name = "nome", nullable = false, length = 150)
    private String nome;

    @Column(name = "nome_social", length = 150)
    private String nomeSocial;

    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "genero", length = 20)
    private String genero;

    @Column(name = "documento_identificacao", unique = true, length = 50)
    private String documentoIdentificacao;

    @Column(name = "telefone", length = 30)
    private String telefone;

    @Column(name = "email", length = 150)
    private String email;

    @Column(name = "endereco", length = 255)
    private String endereco;

    @Column(name = "data_cadastro")
    private LocalDateTime dataCadastro;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", length = 20)
    private EstadoAluno estado;

    @OneToMany(mappedBy = "aluno")
    private List<AlunoResponsavel> alunoResponsaveis = new ArrayList<>();

    public Aluno() {
    }

    public Aluno(String numeroMatricula, String nome, String nomeSocial, LocalDate dataNascimento,
                 String genero, String documentoIdentificacao, String telefone, String email, String endereco,
                 LocalDateTime dataCadastro, EstadoAluno estado) {
        this.numeroMatricula = numeroMatricula;
        this.nome = nome;
        this.nomeSocial = nomeSocial;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.documentoIdentificacao = documentoIdentificacao;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.dataCadastro = dataCadastro;
        this.estado = estado;
    }


    public Long getId() {
        return id;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public String getDocumentoIdentificacao() {
        return documentoIdentificacao;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public EstadoAluno getEstado() {
        return estado;
    }

    public void alterarNome(String nome){
        this.nome = nome;
    }

    public void alterarNomeSocial(String nomeSocial){
        this.nomeSocial = nomeSocial;
    }

    public void alterarGenero(String genero){
        this.genero = genero;
    }

    public void alterarTelefone(String telefone){
        this.telefone = telefone;
    }

    public void alterarEmail(String email){
        this.email = email;
    }

}
