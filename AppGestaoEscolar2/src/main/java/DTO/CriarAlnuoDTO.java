package DTO;

import domain.EstadoAluno;

import java.time.LocalDate;

public class CriarAlnuoDTO {


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

    public CriarAlnuoDTO(String numeroMatricula, String nome, String nomeSocial, LocalDate dataNascimento,
                         String genero, String documentoIdentificacao, String telefone, String email,
                         String endereco, LocalDate dataCadastro, EstadoAluno estado) {
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

    public String getTelefone() {
        return telefone;
    }

    public String getDocumentoIdentificacao() {
        return documentoIdentificacao;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public EstadoAluno getEstado() {
        return estado;
    }
}
