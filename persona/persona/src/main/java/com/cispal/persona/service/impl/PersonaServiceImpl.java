package com.cispal.persona.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cispal.persona.bean.Persona;
import com.cispal.persona.repository.PersonaRepository;
import com.cispal.persona.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {
	
	public PersonaServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private PersonaRepository repository;

	@Override
	public List<Persona> getPersonas() {
		// TODO Auto-generated method stub
		return repository.getPersonas();
	}

	@Override
	public Persona savePersona(Persona persona) {
		// TODO Auto-generated method stub
		return repository.savePersona(persona);
	}

	@Override
	public Persona findPersona(Integer id) {
		// TODO Auto-generated method stub
		return repository.findPersona(id);
	}

	@Override
	public Persona deletePersona(Integer id) {
		// TODO Auto-generated method stub
		return repository.deletePersona(id);
	}

	@Override
	public Persona updatePersona(Persona p) {
		// TODO Auto-generated method stub
		return repository.updatePersona(p);
	}

}
