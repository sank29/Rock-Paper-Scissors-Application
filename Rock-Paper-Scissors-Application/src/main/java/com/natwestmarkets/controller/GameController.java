package com.natwestmarkets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.natwestmarkets.entity.ClientResponse;
import com.natwestmarkets.exception.ChoiceException;
import com.natwestmarkets.service.ComputerService;

import jakarta.websocket.server.PathParam;

@RestController
public class GameController {
	
	@Autowired
	ComputerService computerService;
	
	@GetMapping("/play/{choice}")
	public ResponseEntity<ClientResponse>  getPlayerChoice(@PathVariable("choice") String choice) throws ChoiceException { 
		
		// It will going to check input ignoring lower or upper case
		
		if(choice.equalsIgnoreCase("Rock") || choice.equalsIgnoreCase("Paper") || choice.equalsIgnoreCase("Scissors")) {
			
			ClientResponse clientResponse = computerService.getGameResult(choice.toLowerCase());
			
			return new ResponseEntity<ClientResponse>(clientResponse, HttpStatus.ACCEPTED);
			
		}else {
			// Throw exception if input is not valid
			
			throw new ChoiceException("Please enter valid choice between this Rock, Paper and Scissors");
			
		} 
		
	}

}
