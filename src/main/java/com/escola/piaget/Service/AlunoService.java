package com.escola.piaget.Service;


import com.escola.piaget.Models.Aluno;
import com.escola.piaget.Repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AlunoService {

    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public List<Aluno> listaDeAlunos(){
        return repository.findAll();
    }

    public Aluno salvaNovoAluno(Aluno dadosAluno){
        return repository.save(dadosAluno);
    }

    public void excluirAluno(Long id){
        repository.deleteById(id);
    }


    public Aluno buscarAlunoId(Long id){
        return repository.findById(id).orElse(null);
    }


}
