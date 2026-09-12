package domain;

import java.time.LocalDate;


public class Aluno {
    private Long id;
    private String numeroMatricula;
    private String nome;
    private String nomeSocial;
    private LocalDate dataNascimento;
    private String genero;
    private String documentoIdentificacao;
    private String telefone;
    private String email;
    private String endereco;
    private LocalDate dataCadastro;
    private EstadoAluno estado;

    public Aluno(Long id, String numeroMatricula, String nome, String nomeSocial, LocalDate dataNascimento,
                 String genero, String documentoIdentificacao, String telefone, String email, String endereco,
                 LocalDate dataCadastro, EstadoAluno estado) {
        this.id = id;
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

    public LocalDate getDataCadastro() {
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

    public void alterarEstado(EstadoAluno estado){
        this.estado = estado;
    }
}
