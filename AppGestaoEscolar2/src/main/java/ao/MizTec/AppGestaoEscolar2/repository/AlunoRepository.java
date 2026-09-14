package ao.MizTec.AppGestaoEscolar2.repository;

import ao.MizTec.AppGestaoEscolar2.domain.Aluno;
import ao.MizTec.AppGestaoEscolar2.domain.EstadoAluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    Optional<Aluno> findByNumeroMatricula(String numeroMatricula);

    boolean existsByNumeroMatricula(String numeroMatricula);

    boolean existsByDocumentoIdentificacao(String documentoIdentificacao);


    List<Aluno> findByEstado(EstadoAluno estado);

    List<Aluno> findByNumeroContainingIgnoreCase(String nome);
}
