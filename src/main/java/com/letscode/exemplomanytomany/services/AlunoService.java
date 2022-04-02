package com.letscode.exemplomanytomany.services;

import com.letscode.exemplomanytomany.dto.AlunoRequest;
import com.letscode.exemplomanytomany.models.Aluno;

import java.util.List;

public interface AlunoService {
    List<Aluno> getAll();

    Aluno create(AlunoRequest alunoRequest);
}
