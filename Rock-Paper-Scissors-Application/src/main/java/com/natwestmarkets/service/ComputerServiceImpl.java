package com.natwestmarkets.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.natwestmarkets.entity.ClientResponse;


@Service
public class ComputerServiceImpl implements ComputerService {

	@Override
	public ClientResponse getGameResult(String choice) {
		
		return null;
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






