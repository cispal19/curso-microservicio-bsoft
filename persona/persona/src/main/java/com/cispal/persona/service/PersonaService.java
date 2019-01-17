package com.cispal.persona.service;

import java.util.List;

import com.cispal.persona.bean.Persona;

public interface PersonaService {
	public List<Persona> getPersonas();
	public Persona savePersona(Persona persona);
	public Persona findPersona(Integer id);
	public Persona deletePersona(Integer id);
	public Persona updatePersona(Persona p);
}
