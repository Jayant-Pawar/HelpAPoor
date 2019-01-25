package org.ngo.idonate.organization;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.ngo.idonate.category.Category;

@Entity (name="i_organization") //creates table JPA
public class Organization {

	//create table i_organization(org_id int(5), org_name varchar(50), description varchar(50))

	@Id//member variable which is primary key
	@Column(name="org_id")
	private String orgId;
	
	@Column(name="org_name")
	private String orgName;
	
	private String description;

	@Column(name="category_id")
	private String categoryId;
	


//	@ManyToOne
//	private Category category;//many to one relationship. one cat can be in multiple org
	
	
	
	
	public Organization()
	{
		
	}
	
	public Organization(String id, String name, String description, String categoryId) {
		super();
		this.orgId = id;
		this.orgName = name;
		this.description = description;
		this.categoryId=categoryId;
	//	this.category = new Category(categoryId, "", "");
	}
	
	
	public String getId() {
		return orgId;
	}
	public void setId(String id) {
		this.orgId = id;
	}
	
	public String getName() {
		return orgName;
	}
	public void setName(String name) {
		this.orgName = name;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	/*public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}*/
	
	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
}
