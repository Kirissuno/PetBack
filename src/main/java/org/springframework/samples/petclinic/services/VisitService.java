package org.springframework.samples.petclinic.services;

import java.util.List;

import org.springframework.samples.petclinic.model.Visit;

public interface VisitService {
	
    List<Visit> findByPetId(Integer petId);
    List<Visit> findAll();
    Visit findById(Integer id);
    void deleteVisit(Visit visit);
    void deleteVisitById(Integer id);
    void addVisit(Visit visit);
    void updateVisit(Visit visit);
    List<Visit> findTop4ByOrderByDateDesc();


}
