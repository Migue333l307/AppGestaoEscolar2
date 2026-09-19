package ao.MizTec.AppGestaoEscolar2.curso.Entity;

import ao.MizTec.AppGestaoEscolar2.disciplina.Entity.Disciplina;
import ao.MizTec.AppGestaoEscolar2.nivelEnsino.Entity.NivelEnsino;
import jakarta.persistence.*;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_curso")
    private Long id;

    @OneToMany(mappedBy = "curso")
    private List<Disciplina> disciplinas = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "id_nivel", nullable = false)
    private NivelEnsino nivelEnsino;

    @Column(name = "codigo", nullable = false, unique = true)
    private String codigo;

    @Column(name = "nome", nullable = false, unique = true, length = 100)
    private String nome;

    @Column(name = "duracao")
    private Integer duracao;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private EstadoCurso estado;


   protected Curso() {
    }

    public Curso(NivelEnsino nivelEnsino, String codigo, String nome, Integer duracao, EstadoCurso estado) {
        this.nivelEnsino = nivelEnsino;
        this.codigo = codigo;
        this.nome = nome;
        this.duracao = duracao;
        this.estado = estado;
    }
}
