package com.seguritech.camaras.ds;

import java.util.List;

import com.seguritech.camaras.dto.MunicipioDTO;

public interface MunicipioDAO {
	List<MunicipioDTO> getMunicipios();
	List<MunicipioDTO> getMunicipios(MunicipioDTO filtro);
}
