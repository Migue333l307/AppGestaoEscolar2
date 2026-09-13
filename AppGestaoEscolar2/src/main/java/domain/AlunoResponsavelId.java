package domain;


/*

Construção duma chave primária composta:
    Ela vai ser de chave primária da nossa entidade AlunoResponsavel
* */

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AlunoResponsavelId implements Serializable {

    private Long idAluno;
    private Long idResponsavel;


    public AlunoResponsavelId() {
    }

    public AlunoResponsavelId(Long idAluno, Long idResponsavel) {
        this.idAluno = idAluno;
        this.idResponsavel = idResponsavel;
    }

    public Long getIdAluno() {
        return idAluno;
    }

    public Long getIdResponsavel() {
        return idResponsavel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AlunoResponsavelId)) return false;
        AlunoResponsavelId that = (AlunoResponsavelId) o;
        return Objects.equals(idAluno, that.idAluno) && Objects.equals(idResponsavel, that.idResponsavel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAluno, idResponsavel);
    }
}
