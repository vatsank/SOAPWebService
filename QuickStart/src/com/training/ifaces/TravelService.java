package com.training.ifaces;


import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.training.domains.TravelAgent;



@WebService
@SOAPBinding(style=Style.RPC,use=Use.LITERAL)
public interface TravelService {

	@WebResult( name="locations")
	 public String[] weekEndPlanner(@WebParam(name="destination") String destination);
	
	@WebResult( name="summer_locations")  
	public String[] summerHoliday(@WebParam(name="destination") String destination);
	
	@WebResult(name="Suggested_Travel_Agent")
	public TravelAgent  getTravelAgent(@WebParam(name="customerType") String customerType);
	
	
	
}
