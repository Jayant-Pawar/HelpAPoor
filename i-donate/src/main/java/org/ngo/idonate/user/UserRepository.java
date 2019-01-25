package org.ngo.idonate.user;

import org.springframework.data.repository.CrudRepository;



//Crud repository is an inbuilt interface which has all the CRUD operations on DB. It tables the entity and primary key type
public interface UserRepository extends CrudRepository<User,String>	 {
	
	
}
