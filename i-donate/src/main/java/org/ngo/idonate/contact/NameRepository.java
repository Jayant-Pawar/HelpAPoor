package org.ngo.idonate.contact;

import org.springframework.data.repository.CrudRepository;



//Crud repository is an inbuilt interface which has all the CRUD operations on DB. It tables the entity and primary key type
public interface NameRepository extends CrudRepository<NameDetails,String>	 {

	public NameDetails findByEntityId(String userId);
	
}
