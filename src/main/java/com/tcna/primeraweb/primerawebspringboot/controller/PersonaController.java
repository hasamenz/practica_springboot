package com.tcna.primeraweb.primerawebspringboot.controller;

import com.tcna.primeraweb.primerawebspringboot.entities.Persona;
import com.tcna.primeraweb.primerawebspringboot.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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

    @GetMapping("/nueva") //llevar a un formulario . mostrar datos, obtener datos
    public String mostrarFormularioDeNuevaPersona(Model model){
        model.addAttribute("persona", new Persona());
        model.addAttribute("accion","/persona/nueva");
        return "formulario";
    }

    public String guardarNuevaPersona(@ModelAttribute Persona persona){
        personaService.crearPersona(persona);
        return "redirect:/personas";
    }

}
