package org.ngo.idonate.contact;

import org.springframework.data.repository.CrudRepository;



//Crud repository is an inbuilt interface which has all the CRUD operations on DB. It tables the entity and primary key type
public interface AddressRepository extends CrudRepository<AddressDetails,String>	 {

	public AddressDetails findByEntityId(String userId);
	
}
