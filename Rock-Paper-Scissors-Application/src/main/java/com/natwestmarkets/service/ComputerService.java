package com.natwestmarkets.service;

import com.natwestmarkets.entity.ClientResponse;

public interface ComputerService {
	
	String computerRandomMoves();

	ClientResponse getGameResult(String choice);

}
