package com.training.domains;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder= {"agentName","mobileNumber","email","agentCode"})
@XmlAccessorType(XmlAccessType.FIELD)


public class TravelAgent {


	@XmlElement
	private String agentCode;
	@XmlElement
	private String agentName;
	@XmlElement
	private long mobileNumber;
	@XmlElement
	private String email;
	
	public TravelAgent() {
		super();
	}

	public TravelAgent(String agentCode, String agentName, long mobileNumber, String email) {
		super();
		this.agentCode = agentCode;
		this.agentName = agentName;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}


	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
