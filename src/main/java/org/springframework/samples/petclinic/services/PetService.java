package org.springframework.samples.petclinic.services;

import java.util.Date;
import java.util.List;

import org.springframework.samples.petclinic.model.Pet;

public interface PetService {

    List<Pet> findByBirthDateBetween(Date inicio, Date fin);
    List<Pet> findAll();
	
}
