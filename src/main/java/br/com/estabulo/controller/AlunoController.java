package br.com.estabulo.controller;

import br.com.estabulo.domain.Aluno;
import br.com.estabulo.dto.AlunoDTO;
import br.com.estabulo.dto.AlunoMapper;
import br.com.estabulo.repository.AlunoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class AlunoController {

    private final AlunoDAO alunoDAO;
    private final AlunoMapper alunoMapper;

    @Autowired
    public AlunoController(AlunoDAO alunoDAO, AlunoMapper alunoMapper) {
        this.alunoDAO = alunoDAO;
        this.alunoMapper = alunoMapper;
    }

    @GetMapping("/alunos")
    public Page<AlunoDTO> listarAlunos() {
        Pageable pagina = PageRequest.of(0, 2);
        return alunoDAO.findAll(pagina).map(page -> new AlunoDTO(page.getNome(), page.getMatricula(), page.getCreditos(), page.getCurso()));
    }
}
