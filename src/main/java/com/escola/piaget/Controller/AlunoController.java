package com.escola.piaget.Controller;

import com.escola.piaget.Models.Aluno;
import com.escola.piaget.Service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
   private final AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Aluno> encontrarListadeAlunos(){
        return service.listaDeAlunos();
    }

    @PostMapping
    public Aluno criarNovoAluno(@RequestBody Aluno novoAluno){
        return service.salvaNovoAluno(novoAluno);
    }


}
