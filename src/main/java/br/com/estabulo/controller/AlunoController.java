package br.com.estabulo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {

    @GetMapping("/meu-primeiro-endpoint")
    public String meuPrimeiroEndpoint() {
        return "Parabéns! Este é o seu primeiro endpoint GET";
    }
}
