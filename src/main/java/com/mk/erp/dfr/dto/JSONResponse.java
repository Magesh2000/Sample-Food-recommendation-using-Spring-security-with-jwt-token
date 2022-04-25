package com.mk.erp.dfr.dto;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Response Class
 * 
 *
 */

@Component
@Scope(value="prototype")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JSONResponse {
	
	private Integer responseCode;
	
	private String responseMessage;
	
	private Object succesObject;
	
	private Object authSuccesObject;
	
	private Object moduleSuccesObject;
	
	private String moduleMessage;

	public Integer getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public Object getSuccesObject() {
		return succesObject;
	}

	public void setSuccesObject(Object succesObject) {
		this.succesObject = succesObject;
	}

	public Object getAuthSuccesObject() {
		return authSuccesObject;
	}

	public void setAuthSuccesObject(Object authSuccesObject) {
		this.authSuccesObject = authSuccesObject;
	}

	public Object getModuleSuccesObject() {
		return moduleSuccesObject;
	}

	public void setModuleSuccesObject(Object moduleSuccesObject) {
		this.moduleSuccesObject = moduleSuccesObject;
	}

	public String getModuleMessage() {
		return moduleMessage;
	}

	public void setModuleMessage(String moduleMessage) {
		this.moduleMessage = moduleMessage;
	}
	
	

}
