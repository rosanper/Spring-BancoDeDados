package com.letscode.exemplomanytomany.controllers;

import com.letscode.exemplomanytomany.dto.CursoRequest;
import com.letscode.exemplomanytomany.dto.CursoResponse;
import com.letscode.exemplomanytomany.models.Curso;
import com.letscode.exemplomanytomany.services.imp.CursoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoServiceImp cursoServiceImp;

    @GetMapping
    private List<CursoResponse> getAll(){
        List<Curso> allCursos = cursoServiceImp.getAll();
        return allCursos.stream().map(curso -> new CursoResponse(curso)).collect(Collectors.toList());
//        return cursoServiceImp.getAll();
    }

    @PostMapping
    private CursoResponse create(@RequestBody CursoRequest cursoRequest){
        Curso curso = cursoServiceImp.create(cursoRequest);
        return new CursoResponse(curso);
//        return cursoServiceImp.create(cursoRequest);
    }
}
