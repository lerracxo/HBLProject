package com.seguritech.camaras.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.seguritech.camaras.ds.DelegacionDAO;
import com.seguritech.camaras.dto.DelegacionDTO;
import com.seguritech.camaras.entities.Delegacion;
import com.seguritech.camaras.service.CamarasIService;

@Stateless
@WebService
public class CamarasService implements CamarasIService{

	@EJB
	private DelegacionDAO delegacionDAO;
	
	@Override
	@WebMethod
	public List<DelegacionDTO> getDelegaciones(){
		return converterDelegaciones(delegacionDAO.getDelegaciones());
	}
	
	@Override
	@WebMethod
	public List<DelegacionDTO> getDelegacionesByFiltro(DelegacionDTO filtro){
		return converterDelegaciones(delegacionDAO.getDelegaciones(filtro));
	}
	
	private List<DelegacionDTO> converterDelegaciones(List<Delegacion> delegaciones){
		List<DelegacionDTO> delegacionesDTO = new ArrayList<DelegacionDTO>();
		
		for(Delegacion del : delegaciones){
			DelegacionDTO delegacionDTO = new DelegacionDTO();
			delegacionDTO.setId_delegacion(del.getId_delegacion());
			delegacionDTO.setNombre(del.getNombre());
			delegacionesDTO.add(delegacionDTO);
		}
		
		return delegacionesDTO;
	}
}
