package com.cispal.persona.repository;

import java.util.List;

import com.cispal.persona.bean.Persona;

public interface PersonaRepository {

	
		public List<Persona> getPersonas();
		public Persona savePersona(Persona persona);
		public Persona findPersona(Integer id);
		public Persona deletePersona(Integer id);
		public Persona updatePersona(Persona p);

	
	
}
