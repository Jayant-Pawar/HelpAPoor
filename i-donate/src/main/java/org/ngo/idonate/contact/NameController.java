package org.ngo.idonate.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NameController {

	@Autowired
	private NameServices nameServices; //when we are doing autowire, it is bydefault by name. 
											//Hence the name of the variable should be same as the classname starting with small letter
	
		
	@RequestMapping(method=RequestMethod.GET , value="/users/{userid}/namedetails") //{denotes it is variable to map request @PathVariable denotes to pass variable{id} to input of method id}
	public NameDetails getNameDetails( @PathVariable String userid)
	{
		System.out.println("HERE");
		return nameServices.getNameDetails(userid);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/users/{userid}/namedetails") //method mapped to post requests happening to /categories url
	public void addNameDetails(@RequestBody NameDetails aNameDetails, @PathVariable String userid) //request body converts the json representation to java
	{
		System.out.println("Adding Category");
		aNameDetails.setEntityId(userid);
		nameServices.addNameDetails(aNameDetails);
	}
	
	@RequestMapping(method=RequestMethod.PUT , value="/users/{userid}/namedetails") 
	public void updateNameDetails(@RequestBody NameDetails aNameDetails, @PathVariable String userid)
	{
		nameServices.updateNameDetails(aNameDetails,userid);
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value="/users/{userid}/namedetails") 
	public void deleteNameDetails(@RequestBody NameDetails aNameDetails, @PathVariable String userid)
	{
		System.out.println("Deleting name details");
		aNameDetails.setNameId(userid);
		nameServices.deleteNameDetails(aNameDetails, userid);
	}
}
