package org.springframework.samples.petclinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.dto.OfertaDTO;
import org.springframework.samples.petclinic.repository.OfertaRepository;
import org.springframework.samples.petclinic.services.OfertaService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OfertaController {
	
	@Autowired
	private OfertaService service;
	
	@GetMapping("/oferta")
	public List<OfertaDTO> getAll() {
		return service.findAll();
	}
	
	@PostMapping("/oferta")
	public void create(@RequestBody OfertaDTO oferta) {
		service.addOferta(oferta);
	}
	
	@GetMapping("/oferta/{titulo}")
	public OfertaDTO getOne(@PathVariable String titulo) {
		return service.findByTitulo(titulo);
	}
	
	@PutMapping("/oferta/{titulo}")
	public void update(@PathVariable String titulo, @RequestBody OfertaDTO ofertanueva) {
		service.updateOfertaByTitulo(titulo, ofertanueva);
	}
	
	@DeleteMapping("/oferta/{titulo}")
	public void delete(@PathVariable String titulo) {
		service.deleteByTitulo(titulo);
	}
}
