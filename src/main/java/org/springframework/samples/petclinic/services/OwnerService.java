package org.springframework.samples.petclinic.services;

import java.util.List;

import org.springframework.samples.petclinic.model.Owner;

public interface OwnerService {
	
	List<Owner> findAll();
	Owner findById(Integer id);
	void deleteOwnerById(Integer id);
	void deleteOwner(Owner owner);
	void addOwner(Owner owner);
	void updateOwner(Owner owner);    
    List<Owner> findByFirstNameLikeOrLastNameLike(String firstName, String lastName);
    List<Owner> findByOrderByLastName();

}
