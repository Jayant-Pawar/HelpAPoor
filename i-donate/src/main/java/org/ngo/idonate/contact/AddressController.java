package org.ngo.idonate.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AddressController {

	@Autowired
	private AddressServices addressServices; //when we are doing autowire, it is bydefault by name. 
											//Hence the name of the variable should be same as the classname starting with small letter
	
		
	@RequestMapping(method=RequestMethod.GET , value="/users/{userid}/addressdetails") //{denotes it is variable to map request @PathVariable denotes to pass variable{id} to input of method id}
	public AddressDetails getAddressDetails( @PathVariable String userid)
	{
		System.out.println("HERE");
		return addressServices.getAddressDetails(userid);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/users/{userid}/addressdetails") //method mapped to post requests happening to /categories url
	public void addAddressDetails(@RequestBody AddressDetails aAddressDetails, @PathVariable String userid) //request body converts the json representation to java
	{
		System.out.println("Adding Category");
		aAddressDetails.setEntityId(userid);
		addressServices.addAddressDetails(aAddressDetails);
	}
	
	@RequestMapping(method=RequestMethod.PUT , value="/users/{userid}/addressdetails") 
	public void updateAddress(@RequestBody AddressDetails aAddressDetails, @PathVariable String userid)
	{
		addressServices.updateAddressDetails(aAddressDetails,userid);
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value="/users/{userid}/addressdetails") 
	public void deleteAddress(@RequestBody AddressDetails aAddressDetails, @PathVariable String userid)
	{
		aAddressDetails.setAddressId(userid);
		addressServices.deleteAddressDetails(aAddressDetails, userid);
	}
}
