package org.ngo.idonate.category;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="i_category") //creates table if it is embedded db. If external DB, then table should already exist.
public class Category {

	//create table i_category (category_id int(5), category_name varchar(50), description varchar(250), org_id int (5));

	@Id //member variable which is primary key	
	@Column(name="category_id")
	private String categoryId;
	@Column(name="category_name")
	private String categoryName;
	@Column(name="description")
	private String description;
	
	
	public Category()
	{
		
	}
	
	public Category(String id, String name, String description) {
		super();
		this.categoryId = id;
		this.categoryName = name;
		this.description = description;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String id) {
		this.categoryId = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String name) {
		this.categoryName = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
