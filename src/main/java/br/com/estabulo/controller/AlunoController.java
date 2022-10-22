package br.com.estabulo.controller;

import br.com.estabulo.AlunosBase;
import br.com.estabulo.dto.AlunoDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

    @RestController
    @RequestMapping("/aluno")
    public class AlunoController {

        @GetMapping
        public List<AlunoDTO> listarTodos() {
            return new AlunosBase().listarTodos();
        }

        @GetMapping("/filtrar")
        public List<AlunoDTO> filtrar(@RequestParam("matricula") String matricula) {
            var alunos = new AlunosBase().listarTodos();
            System.out.println(matricula);
            return alunos.stream()
                    .filter(a -> a.getMatricula().equals(matricula))
                    .collect(Collectors.toList());
        }

        @PutMapping({"/{matricula}/{nomeAluno}"})
        public String atualizar(@PathVariable("matricula") String matricula,
                                @PathVariable("nomeAluno") String nomeAluno){
            return "O aluno " + nomeAluno + " de matrícula " + matricula + " foi atualizado.";
        }

        @PostMapping
        public String cadastrar(@RequestBody AlunoDTO aluno){
            return "O " + aluno + " foi cadastrado";
        }
    }