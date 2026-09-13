package service;


import DTO.AlunoCadastroDTO;
import domain.Aluno;
import org.springframework.stereotype.Service;
import repository.AlunoRepository;


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
