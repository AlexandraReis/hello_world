package com.helloword.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Meus Objetivos da Semana")
public class MeusObjetivosdaSemana {

    @GetMapping
    public String MeusObejtivosdaSemana() {
        return "Meus objetivos para essa semana são: <br><br>"
                + "<br><li>Concluir JAVA com meu grupo de estudo<br><li>"
                + "<li>Ficar mais tempo com a minha família<br><li>"
                + "<br><li>Organizar meu currículo<br><li>";
    }
}