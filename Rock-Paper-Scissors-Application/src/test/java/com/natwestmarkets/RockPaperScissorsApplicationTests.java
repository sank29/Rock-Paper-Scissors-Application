package com.natwestmarkets;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.natwestmarkets.entity.ClientResponse;
import com.natwestmarkets.service.ComputerService;
import com.natwestmarkets.service.ComputerServiceImpl;

@SpringBootTest
class RockPaperScissorsApplicationTests {
	
	ComputerService computerService = new ComputerServiceImpl();
	
	@Test
	public void computerRandomMovesTest() {
		
		String result = computerService.computerRandomMoves();
		
		List<String> allChoices = new ArrayList<>();
		
		allChoices.add("paper");
		allChoices.add("rock");
		allChoices.add("scissors");
		
		// it is checking getting result is present in this array or not
		
		assertTrue(allChoices.contains(result));
		
	}
	
	@Test
	public void generateRandomValueTest() {
		
		Integer number = computerService.generateRandomValue();
		
		// it is checking function is generating random number correctly or not
		
		assertTrue(0 <= number && number <= 2);
		
	}
	
	@Test
	public void getGameResultTest() {
		
		// if player Response = rock and computer response is scissors the player should win
		
		String playerResponse = "rock";
		
		ClientResponse finalObject1 = computerService.getGameResult(playerResponse);
		
		if(finalObject1.getComputerChoice().equals("scissors")) {
			
			
			assertTrue(finalObject1.getFinalResult().equals("Player wins"));
			
		}
		
		// if player Response = scissors and computer response is paper the player should win
		
		playerResponse = "scissors";
		
		ClientResponse finalObject2 = computerService.getGameResult(playerResponse);
		
		if(finalObject2.getComputerChoice().equals("paper")) {
			
			
			assertTrue(finalObject2.getFinalResult().equals("Player wins"));
			
		}
		
		// if player Response = paper and computer response is rock the player should win
		
		playerResponse = "paper";
		
		ClientResponse finalObject3 = computerService.getGameResult(playerResponse);
				
		if(finalObject3.getComputerChoice().equals("rock")) {
			
			
			assertTrue(finalObject3.getFinalResult().equals("Player wins"));
					
		}
		
		// if player Response = scissors and computer response is rock the computer should win
		
		playerResponse = "scissors";
		
		ClientResponse finalObject4 = computerService.getGameResult(playerResponse);
		
		if(finalObject4.getComputerChoice().equals("rock")) {
			
			
			assertTrue(finalObject4.getFinalResult().equals("Computer wins"));
			
		}
		
		// if player Response = paper and computer response is paper the computer should win
		
		playerResponse = "paper";
		
		ClientResponse finalObject5 = computerService.getGameResult(playerResponse);
		
		if(finalObject5.getComputerChoice().equals("scissors")) {
			
			
			assertTrue(finalObject5.getFinalResult().equals("Computer wins"));
			
		}
		
		// if player Response = rock and computer response is paper the computer should win
		
		playerResponse = "rock";
		
		ClientResponse finalObject6 = computerService.getGameResult(playerResponse);
				
		if(finalObject6.getComputerChoice().equals("paper")) {
			
			
			assertTrue(finalObject6.getFinalResult().equals("Computer wins"));
					
		}
		
		// if player Response = rock and computer response is rock then match will be tie
		
		playerResponse = "rock";
		
		ClientResponse finalObject7 = computerService.getGameResult(playerResponse);
				
		if(finalObject7.getComputerChoice().equals("rock")) {
			
			
			assertTrue(finalObject7.getFinalResult().equals("It is a tie"));
					
		}
		
		// if player Response = paper and computer response is paper then match will be tie
		
		playerResponse = "paper";
		
		ClientResponse finalObject8 = computerService.getGameResult(playerResponse);
				
		if(finalObject8.getComputerChoice().equals("paper")) {
			
			
			assertTrue(finalObject8.getFinalResult().equals("It is a tie"));
					
		}
		
		// if player Response = scissors and computer response is scissors then match will be tie
		
		playerResponse = "scissors";
		
		ClientResponse finalObject9 = computerService.getGameResult(playerResponse);
				
		if(finalObject9.getComputerChoice().equals("scissors")) {
			
			assertTrue(finalObject9.getFinalResult().equals("It is a tie"));
					
		}
		
		
		
	}
	
	


}





