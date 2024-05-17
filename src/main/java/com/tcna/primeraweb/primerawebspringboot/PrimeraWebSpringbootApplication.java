package com.tcna.primeraweb.primerawebspringboot;

import com.tcna.primeraweb.primerawebspringboot.entities.Persona;
import com.tcna.primeraweb.primerawebspringboot.repository.PersonaREpository;
import com.tcna.primeraweb.primerawebspringboot.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PrimeraWebSpringbootApplication implements CommandLineRunner {

	@Autowired
	private PersonaService personaService;

	public static void main(String[] args) {
		SpringApplication.run(PrimeraWebSpringbootApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		personaService.crearPersona(new Persona(7L,"Lucho",27));
		personaService.crearPersona(new Persona(8L,"Fresa",37));
		personaService.crearPersona(new Persona(9L,"Melissa",67));
		personaService.crearPersona(new Persona(10L,"Adriano",22));


		//mostramos el numero de personas
		System.out.println("Numero de personas de la tabla : "+personaService.contarPersonas());

		//monstramos la lista de personas
		List<Persona> personas = personaService.obtenerTodas();
		personas.forEach(p -> System.out.println("Nombre de la persona : " +p.getNombre()));
	}
}
