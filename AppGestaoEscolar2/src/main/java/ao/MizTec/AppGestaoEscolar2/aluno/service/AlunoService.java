package ao.MizTec.AppGestaoEscolar2.aluno.service;


import ao.MizTec.AppGestaoEscolar2.aluno.dto.AlunoCadastroDTO;
import ao.MizTec.AppGestaoEscolar2.aluno.Entity.Aluno;
import org.springframework.stereotype.Service;
import ao.MizTec.AppGestaoEscolar2.aluno.repository.AlunoRepository;

import java.time.LocalDateTime;


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
                dto.getEndereco(),
                LocalDateTime.now(),
                dto.getEstado()
        );

        repository.save(aluno);
    }
}
