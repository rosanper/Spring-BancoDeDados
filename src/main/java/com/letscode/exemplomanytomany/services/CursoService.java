package com.letscode.exemplomanytomany.services;


import com.letscode.exemplomanytomany.dto.CursoRequest;
import com.letscode.exemplomanytomany.models.Curso;

import java.util.List;

public interface CursoService {
    List<Curso> getAll();

    Curso create(CursoRequest cursoRequest);

    Curso findByNome(String nome);
}
