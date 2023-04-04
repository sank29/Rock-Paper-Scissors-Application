package com.natwestmarkets.entity;

import javax.validation.constraints.NotBlank;

import com.natwestmarkets.exception.ChoiceException;

public class ClientRequest {
	
	@NotBlank(message = "Choice is required")
	private String choice;
	
	public ClientRequest() throws ChoiceException {
		
		 
		if(!validateChoice()) {
			
			throw new ChoiceException("Please enter valid choice");
			
		}
	} 

	private Boolean validateChoice() {
		
		if(choice.equalsIgnoreCase("Rock") || choice.equalsIgnoreCase("Paper") || choice.equalsIgnoreCase("Scissors")) {
			
			return true;
			
		}else {
			
			return false;
			
		}
	}

}
