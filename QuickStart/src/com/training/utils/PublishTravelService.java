package com.training.utils;

import javax.xml.ws.Endpoint;

import com.training.services.TravelServiceImpl;

public class PublishTravelService {

	public static void main(String[] args) {
	
		String baseURL = "http://localhost:2020/jaxws/travel";
		
		
		try {
			
			
			Endpoint epoint= Endpoint.publish(baseURL, new TravelServiceImpl());
			
			
			System.out.println("Application running use the following URL to Access" + baseURL);
			
			System.out.println("Press any Key to stop the service");
			
			System.in.read();
			
			epoint.stop();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
