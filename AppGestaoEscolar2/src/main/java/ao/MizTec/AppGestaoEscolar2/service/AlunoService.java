package ao.MizTec.AppGestaoEscolar2.service;


import ao.MizTec.AppGestaoEscolar2.DTO.AlunoCadastroDTO;
import ao.MizTec.AppGestaoEscolar2.domain.Aluno;
import org.springframework.stereotype.Service;
import ao.MizTec.AppGestaoEscolar2.repository.AlunoRepository;


@Service
public class AlunoService {

    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public void cadastrarAluno(AlunoCadastroDTO dto){
        if (repository.existsByNumeroMatricula(dto.getNumeroMatricula())){
            throw new IllegalArgumentException("Já existe um aluno cadastrado com este número de matrícula.");
        }

        Aluno aluno = new Aluno(
                dto.getNumeroMatricula(),
                dto.getNome(),
                dto.getNomeSocial(),
                dto.getDataNascimento(),
                dto.getGenero(),
                dto.getDocumentoIdentificacao(),
                dto.getTelefone(),
                dto.getEmail(),
                dto.getEndereco()
        );

        repository.save(aluno);
    }
}
