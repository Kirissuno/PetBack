package org.springframework.samples.petclinic.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.dto.OfertaDTO;
import org.springframework.samples.petclinic.model.Oferta;
import org.springframework.samples.petclinic.repository.OfertaRepository;
import org.springframework.stereotype.Service;

@Service
public class OfertaServiceImpl implements OfertaService{
	@Autowired
	private OfertaRepository orepo;

	@Override
	public OfertaDTO findByTitulo(String titulo) {
		Oferta oferta = orepo.findByTitulo(titulo);
		return new OfertaDTO(oferta.getTitulo(), oferta.getDetalle(), oferta.getDescuento(), oferta.getFecha_caducidad());
	}

	@Override
	public List<OfertaDTO> findAll() {
		List<Oferta> ofertas = orepo.findAll();
		List<OfertaDTO> ofertasDTO = new ArrayList<OfertaDTO>();
		for(Oferta oferta : ofertas) {
			ofertasDTO.add(new OfertaDTO(oferta.getTitulo(), oferta.getDetalle(), oferta.getDescuento(), oferta.getFecha_caducidad()));
		}
		return ofertasDTO;
	}

	@Override
	public void addOferta(OfertaDTO oferta) {
		Oferta ofertarepo = new Oferta(oferta.getTitulo(), oferta.getDetalle(), oferta.getDescuento(), oferta.getFecha_caducidad());
		orepo.save(ofertarepo);		
	}

	@Override
	public void deleteByTitulo(String titulo) {
		Oferta oferta = orepo.findByTitulo(titulo);
		if(oferta.getTitulo() != null) {
			orepo.delete(oferta);		
		}else {
			throw new RuntimeException("Esa oferta no existe");
		}
	}

	@Override
	public void updateOfertaByTitulo(String titulo, OfertaDTO oferta) {
		Oferta ofertarepo = orepo.findByTitulo(titulo);
		if(ofertarepo.getTitulo() != null || ofertarepo.getTitulo() != "undefined") {
			ofertarepo.setDescuento(oferta.getDescuento());
			ofertarepo.setDetalle(oferta.getDetalle());
			ofertarepo.setFecha_caducidad(oferta.getFecha_caducidad());
			ofertarepo.setTitulo(oferta.getTitulo());
			orepo.save(ofertarepo);
		}else {
			throw new RuntimeException("Error al actualizarx");
		}
		
	}
	
	

}
