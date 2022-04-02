package com.letscode.exemplomanytomany.controllers;

import com.letscode.exemplomanytomany.dto.AlunoRequest;
import com.letscode.exemplomanytomany.dto.AlunoResponse;
import com.letscode.exemplomanytomany.models.Aluno;
import com.letscode.exemplomanytomany.services.imp.AlunoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImp alunoServiceImp;

//    @GetMapping
//    private String teste(){
//        return "Deu certo";
//    }

    @GetMapping
    private List<Aluno> getAll(){
//        List<Aluno> allAlunos = alunoServiceImp.getAll();
//        return allAlunos.stream().map(aluno -> new AlunoResponse(aluno)).collect(Collectors.toList());
        return alunoServiceImp.getAll();
    }

    @PostMapping
    private Aluno create(@RequestBody AlunoRequest alunoRequest){
//        Aluno aluno = alunoServiceImp.create(alunoRequest);
//        return new AlunoResponse(aluno);
        return alunoServiceImp.create(alunoRequest);
    }

    @PutMapping("/{id}")
    private String updateCurso(@PathVariable Integer id, @RequestParam String nome){
        return alunoServiceImp.updateCurso(id,nome);
    }

}
