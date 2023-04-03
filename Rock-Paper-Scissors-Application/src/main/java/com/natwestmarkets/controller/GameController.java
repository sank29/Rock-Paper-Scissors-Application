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
		
		if(choice.equalsIgnoreCase("Rock") || choice.equalsIgnoreCase("Paper") || choice.equalsIgnoreCase("Scissors")) {
			
			ClientResponse clientResponse = computerService.getGameResult(choice);
			
			return new ResponseEntity<ClientResponse>(clientResponse, HttpStatus.ACCEPTED);
			
		}else {
			
			throw new ChoiceException("Please enter valid choice between this Rock, Paper and Scissors");
			
		} 
		
	}

}
