package com.letscode.exemplomanytomany.dto;

import com.letscode.exemplomanytomany.models.Aluno;
import com.letscode.exemplomanytomany.models.Curso;
import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CursoResponse {
    private Integer id;
    private String nome;
    private Integer duracao;
    private List<String> nomeAlunos;

    public CursoResponse(Curso curso) {
        this.id = curso.getId();
        this.nome = curso.getNome();
        this.duracao = curso.getDuracao();
        this.nomeAlunos = curso.getAlunos().stream().map(Aluno::getNome).collect(Collectors.toList());
    }
}
