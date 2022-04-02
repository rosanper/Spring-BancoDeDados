package com.letscode.exemplomanytomany.dto;

import com.letscode.exemplomanytomany.models.Aluno;
import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AlunoResponse {
    private Integer id;
    private String nome;
    private Integer idade;
//    private List<CursoResponse> cursos;

    public AlunoResponse(Aluno aluno){
        AlunoResponse.builder()
                .id(aluno.getId())
                .nome(aluno.getNome())
                .idade(aluno.getIdade())
//                .cursos(aluno.getCursos().stream().map(curso -> new CursoResponse(curso)).collect(Collectors.toList()))
                .build();
    }
}
