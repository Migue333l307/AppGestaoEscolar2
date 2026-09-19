package ao.MizTec.AppGestaoEscolar2.professor.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Professor")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_professor")
    private Long id;

    @Column(name = "nome", nullable = false, unique = true, length = 150)
    private String nome;

    @Column(name = "documento_identificacao", nullable = false, unique = true, length = 100)
    private String documentoIdentificacao;

    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "email", nullable = false, length = 255)
    private String email;

    @Column(name = "especialidade", nullable = false, length = 150)
    private String especialidade;

    @Column(name = "numero_funcional", nullable = false, unique = true)
    private String numeroFuncional;

    @Column(name = "data_admissao")
    private LocalDate dataAdmissao;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado")
    private EstadoProfessor estado;

    protected Professor() {
    }

    public Professor(String nome, String documentoIdentificacao, LocalDate dataNascimento,
                     String email, String especialidade, String numeroFuncional, LocalDate dataAdmissao, EstadoProfessor estado) {
        this.nome = nome;
        this.documentoIdentificacao = documentoIdentificacao;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.especialidade = especialidade;
        this.numeroFuncional = numeroFuncional;
        this.dataAdmissao = dataAdmissao;
        this.estado = estado;
    }
}
