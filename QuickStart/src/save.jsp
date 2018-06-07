<%@page import="com.training.clients.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
<jsp:useBean id="prdBean" class="com.training.clients.Product" scope="request"></jsp:useBean>
</head>
<body>
<jsp:setProperty property="*" name="prdBean"/>
<%

  OrderManagerImplService service = new OrderManagerImplService();

           OrderManager proxy =              service.getOrderManagerImplPort();
           
             
          boolean result =  proxy.addStock(prdBean);
           
          if(result)
        	  out.println("One Item Added");
          else out.print("Some error try again");
%>
</body>
</html>