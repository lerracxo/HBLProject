package com.seguritech.camaras.ds;

import java.util.List;

import com.seguritech.camaras.dto.CalleDTO;

public interface CalleDAO {

	List<CalleDTO> getCalles();
	List<CalleDTO> getCalles(CalleDTO filtro);
}
