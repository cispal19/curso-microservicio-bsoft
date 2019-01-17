package com.cispal.persona.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cispal.persona.bean.Persona;
import com.cispal.persona.service.PersonaService;

@RestController
public class PersonaResources {
	@Autowired
	private PersonaService service;

	@GetMapping(path = "/listar")
	public List<Persona> getPersonas() {
		return service.getPersonas();
	}

	@PostMapping(path = "/create")
	public Persona savePersona(@RequestBody Persona persona) {
		return service.savePersona(persona);
	}

	@GetMapping(path = "/{id}")
	public Persona findPersona(@PathVariable("id") Integer id) {
		return service.findPersona(id);
	}

	@DeleteMapping(path = "/{id}")
	public Persona deletePersona(Integer id) {
		return service.deletePersona(id);
	}

}
