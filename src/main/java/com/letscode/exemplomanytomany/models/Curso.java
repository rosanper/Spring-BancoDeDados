package com.letscode.exemplomanytomany.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.letscode.exemplomanytomany.dto.CursoRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "curso")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "duracao")
    private Integer duracao;

    @ManyToMany(mappedBy = "cursos")
    @JsonIgnore
    private List<Aluno> alunos;

    public Curso(CursoRequest cursoRequest){
        this.nome= cursoRequest.getNome();
        this.duracao= cursoRequest.getDuracao();
    }
}
