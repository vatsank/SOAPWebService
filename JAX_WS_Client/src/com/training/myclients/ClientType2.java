package com.training.myclients;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.training.clients.StringArray;
import com.training.clients.TravelService;

public class ClientType2 {

	//Dynamic Proxy Client
	public static void main(String[] args) {

		try {
		
			URL url = new URL("http://localhost:2020/jaxws/travel");
			   
			QName name = new QName("http://services.training.com/","TravelServiceImplService");

				     Service service = Service.create(url, name);

				      TravelService proxy = service.getPort(TravelService.class);

				              StringArray result =proxy.weekEndPlanner("SBC");
				      
				                    System.out.println(result.getItem());

		} catch (Exception e) {
        			e.printStackTrace();
		}
		 
	}

}
