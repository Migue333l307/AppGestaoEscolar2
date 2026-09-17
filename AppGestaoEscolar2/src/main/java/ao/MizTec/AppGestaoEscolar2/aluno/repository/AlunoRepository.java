package ao.MizTec.AppGestaoEscolar2.aluno.repository;

import ao.MizTec.AppGestaoEscolar2.aluno.Entity.Aluno;
import ao.MizTec.AppGestaoEscolar2.aluno.Entity.EstadoAluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    Optional<Aluno> findByNumeroMatricula(String numeroMatricula);

    boolean existsByNumeroMatricula(String numeroMatricula);

    boolean existsByDocumentoIdentificacao(String documentoIdentificacao);


    List<Aluno> findByEstado(EstadoAluno estado);

    List<Aluno> findByNumeroMatriculaContainingIgnoreCase(String nome);
}
