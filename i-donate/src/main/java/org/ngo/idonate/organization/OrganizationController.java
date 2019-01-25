package org.ngo.idonate.organization;

import java.util.List;

import org.ngo.idonate.category.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrganizationController {

	@Autowired
	private OrganizationServices organizationServices; //when we are doing autowire, it is bydefault by name. 
											//Hence the name of the variable should be same as the classname starting with small letter
	
	
	@RequestMapping(method=RequestMethod.GET , value="/organizations")
	public List<Organization> getAllOrganizations()
	{
		System.out.println("Getting all organization");
		return organizationServices.getAllOrganizations();
	}
	
	@RequestMapping(method=RequestMethod.GET , value="/organizations/{id}") //{denotes it is variable to map request @PathVariable denotes to pass variable{id} to input of method id}
	public Organization getOrganization(@PathVariable String id)
	{
		return organizationServices.getOrganization(id);
	}
	
	@RequestMapping(method=RequestMethod.GET , value="/categories/{id}/organizations")
	public List<Organization> getAllOrganizationsForCategory(@PathVariable String id)
	{
		System.out.println("Getting all organization : controller : "+id);
		return organizationServices.getAllOrganizationsForCategory(id);
	}
	
	@RequestMapping(method=RequestMethod.GET , value="/categories/{categoryId}/organizations/{id}") //{denotes it is variable to map request @PathVariable denotes to pass variable{id} to input of method id}
	public Organization getOrganizationForCategory(@PathVariable String id)
	{
		return organizationServices.getOrganization(id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/categories/{categoryId}/organizations") //method mapped to post requests happening to /categories url
	public void addCategory(@RequestBody Organization aOrganization, @PathVariable String categoryId) //request body converts the json representation to java
	{
		System.out.println("Adding Organization");
	//	aOrganization.setCategory(new Category(categoryId, "", ""));
		organizationServices.addOrganization(aOrganization);
	}
	
	@RequestMapping(method=RequestMethod.PUT , value="/categories/{categoryId}/organizations/{id}") 
	public void updateCategory(@RequestBody Organization aOrganization, @PathVariable String categoryId,@PathVariable String id)
	{
	//	aOrganization.setCategory(new Category(categoryId, "" ,""));
		organizationServices.updateOrganization(aOrganization,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value="/categories/{categoryId}/organizations/{id}") 
	public void deleteCategory(@RequestBody Organization aCategory, @PathVariable String id)
	{
		
		organizationServices.deleteOrganization(aCategory,id);
	}
}
