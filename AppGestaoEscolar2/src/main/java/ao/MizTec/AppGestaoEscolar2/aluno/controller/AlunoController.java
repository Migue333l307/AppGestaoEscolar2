package ao.MizTec.AppGestaoEscolar2.aluno.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class AlunoController {

    @GetMapping("/")
    public String mensagem(){
        return "index";
    }

}
