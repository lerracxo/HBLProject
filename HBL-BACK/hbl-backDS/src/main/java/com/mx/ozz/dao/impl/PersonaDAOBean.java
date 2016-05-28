package com.mx.ozz.dao.impl;

import javax.ejb.Stateless;

import com.mx.ozz.dao.PersonaDAO;
import com.mx.ozz.entity.Persona;

@Stateless(name="PersonaDAOBean", mappedName="PersonaDAOBean")
public class PersonaDAOBean extends GenericDAOBean<Persona,Long> implements PersonaDAO{

	public void crear() {
		// TODO Auto-generated method stub
		
	}
	
}
