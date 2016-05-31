package com.seguritech.camaras.ds;

import java.util.List;

import com.seguritech.camaras.dto.ColoniaDTO;

public interface ColoniaDAO {

	List<ColoniaDTO> getColonias();
	List<ColoniaDTO> getColonias(ColoniaDTO filtro);
}
