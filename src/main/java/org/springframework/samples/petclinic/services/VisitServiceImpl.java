package org.springframework.samples.petclinic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Visit;
import org.springframework.samples.petclinic.repository.VisitRepository;
import org.springframework.stereotype.Service;

@Service
public class VisitServiceImpl implements VisitService {
	@Autowired
	private VisitRepository virepo;

	@Override
	public List<Visit> findByPetId(Integer petId) {
		return virepo.findByPetId(petId);
	}

	@Override
	public List<Visit> findAll() {
		return virepo.findAll();
	}

	@Override
	public Visit findById(Integer id) {
		return virepo.findOne(id);
	}

	@Override
	public void deleteVisit(Visit visit) {
		virepo.delete(visit);
	}

	@Override
	public void deleteVisitById(Integer id) {
		virepo.delete(id);
	}

	@Override
	public void addVisit(Visit visit) {
		virepo.save(visit);
	}

	@Override
	public void updateVisit(Visit visit) {
		virepo.save(visit);
	}

	@Override
	public List<Visit> findTop4ByOrderByDateDesc() {
		return virepo.findTop4ByOrderByDateDesc();
	}
	
	
	
}
