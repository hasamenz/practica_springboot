package com.tcna.primeraweb.primerawebspringboot.repository;

import com.tcna.primeraweb.primerawebspringboot.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //estereotipos
public interface PersonaREpository extends JpaRepository<Persona,Long> {
}
