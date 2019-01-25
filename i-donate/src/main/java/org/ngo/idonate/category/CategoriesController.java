package org.ngo.idonate.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CategoriesController {

	@Autowired
	private CategoryServices categoryServices; //when we are doing autowire, it is bydefault by name. 
											//Hence the name of the variable should be same as the classname starting with small letter
	
	@RequestMapping("/categories")
	public List<Category> getAllCategories()
	{
		return categoryServices.getAllCategories();
	}
	
	@RequestMapping("/categories/{id}") //{denotes it is variable to map request @PathVariable denotes to pass variable{id} to input of method id}
	public Category getCategory(@PathVariable String id)
	{
		System.out.println("HERE");
		return categoryServices.getCategory(id);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/categories") //method mapped to post requests happening to /categories url
	public void addCategory(@RequestBody Category aCategory) //request body converts the json representation to java
	{
		System.out.println("Adding Category");
		categoryServices.addCategory(aCategory);
	}
	
	@RequestMapping(method=RequestMethod.PUT , value="/categories/{id}") 
	public void updateCategory(@RequestBody Category aCategory, @PathVariable String id)
	{
		categoryServices.updateCategory(aCategory,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value="/categories/{id}") 
	public void deleteCategory(@RequestBody Category aCategory, @PathVariable String id)
	{
		
		categoryServices.deleteCategory(aCategory,id);
	}
}
