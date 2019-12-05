package org.springframework.samples.petclinic.services;

import java.util.List;

import org.springframework.samples.petclinic.dto.OfertaDTO;

public interface OfertaService {
	
	OfertaDTO findByTitulo(String titulo);
	List<OfertaDTO> findAll();
	void addOferta(OfertaDTO oferta);
	void deleteByTitulo(String titulo);
	void updateOfertaByTitulo(String titulo, OfertaDTO oferta);

}
