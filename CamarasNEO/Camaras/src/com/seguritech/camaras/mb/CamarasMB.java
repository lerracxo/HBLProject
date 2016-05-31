package com.seguritech.camaras.mb;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.seguritech.camaras.dto.DelegacionDTO;
import com.seguritech.camaras.service.CamarasIService;

@ManagedBean
public class CamarasMB {

	@EJB
	private CamarasIService camarasService;
	
	public List<DelegacionDTO> getDelegaciones(){
		return camarasService.getDelegaciones();
	}
	
	public void setDelegaciones(List<DelegacionDTO> delegaciones){
		
	}
}
