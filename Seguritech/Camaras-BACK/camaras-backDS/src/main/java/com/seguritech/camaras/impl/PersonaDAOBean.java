package com.seguritech.camaras.impl;

import javax.ejb.Stateless;

import com.seguritech.camaras.dao.PersonaDAO;
import com.seguritech.camaras.entity.Persona;

@Stateless(name="PersonaDAOBean", mappedName="PersonaDAOBean")
public class PersonaDAOBean extends GenericDAOBean<Persona,Long> implements PersonaDAO{

	public void crear() {
		// TODO Auto-generated method stub
		
	}
	
}
