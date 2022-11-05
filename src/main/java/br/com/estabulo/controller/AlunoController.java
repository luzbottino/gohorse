package br.com.estabulo.controller;

import br.com.estabulo.AlunosBase;
import br.com.estabulo.dto.AlunoDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @GetMapping
    public List<AlunoDTO> listarTodos() {
        return new AlunosBase().listarTodos();
    }
}