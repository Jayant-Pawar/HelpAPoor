package org.ngo.idonate.organization;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Only one instance get created as singleton
@Service
public class OrganizationServices {

	@Autowired
	private  OrganizationRepository organizationRepository;
	
	
	
	public  List<Organization> getAllOrganizationsForCategory(String categoryId){
		
		System.out.println("Getting all organization for category :"+categoryId);
		List<Organization> lOrganization = new ArrayList<Organization>();
		
		organizationRepository.findByCategoryId(categoryId).forEach(lOrganization ::add); // lambda expression. Iterate over each of findall and invoke add method of lCategory list
		
		return lOrganization;
	}
	
	public  Organization getOrganization(String id)
	{
		//return mCategories.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return organizationRepository.findOne(id);
	}
	
	public  void addOrganization(Organization aOrganization)
	{
		//mCategories.add(aCategory);
		organizationRepository.save(aOrganization);
	}
	
	public  void updateOrganization(Organization aCategory, String id)
	{
		organizationRepository.save(aCategory); // same method used for add or update. If row exist for id, which is prim key specified in repo definition, then update
	}

	public  void deleteOrganization(Organization aCategory, String id) {
		
		//mCategories.removeIf(t -> t.getId().equals(id));
		organizationRepository.delete(aCategory);;
		
	}

	public List<Organization> getAllOrganizations() {
		
		List<Organization> lOrganization = new ArrayList<Organization>();
		organizationRepository.findAll().forEach(lOrganization ::add); // lambda expression. Iterate over each of findall and invoke add method of lCategory list
		return lOrganization;
	}
}
