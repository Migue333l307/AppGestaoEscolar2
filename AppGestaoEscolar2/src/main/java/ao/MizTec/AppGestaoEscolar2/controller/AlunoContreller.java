package ao.MizTec.AppGestaoEscolar2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class AlunoContreller {

    @GetMapping("/aluno")
    public String mensagem(){
        return "Primeira vista do Programa";
    }

}
