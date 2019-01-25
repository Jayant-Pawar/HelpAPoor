package org.ngo.idonate.organization;

import java.util.List;

import org.springframework.data.repository.CrudRepository;



//Crud repository is an inbuilt interface which has all the CRUD operations on DB. It tables the entity and primary key type
public interface OrganizationRepository extends CrudRepository<Organization,String>	 {
	
	//public List<Organization> getOrganizationsByCategory(String categoryId);
	
	//If method name is defined in a specific way, then spring data jpa can identify the filteration criteria
	
	//public List<Organization> getOrganizationsByName(String name);
	//public List<Organization> findByName(String name); //syntax to get all courses by name. find<By/All><property to be filtered in case By is used>.
	//If defined in this specific structure, then no implementation is needed.
	
	//So, now to get the organization by category id, we have to write findBy<Object><Object element to be searched upon>
	//public List<Organization> findByCategoryCategoryId(String categoryId);
	
	public List<Organization> findByCategoryId(String categoryId);

}
