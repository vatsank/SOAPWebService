package com.training.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.training.domains.Donar;
import com.training.domains.DonarList;
import com.training.ifaces.DonarService;

@WebService(endpointInterface="com.training.ifaces.DonarService")
public class DonarServiceImpl  implements DonarService{

	
	private HashMap<String,List<Donar>> donarList;
	
	public DonarServiceImpl() {
		super();
		donarList = new HashMap<>();
		

	}

	@PostConstruct
	private void init(){

		List<Donar> oposDonars = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		cal.set(2017,0, 12);
		
		oposDonars.add(new Donar("Ramesh", 952020050, "male", "opos", "Chennai",new Date(cal.toInstant().toEpochMilli())));
		oposDonars.add(new Donar("Suresh", 990403060, "male", "opos", "Coimbatorei",new Date(cal.toInstant().toEpochMilli())));
		oposDonars.add(new Donar("Magesh", 45666290, "male", "opos", "Pune",new Date(cal.toInstant().toEpochMilli())));
		
		donarList.put("opos", oposDonars);
		
		System.out.println("Init Method Called");
	}

	@PreDestroy
	private void destory(){
		
		donarList.clear();
		System.out.println("Destory Method Called");
	}
	public DonarList getDonarsByGroup(String bloodGroup) throws IllegalStateException  {

		if(bloodGroup == null ) {
			throw new IllegalStateException("Date Should not be Blank");
		} else {
			
			System.out.println(donarList.get(bloodGroup.trim()));
			 
		}
		
		DonarList list = new DonarList();
				list.setDonarList(donarList.get(bloodGroup));
			
		return list;
	}


	public DonarList getAll() {

		return null;
	}

	
		
	
}


