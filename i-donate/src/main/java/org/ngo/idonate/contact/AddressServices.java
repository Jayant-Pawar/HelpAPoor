package org.ngo.idonate.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Only one instance get created as singleton
@Service("addressServices")//annotation tells springboot to register this bean as service.
public class AddressServices {

	@Autowired
	private  AddressRepository addressRepository;
	
	
	
	public  AddressDetails getAddressDetails(String userId)
	{
		//return mCategories.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return addressRepository.findByEntityId(userId);
	}
	
	public  void addAddressDetails(AddressDetails aAddressDetails)
	{
		addressRepository.save(aAddressDetails);
	}
	
	public  void updateAddressDetails(AddressDetails aAddressDetails, String id)
	{
		addressRepository.save(aAddressDetails); // same method used for add or update. If row exist for id, which is prim key specified in repo definition, then update
	}

	public  void deleteAddressDetails(AddressDetails aAddressDetails, String id) {
		
		//mCategories.removeIf(t -> t.getId().equals(id));
		addressRepository.delete(aAddressDetails);
		
	}
}
