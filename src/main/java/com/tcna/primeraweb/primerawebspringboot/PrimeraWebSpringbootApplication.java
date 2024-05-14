package com.tcna.primeraweb.primerawebspringboot;

import com.tcna.primeraweb.primerawebspringboot.entities.Persona;
import com.tcna.primeraweb.primerawebspringboot.repository.PersonaREpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PrimeraWebSpringbootApplication implements CommandLineRunner {

	@Autowired
	private PersonaREpository personaREpository;

	public static void main(String[] args) {
		SpringApplication.run(PrimeraWebSpringbootApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		/*
		personaREpository.save(new Persona(1L,"Hugo",30));
		personaREpository.save(new Persona(2L,"Melissa",20));
		personaREpository.save(new Persona(3L,"Gustavo",35));
		personaREpository.save(new Persona(4L,"Yasira",29));
		personaREpository.save(new Persona(5L,"Mateo",27));

		 */

		//mostramos el numero de personas
		System.out.println("Numero de personas de la tabla : "+personaREpository.count());

		//monstramos la lista de personas
		List<Persona> personas = personaREpository.findAll();
		personas.forEach(p -> System.out.println("Nombre de la persona : " +p.getNombre()));
	}
}
