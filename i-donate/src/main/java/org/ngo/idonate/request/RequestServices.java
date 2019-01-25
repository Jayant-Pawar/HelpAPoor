package org.ngo.idonate.request;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Only one instance get created as singleton
@Service("requestServices")
public class RequestServices {

	@Autowired
	private  RequestRepository requestRepository;
	
	
	
	public  List<Request> getAllRequests()
	{
		List<Request> lRequest = new ArrayList<Request>();
		requestRepository.findAll().forEach(lRequest ::add); // lambda expression. Iterate over each of findall and invoke add method of lCategory list
		
		return lRequest;
	}
	
	public  Request getRequest(String id)
	{
		return requestRepository.findOne(id);
	}
	
	public  void addRequest(Request aRequest)
	{
		requestRepository.save(aRequest);
	}
	
	public  void updateRequest(Request aRequest, String id, String reqId)
	{
		requestRepository.save(aRequest); 
	}

	public  void deleteRequest(Request aRequest, String id) {
		
		requestRepository.delete(aRequest);	
	}
}
