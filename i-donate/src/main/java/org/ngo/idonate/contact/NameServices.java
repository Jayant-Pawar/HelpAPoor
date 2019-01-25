package org.ngo.idonate.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Only one instance get created as singleton
@Service("nameServices")
public class NameServices {

	@Autowired
	private  NameRepository nameRepository;
	
	
	
	public  NameDetails getNameDetails(String userId)
	{
		//return mCategories.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return nameRepository.findByEntityId(userId);
	}
	
	public  void addNameDetails(NameDetails aNameDetails)
	{
		//mCategories.add(aCategory);
		nameRepository.save(aNameDetails);
	}
	
	public  void updateNameDetails(NameDetails aNameDetails, String id)
	{
		nameRepository.save(aNameDetails); // same method used for add or update. If row exist for id, which is prim key specified in repo definition, then update
	}

	public  void deleteNameDetails(NameDetails aNameDetails, String id) {
		
		//mCategories.removeIf(t -> t.getId().equals(id));
		nameRepository.delete(aNameDetails);;
		
	}
}
