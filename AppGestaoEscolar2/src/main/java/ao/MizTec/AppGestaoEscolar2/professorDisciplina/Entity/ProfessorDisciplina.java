package ao.MizTec.AppGestaoEscolar2.professorDisciplina.Entity;

import ao.MizTec.AppGestaoEscolar2.disciplina.Entity.Disciplina;
import ao.MizTec.AppGestaoEscolar2.professor.Entity.Professor;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "professor_disciplina")
public class ProfessorDisciplina {

    @EmbeddedId
    private ProfessorDisciplinaId id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("idProfessor")
    @JoinColumn(name = "id_professor")
    private Professor professor;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("idDisciplina")
    @JoinColumn(name = "id_disciplina")
    private Disciplina disciplina;

    @Column(name = "data_inicio")
    private LocalDate dataInicio;

    @Column(name = "data_fim")
    private LocalDate dataFim;

    protected ProfessorDisciplina() {
    }

    public ProfessorDisciplina(ProfessorDisciplinaId id, Professor professor,
                               Disciplina disciplina, LocalDate dataInicio, LocalDate dataFim) {
        this.id = id;
        this.professor = professor;
        this.disciplina = disciplina;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }
}
