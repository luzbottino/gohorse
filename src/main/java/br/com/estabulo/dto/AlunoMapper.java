package br.com.estabulo.dto;

import br.com.estabulo.domain.Aluno;
import org.springframework.stereotype.Component;

@Component
public class AlunoMapper {

    public AlunoDTO toDTO(Aluno aluno) {
        return new AlunoDTO(aluno);
    }
}
