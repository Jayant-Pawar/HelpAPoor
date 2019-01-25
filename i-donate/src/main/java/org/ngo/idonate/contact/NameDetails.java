package org.ngo.idonate.contact;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="i_name_data") //creates table if it is embedded db. If external DB, then table should already exist.
public class NameDetails {

	//create table i_name_data(name_id int(5), entity_type varchar(20), entity_id int(5), name_line varchar(250), gender char(1) , contact_number varchar(20), email varchar(50));
	@Id
	@Column(name="name_id")
	private String nameId;
	@Column(name="entity_type")
	private String entityType;
	@Column(name="entity_id")
	private String entityId;
	@Column(name="name_line")
	private String nameLine;
	@Column(name="gender")
	private char gender;
	@Column(name="contact_number")
	private String contactNo;
	@Column(name="email")
	private String email;
	
	
	public NameDetails()
	{
		
	}
	
	
	public NameDetails(String nameId, String entityType, String entityId,
			String nameLine, char gender, String contactNo, String email) {
		super();
		this.nameId = nameId;
		this.entityType = entityType;
		this.entityId = entityId;
		this.nameLine = nameLine;
		this.gender = gender;
		this.contactNo = contactNo;
		this.email = email;
	}
	
	
	public String getNameId() {
		return nameId;
	}
	public void setNameId(String nameId) {
		this.nameId = nameId;
	}
	
	public String getEntityType() {
		return entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	
	public String getEntityId() {
		return entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}
	
	public String getNameLine() {
		return nameLine;
	}
	public void setNameLine(String nameLine) {
		this.nameLine = nameLine;
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
