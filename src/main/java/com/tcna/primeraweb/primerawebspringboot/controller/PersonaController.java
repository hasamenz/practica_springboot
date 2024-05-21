package com.tcna.primeraweb.primerawebspringboot.controller;

import com.tcna.primeraweb.primerawebspringboot.entities.Persona;
import com.tcna.primeraweb.primerawebspringboot.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/personas")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping
    public String listarPersonas(Model model){
        List<Persona> personas = personaService.obtenerTodas();
        model.addAttribute("personasLista",personas);
        return "listar";
    }
}
