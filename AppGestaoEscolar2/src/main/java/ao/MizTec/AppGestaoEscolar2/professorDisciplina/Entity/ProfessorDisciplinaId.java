package ao.MizTec.AppGestaoEscolar2.professorDisciplina.Entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProfessorDisciplinaId implements Serializable {

    private Long idProfessor;

    private Long idDisciplina;

    public ProfessorDisciplinaId() {
    }

    public ProfessorDisciplinaId(Long idProfessor, Long idDisciplina) {
        this.idProfessor = idProfessor;
        this.idDisciplina = idDisciplina;
    }

    public Long getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Long idProfessor) {
        this.idProfessor = idProfessor;
    }

    public Long getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(Long idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProfessorDisciplinaId that)) return false;
        return Objects.equals(idProfessor, that.idProfessor) && Objects.equals(idDisciplina, that.idDisciplina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProfessor, idDisciplina);
    }
}
