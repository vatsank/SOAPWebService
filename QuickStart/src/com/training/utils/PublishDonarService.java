package com.training.utils;

import javax.xml.ws.Endpoint;

import com.training.services.DonarServiceImpl;

public class PublishDonarService {

	public static void main(String[] args) {
		
		try {
			
			String url = "http://localhost:2020/basic/DonarService";

			
			System.out.println("Starting Web Service Endpoint...");
			
			
			Endpoint endpoint = Endpoint.publish(url, new DonarServiceImpl());
			
			
			System.out.println("Endpoint available at " + url);
			System.out.println("Press any key to exit...");
			System.in.read();
			endpoint.stop();

			
		} catch (Exception e) {
              e.printStackTrace();
		}

	}

}
