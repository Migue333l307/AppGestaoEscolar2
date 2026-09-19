package ao.MizTec.AppGestaoEscolar2.disciplina.Entity;

import ao.MizTec.AppGestaoEscolar2.curso.Entity.Curso;
import ao.MizTec.AppGestaoEscolar2.planoDisciplina.Entity.PlanoDisciplina;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "disciplina")
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_disciplina")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_curso", nullable = false)
    private Curso curso;

    @Column(name = "codigo", nullable = false, unique = true)
    private String codigo;

    @Column(name = "nome", nullable = false, length = 150)
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "carga_horaria")
    private Integer cargaHoraria;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado")
    private EstadoDisciplina disciplina;

    @OneToMany(mappedBy = "disciplina")
    private List<PlanoDisciplina> planoDisciplinas = new ArrayList<>();

    protected Disciplina() {
    }

    public Disciplina(Curso curso, String codigo, String nome, String descricao, Integer cargaHoraria, EstadoDisciplina disciplina) {
        this.curso = curso;
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.disciplina = disciplina;
    }
}
