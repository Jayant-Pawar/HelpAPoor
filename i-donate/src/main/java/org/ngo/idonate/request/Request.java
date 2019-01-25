package org.ngo.idonate.request;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.ngo.idonate.contact.NameDetails;

@Entity(name="i_request") //creates table if it is embedded db. If external DB, then table should already exist.
public class Request {

	//create table i_request(request_id int(5), request_type varchar(2), category_id int(5), org_id int(5), user_id int(5) , request_status varchar(20));

	@Id //member variable which is primary key	
	@Column(name="request_id")
	private String requestId;
	@Column(name="request_type")
	private String requestType;
	@Column(name="user_id")
	private String userId;
	@Column(name="category_id")
	private String categoryId;
	@Column(name="org_id")
	private String orgId;
	@Column(name="request_status")
	private String requestStatus;
	
	public Request()
	{
		
	}
	
	public Request(String requestId, String requestType, String userId,
			String categoryId, String orgId, String requestStatus) {
		super();
		this.requestId = requestId;
		this.requestType = requestType;
		this.userId = userId;
		this.categoryId = categoryId;
		this.orgId = orgId;
		this.requestStatus = requestStatus;
	}

	
	public String getRequestId() {
		return requestId;
	}


	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}


	public String getRequestType() {
		return requestType;
	}


	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}


	public String getOrgId() {
		return orgId;
	}


	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}


	public String getRequestStatus() {
		return requestStatus;
	}


	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}



}
