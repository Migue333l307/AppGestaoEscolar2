package repository;

import domain.Aluno;
import domain.EstadoAluno;
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
