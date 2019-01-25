package org.ngo.idonate.contact;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="i_address_data") //creates table if it is embedded db. If external DB, then table should already exist.
public class AddressDetails {

	//create table i_address_data(address_id int(5),entity_type varchar(20), entity_id int(5), address_line varchar(250), state varchar(50), zipcode varchar(20));

	@Id
	@Column(name="address_id")
	private String addressId;
	@Column(name="entity_type")
	private String entityType;
	@Column(name="entity_id")
	private String entityId;
	@Column(name="address_line")
	private String addressLine;
	private String state;
	private String zipcode;

	
	
	public AddressDetails()
	{
		
	}
	
	public AddressDetails(String addressId, String entityType, String entityId,
			String addressLine, String state, String zipcode) {
		super();
		this.addressId = addressId;
		this.entityType = entityType;
		this.entityId = entityId;
		this.addressLine = addressLine;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
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

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	
	
}
