package domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "responsavel")
public class Responsavel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_responsavel")
    private Long id;

    @Column(name = "nome",nullable = false,length = 150)
    private String nome;

    @Column(name = "documento_identificacao",unique = true,length = 50)
    private String documentoIdentificacao;

    @Column(name = "telefone",length = 30)
    private String telefone;

    @Column(name = "email",length = 150)
    private String email;

    @Column(name = "endereco", length = 255)
    private String endereco;

    @Column(name = "profissao",length = 100)
    private String profissao;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false, length = 20)
    private EstadoAluno estado;

    private List<AlunoResponsavel> alunoResponsaveis = new ArrayList<>();


    public Responsavel() {
    }

    public Responsavel( String nome, String documentoIdentificacao, String telefone, String email,
                       String endereco, String profissao, EstadoAluno estado) {
        this.nome = nome;
        this.documentoIdentificacao = documentoIdentificacao;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.profissao = profissao;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumentoIdentificacao() {
        return documentoIdentificacao;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getProfissao() {
        return profissao;
    }

    public EstadoAluno getEstado() {
        return estado;
    }

    public void alterarNome(String nome) {
        this.nome = nome;
    }

    public void alterarTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void alterarEmail(String email) {
        this.email = email;
    }

    public void alterarEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void alterarProfissao(String profissao) {
        this.profissao = profissao;
    }



}
