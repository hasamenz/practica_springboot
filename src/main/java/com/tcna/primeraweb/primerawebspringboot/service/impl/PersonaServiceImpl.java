package com.tcna.primeraweb.primerawebspringboot.service.impl;

import com.tcna.primeraweb.primerawebspringboot.entities.Persona;
import com.tcna.primeraweb.primerawebspringboot.repository.PersonaREpository;
import com.tcna.primeraweb.primerawebspringboot.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaREpository personaREpository;

    @Override
    public List<Persona> obtenerTodas() {
        return personaREpository.findAll();
    }

    @Override
    public Persona obtenerPorId(Long id) {
        return personaREpository.findById(id).orElse(null);
    }

    @Override
    public Persona crearPersona(Persona persona) {
        return personaREpository.save(persona);
    }

    @Override
    public Persona actualizarPersona(Long id, Persona persona) {
        Persona personaBBDD = personaREpository.findById(id).orElse(null);
        return null;
    }
    @Override
    public void eliminarPersona(Long id) {

    }

    @Override
    public Long contarPersonas() {
        return personaREpository.count();
    }
}
