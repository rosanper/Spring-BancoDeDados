package com.letscode.exemplomanytomany.repositories;

import com.letscode.exemplomanytomany.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso,Integer> {
    Curso findByNome(String nome);
}
