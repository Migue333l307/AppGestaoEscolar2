package ao.MizTec.AppGestaoEscolar2.planoDisciplina.Entity;

import ao.MizTec.AppGestaoEscolar2.disciplina.Entity.Disciplina;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "plano_disciplina")
public class PlanoDisciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_plano")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_disciplina", nullable = false)
    private Disciplina disciplina;

    @Column(name = "objectivo", nullable = false, length = 1000)
    private String objectivo;

    @Column(name = "ementa", nullable = false, length = 1000)
    private String ementa;

    @Column(name = "carga_horaria", nullable = false)
    private Integer cargaHoraria;

    @Column(name = "Conteudo_programatico", nullable = false)
    private String conteudoProgramatico;

    @Column(name = "metodologia", nullable = false)
    private String metodologia;

    @Column(name = "creterio_avaliacao", nullable = false)
    private String CriteiroAvaliacao;

    @Column(name = "ano_referencia", nullable = false)
    private LocalDate anoReferencia;

    protected PlanoDisciplina() {
    }

    public PlanoDisciplina(Disciplina disciplina, String objectivo, String ementa, Integer cargaHoraria, String conteudoProgramatico, String metodologia, String criteiroAvaliacao, LocalDate anoReferencia) {
        this.disciplina = disciplina;
        this.objectivo = objectivo;
        this.ementa = ementa;
        this.cargaHoraria = cargaHoraria;
        this.conteudoProgramatico = conteudoProgramatico;
        this.metodologia = metodologia;
        CriteiroAvaliacao = criteiroAvaliacao;
        this.anoReferencia = anoReferencia;
    }
}
