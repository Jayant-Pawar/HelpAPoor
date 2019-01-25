package org.ngo.idonate.request;

import java.util.List;

import org.ngo.idonate.contact.NameDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RequestController {

	@Autowired
	private RequestServices requestServices; //when we are doing autowire, it is bydefault by name. 
											//Hence the name of the variable should be same as the classname starting with small letter
	
	@RequestMapping("/requests")
	public List<Request> getAllRequests()
	{
		return requestServices.getAllRequests();
	}
	
	@RequestMapping("/requests/{id}") //{denotes it is variable to map request @PathVariable denotes to pass variable{id} to input of method id}
	public Request getUser(@PathVariable String id)
	{
		System.out.println("HERE");
		return requestServices.getRequest(id);
	}
	
	
	
	@RequestMapping(method=RequestMethod.POST , value="/users/{userId}/requests") //method mapped to post requests happening to /categories url
	public void addUser(@RequestBody Request aRequest, @PathVariable String userId) 
	{
		aRequest.setUserId(userId);
		requestServices.addRequest(aRequest);
	}
	
	@RequestMapping(method=RequestMethod.PUT , value="/users/{id}/requests/{reqId}") 
	public void updateUser(@RequestBody Request aUser, @PathVariable String id, @PathVariable String reqId)
	{
		
		requestServices.updateRequest(aUser,id, reqId);
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value="/users/{id}/requests/{reqId}") 
	public void deleteUser(@RequestBody Request aUser, @PathVariable String reqId)
	{
		
		requestServices.deleteRequest(aUser, reqId);
	}
}
