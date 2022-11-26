package br.com.estabulo.controller;

import br.com.estabulo.domain.Aluno;
import br.com.estabulo.dto.AlunoDTO;
import br.com.estabulo.repository.AlunoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AlunoController {

    private final AlunoDAO alunoDAO;

    @Autowired
    public AlunoController(AlunoDAO alunoDAO) {
        this.alunoDAO = alunoDAO;
    }

    @GetMapping("/alunos")
    public List<AlunoDTO> listarAlunos() {
        List<Aluno> alunos = alunoDAO.findAll();
        List<AlunoDTO> alunosDTO = new ArrayList<>();

        alunos.forEach(aluno -> {
            AlunoDTO alunoDTO = new AlunoDTO(aluno.getNome(), aluno.getMatricula(), aluno.getCreditos(), aluno.getCurso());
            alunosDTO.add(alunoDTO);
        });

        return alunosDTO;
    }
}
