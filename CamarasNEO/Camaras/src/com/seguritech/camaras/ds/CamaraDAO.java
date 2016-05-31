package com.seguritech.camaras.ds;

import java.util.List;

import com.seguritech.camaras.dto.CamaraDTO;

public interface CamaraDAO {

	List<CamaraDTO> getCamaras();
	List<CamaraDTO> getCamaras(CamaraDTO filtro);
}
