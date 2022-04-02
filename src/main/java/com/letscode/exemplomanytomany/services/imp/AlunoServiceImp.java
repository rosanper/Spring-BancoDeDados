package com.letscode.exemplomanytomany.services.imp;

import com.letscode.exemplomanytomany.dto.AlunoRequest;
import com.letscode.exemplomanytomany.models.Aluno;
import com.letscode.exemplomanytomany.models.Curso;
import com.letscode.exemplomanytomany.repositories.AlunoRepository;
import com.letscode.exemplomanytomany.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImp implements AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private CursoServiceImp cursoServiceImp;

    @Override
    public List<Aluno> getAll() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno create(AlunoRequest alunoRequest) {
        return alunoRepository.save(new Aluno(alunoRequest));
    }


    public String updateCurso(Integer id,String nome){
        Curso findByNome = cursoServiceImp.findByNome(nome);
        Aluno aluno = alunoRepository.findById(id).orElseThrow();
        String mensage = "";
        if(findByNome != null){
            mensage = "Deu certo";
            aluno.getCursos().add(findByNome);
            alunoRepository.save(aluno);
        }else{
            mensage = "Deu errado";
        }
        return mensage;
    }
}
