package ao.MizTec.AppGestaoEscolar2.DTO;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

//Entity transforma uma classe em entidade do nosso banco de dados;


public class AlunoCadastroDTO {

    @NotBlank(message = "O número de matricula é obrigatório")
    @Size(max = 30, message = "O número de matrícula deve ter no máximo 30 caracteres")
    private String numeroMatricula;

    @NotBlank(message = "O nome é obrigatório")
    @Size(max = 150, message = "O nome deve ter no máximo 150 caracteres")
    private String nome;

    @Size(max = 150, message = "O nome deve ter no máximo 150 caracteres" )
    private String nomeSocial;

    @NotNull(message = "A data de nascimento é obrigatória")
    @Past(message = "A data de nascimento deve estar no passado")
    private LocalDate dataNascimento;


    private String genero;

    @Size(max = 50, message = "O documento deve ter no máximo 50 caracteres")
    private String documentoIdentificacao;


    private String telefone;

    @Email(message = "O email informado não é válido")
    private String email;


    private String endereco;

    public AlunoCadastroDTO() {
    }

    public AlunoCadastroDTO(String numeroMatricula, String nome, String nomeSocial, LocalDate dataNascimento,
                            String genero, String documentoIdentificacao, String telefone, String email,
                            String endereco) {
        this.numeroMatricula = numeroMatricula;
        this.nome = nome;
        this.nomeSocial = nomeSocial;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.documentoIdentificacao = documentoIdentificacao;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
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

}
