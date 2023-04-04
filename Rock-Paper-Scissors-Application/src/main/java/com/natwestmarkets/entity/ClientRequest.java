package com.natwestmarkets.entity;


import com.natwestmarkets.exception.ChoiceException;

public class ClientRequest {
	
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
