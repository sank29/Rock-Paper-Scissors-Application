package com.natwestmarkets.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.natwestmarkets.entity.ClientResponse;


@Service
public class ComputerServiceImpl implements ComputerService {
	
	// final result will be calculate here
	@Override
	public ClientResponse getGameResult(String choice) {
		
		
		// response to client
		
		ClientResponse clientResponse = new ClientResponse();
		
		
		
		// generate random choices
		
		String computerChoice = computerRandomMoves();
		
		// setting computer choice to client response, client can see the computer choice also
		
		clientResponse.setComputerChoice(computerChoice);
		
		// check player choice and computer choice is same if yes then return tie.
		
		if(choice.equals(computerChoice)) {
			
			 clientResponse.setFinalResult(computerChoice);
			 
			 return clientResponse;
			 
		}
		
		// if it is not tie then check other condition
		switch (choice) {
		
		case "rock":
			// wine scenario
			
			if(computerChoice.equals("scissors")) {
				
				clientResponse.setFinalResult("Player wins");
				
			// loose scenario
				
			}else{
				
				clientResponse.setFinalResult("Computer wins");
				
			}
			
			break;
			
		case "scissors":
			
			// wine scenario
			
			if(computerChoice.equals("paper")) {
				
				clientResponse.setFinalResult("Player wins");
				
			// loose scenario
				
			}else{
				
				clientResponse.setFinalResult("Computer wins");
				
			}
			
			break;
			
		case "paper":
			
			// wine scenario
			
			if(computerChoice.equals("rock")) {
				
				clientResponse.setFinalResult("Player wins");
				
			// loose scenario
				
			}else{
				
				clientResponse.setFinalResult("Computer wins");
				
			}
			
			break;
			
		}
		
		
		return clientResponse;
		
	}

	@Override
	public String computerRandomMoves() {
		
		// computer choices
		
		String[] computerChoice = {"rock","paper","scissors"};
		
		// It will return the random choices
		return computerChoice[generateRandomValue()];
		
	}
	
	// It will going to generate random values from 0 to 2.
	public Integer generateRandomValue() {
		
		Random randomClass = new Random();
		
		int min = 0;
		
		int max = 2;
		
		Integer randomNumber = randomClass.nextInt(max - min + 1) + min;
		
		return randomNumber;
		
	}

}






