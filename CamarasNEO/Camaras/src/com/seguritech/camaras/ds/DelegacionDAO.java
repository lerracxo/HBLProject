package com.seguritech.camaras.ds;

import java.util.List;

import com.seguritech.camaras.dto.DelegacionDTO;
import com.seguritech.camaras.entities.Delegacion;

public interface DelegacionDAO {
	
	
	List<Delegacion> getDelegaciones();
	
	List<Delegacion> getDelegaciones(DelegacionDTO filtro);
}
