package com.training.ifaces;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import com.training.domains.DonarList;

@WebService
@SOAPBinding(style=Style.DOCUMENT ,use=Use.LITERAL,parameterStyle=ParameterStyle.WRAPPED)

public interface DonarService {

	@WebMethod(operationName="getByGroup")
	@WebResult(name="donars")
	public DonarList getDonarsByGroup(@WebParam(name="bloodGroup")
	                            String bloodGroup );
	public DonarList getAll();
	
}
