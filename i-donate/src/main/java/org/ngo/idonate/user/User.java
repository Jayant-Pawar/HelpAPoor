package org.ngo.idonate.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.ngo.idonate.contact.AddressDetails;
import org.ngo.idonate.contact.NameDetails;

@Entity(name="i_user") //creates table if it is embedded db. If external DB, then table should already exist.
public class User {

	//create table i_user (user_id int(5), user_name varchar(50), role varchar(50));

	@Id //member variable which is primary key	
	@Column(name="user_id")
	private String userId;
	@Column(name="user_name")
	private String userName;
	@Column(name="role")
	private String userRole;
	//@Column(name="name_id")
	//private String nameId;
	//@Column(name="address_id")
	//private String addressId;
	@OneToOne
	@JoinColumn(name="name_id")
	private NameDetails nameDetails;

	@OneToOne
	@JoinColumn(name="address_id")
	private AddressDetails addressDetails;
	
	public User()
	{
		
	}
	
	public User(String id, String name, String role, String nameId, String addressId) {
		super();
		this.userId = id;
		this.userName = name;
		this.userRole = role;
		//this.nameId=nameId;
		//this.addressId=addressId;
		this.nameDetails= new NameDetails(nameId, "","","",' ',"","");
		this.addressDetails= new AddressDetails(addressId, "", "","","","");
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String id) {
		this.userId = id;
	}
	public String getUserName() {
		return userName;
	}
	public void getUserName(String name) {
		this.userName = name;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String role) {
		this.userRole = role;
	}

	/*public String getNameId() {
		return nameId;
	}

	public void setNameId(String nameId) {
		this.nameId = nameId;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}*/
	
	public NameDetails getNameDetails() {
		return nameDetails;
	}

	public void setNameDetails(NameDetails nameDetails) {
		this.nameDetails = nameDetails;
	}

	public AddressDetails getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(AddressDetails addressDetails) {
		this.addressDetails = addressDetails;
	}}
