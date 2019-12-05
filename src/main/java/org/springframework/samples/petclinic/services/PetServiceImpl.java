package org.springframework.samples.petclinic.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.repository.PetRepository;
import org.springframework.stereotype.Service;

@Service
public class PetServiceImpl implements PetService {
	@Autowired
	PetRepository prepo;

	@Override
	public List<Pet> findByBirthDateBetween(Date inicio, Date fin) {
	    return prepo.findByBirthDateBetween(inicio, fin);
	}

	@Override
	public List<Pet> findAll() {
		return prepo.findAll();
	}


}
