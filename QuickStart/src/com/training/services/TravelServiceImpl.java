package com.training.services;



import javax.jws.WebParam;
import javax.jws.WebService;

import com.training.domains.TravelAgent;
import com.training.ifaces.TravelService;

@WebService(endpointInterface="com.training.ifaces.TravelService")
public class TravelServiceImpl implements TravelService {

	@Override
	public String[] weekEndPlanner(  String destination) {
		
		if(destination.equals("SBC"))
		{
		return new String[] {"Nandi Hills","Wonderla","barachuki","Mysuru"};
		}
		else{
			return new String[] {"Hotel","Movie","Mall"};
		}
	}

	@Override
	public String[] summerHoliday(String destination) {
	
		return new String[] { "ooty","Simla","Coorg","Pondicherry","Mahabs"};
		
	}

	@Override
	public TravelAgent getTravelAgent(String customerType) {
	
		 TravelAgent agent =new TravelAgent("RET101", "Ramesh",98584458, "ram@abc.com") ;
		  
		 if(customerType.equals("corp")) {
	           agent =  new TravelAgent("CORP101", "Rakesh",78585858, "rak@abc.com"); }
		  
		  return agent;
	}



}
