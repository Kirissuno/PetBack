package org.springframework.samples.petclinic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.repository.OwnerRepository;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceImpl implements OwnerService {
	@Autowired
	OwnerRepository orepo;
	
	@Override
	public List<Owner> findAll() {
		return orepo.findAll();
	}

	@Override
	public Owner findById(Integer id) {
		return orepo.findById(id);
	}

	@Override
	public void deleteOwnerById(Integer id) {
		orepo.delete(id);
	}

	@Override
	public void deleteOwner(Owner owner) {
		orepo.delete(owner);
	}

	@Override
	public void addOwner(Owner owner) {
		Owner ow = orepo.findById(owner.getId());
		if(ow != null) {
			throw new RuntimeException("Ya existe un owner con esos datos, actualizalos.");
		}else {
			orepo.save(owner);
		}
	}

	@Override
	public void updateOwner(Owner owner) {
		Owner ow = orepo.findById(owner.getId());
		if(ow != null) {
			orepo.save(owner);
		}else {
			throw new RuntimeException("El owner a actualizar no existe, intenta agregarlo.");
		}
	}

	@Override
	public List<Owner> findByFirstNameLikeOrLastNameLike(String firstName, String lastName) {
		return orepo.findByFirstNameLikeOrLastNameLike(firstName, lastName);
	}

	@Override
	public List<Owner> findByOrderByLastName() {
		return orepo.findByOrderByLastName();
	}

}
