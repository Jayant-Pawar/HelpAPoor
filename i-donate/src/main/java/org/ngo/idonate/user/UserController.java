package org.ngo.idonate.user;

import java.util.List;

import org.ngo.idonate.contact.AddressController;
import org.ngo.idonate.contact.NameController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class UserController {

	@Autowired
	private UserServices userServices; //when we are doing autowire, it is bydefault by name. 
											//Hence the name of the variable should be same as the classname starting with small letter
	
	@RequestMapping("/users")
	public List<User> getAllUsers()
	{
		return userServices.getAllUsers();
	}
	
	@RequestMapping("/users/{id}") //{denotes it is variable to map request @PathVariable denotes to pass variable{id} to input of method id}
	public User getUser(@PathVariable String id)
	{
		System.out.println("HERE");
		return userServices.getUser(id);
	}
	
	
	
	@RequestMapping(method=RequestMethod.POST , value="/users") //method mapped to post requests happening to /categories url
	public void addUser(@RequestBody User aUser) //request body converts the json representation to java
	{
		System.out.println("Adding User");
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		
		if(aUser.getNameDetails() != null && aUser.getNameDetails().getNameId() !=null )
		{
			restTemplate.postForLocation("http://localhost:8080/users/"+aUser.getUserId()+"/namedetails", aUser.getNameDetails());}
		if(aUser.getAddressDetails() != null && aUser.getAddressDetails().getAddressId() != null)
		{
			restTemplate.postForLocation("http://localhost:8080/users/"+aUser.getUserId()+"/addressdetails", aUser.getAddressDetails());
		}
		userServices.addUser(aUser);
	}
	
	@RequestMapping(method=RequestMethod.PUT , value="/users/{id}") 
	public void updateUser(@RequestBody User aUser, @PathVariable String id)
	{
		userServices.updateUser(aUser,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value="/users/{id}") 
	public void deleteUser(@RequestBody User aUser, @PathVariable String id)
	{
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		if(aUser.getNameDetails() != null && aUser.getNameDetails().getNameId() !=null )
		{
			restTemplate.delete("http://localhost:8080/users/"+aUser.getUserId()+"/namedetails", aUser.getNameDetails());
		}
		if(aUser.getAddressDetails() != null && aUser.getAddressDetails().getAddressId() != null)
		{
			restTemplate.delete("http://localhost:8080/users/"+aUser.getUserId()+"/addressdetails", aUser.getAddressDetails());
		}
		userServices.deleteUser(aUser,id);
	}
}
