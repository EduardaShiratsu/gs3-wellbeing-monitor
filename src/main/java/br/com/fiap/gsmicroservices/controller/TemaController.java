package br.com.fiap.gsmicroservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TemaController {

    @GetMapping("/info")
    public Map<String, String> getInfo() {
        return Map.of(
    "tema", "Ferramentas de monitoramento de bem-estar e saúde mental",
    "membro1", "Eduarda Shiratsu - RM 551188",
    "membro2", "Felipe Cortez - RM 551665",
    "descricao", "A API tem como foco simular uma integração com sistemas de bem-estar, retornando dados de forma simples e acessível."
);

    }
}