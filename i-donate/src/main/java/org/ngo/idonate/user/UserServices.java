package org.ngo.idonate.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Only one instance get created as singleton
@Service("userServices")
public class UserServices {

	@Autowired
	private  UserRepository userRepository;
	
	
	
	public  List<User> getAllUsers()
	{
		//return mCategories;
		List<User> lUser = new ArrayList<User>();
		// connect to db, run query to get all , convert rows to category and return 
		userRepository.findAll().forEach(lUser ::add); // lambda expression. Iterate over each of findall and invoke add method of lCategory list
		
		return lUser;
	}
	
	public  User getUser(String id)
	{
		//return mCategories.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return userRepository.findOne(id);
	}
	
	public  void addUser(User aUser)
	{
		//mCategories.add(aCategory);
		userRepository.save(aUser);
	}
	
	public  void updateUser(User aUser, String id)
	{
		userRepository.save(aUser); // same method used for add or update. If row exist for id, which is prim key specified in repo definition, then update
	}

	public  void deleteUser(User aUser, String id) {
		
		//mCategories.removeIf(t -> t.getId().equals(id));
		userRepository.delete(aUser);
		
	}
}
