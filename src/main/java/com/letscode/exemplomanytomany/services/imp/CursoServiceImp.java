package com.letscode.exemplomanytomany.services.imp;

import com.letscode.exemplomanytomany.dto.AlunoRequest;
import com.letscode.exemplomanytomany.dto.CursoRequest;
import com.letscode.exemplomanytomany.models.Aluno;
import com.letscode.exemplomanytomany.models.Curso;
import com.letscode.exemplomanytomany.repositories.AlunoRepository;
import com.letscode.exemplomanytomany.repositories.CursoRepository;
import com.letscode.exemplomanytomany.services.AlunoService;
import com.letscode.exemplomanytomany.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImp implements CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public List<Curso> getAll() {
        return cursoRepository.findAll();
    }

    @Override
    public Curso create(CursoRequest cursoRequest) {
        return cursoRepository.save(new Curso(cursoRequest));
    }

    @Override
    public Curso findByNome(String nome) {
        return cursoRepository.findByNome(nome);
    }
}
