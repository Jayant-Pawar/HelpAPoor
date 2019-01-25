package org.ngo.idonate.category;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Only one instance get created as singleton
@Service("categoryServices")
public class CategoryServices {

	@Autowired
	private  CategoryRepository categoryRepository;
	
	
	
	public  List<Category> getAllCategories()
	{
		//return mCategories;
		List<Category> lCategory = new ArrayList<Category>();
		// connect to db, run query to get all , convert rows to category and return 
		categoryRepository.findAll().forEach(lCategory ::add); // lambda expression. Iterate over each of findall and invoke add method of lCategory list
		
		return lCategory;
	}
	
	public  Category getCategory(String id)
	{
		//return mCategories.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return categoryRepository.findOne(id);
	}
	
	public  void addCategory(Category aCategory)
	{
		//mCategories.add(aCategory);
		categoryRepository.save(aCategory);
	}
	
	public  void updateCategory(Category aCategory, String id)
	{
		categoryRepository.save(aCategory); // same method used for add or update. If row exist for id, which is prim key specified in repo definition, then update
	}

	public  void deleteCategory(Category aCategory, String id) {
		
		//mCategories.removeIf(t -> t.getId().equals(id));
		categoryRepository.delete(aCategory);;
		
	}
}
