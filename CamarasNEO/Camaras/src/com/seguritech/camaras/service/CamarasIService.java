package com.seguritech.camaras.service;

import java.util.List;

import javax.ejb.Local;

import com.seguritech.camaras.dto.DelegacionDTO;

@Local
public interface CamarasIService {
	List<DelegacionDTO> getDelegaciones();
	List<DelegacionDTO> getDelegacionesByFiltro(DelegacionDTO filtro);
}
