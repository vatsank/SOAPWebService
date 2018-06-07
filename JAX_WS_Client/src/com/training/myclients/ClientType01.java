package com.training.myclients;

import java.net.MalformedURLException;
import java.net.URL;


import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.training.clients.StringArray;
import com.training.clients.TravelAgent;
import com.training.clients.TravelService;
import com.training.clients.TravelServiceImplService;

public class ClientType01 {
	
	//Wrapper Style

	public static void main(String[] args) {

		
		 try {
		
			 TravelServiceImplService service = new TravelServiceImplService();
			 
			  TravelService proxy = service.getTravelServiceImplPort();
			 
			   TravelAgent agent = proxy.getTravelAgent("retail");
			   
			   System.out.println(agent.getAgentCode());
			   System.out.println(agent.getAgentName());
			   System.out.println(agent.getMobileNumber());
					
		 } catch (Exception  e) {
		
			 e.printStackTrace();
		}
		 
		 

	}

}
