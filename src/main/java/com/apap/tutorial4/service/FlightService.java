package com.apap.tutorial4.service;

import com.apap.tutorial4.model.FlightModel;

public interface FlightService {
	void addFlight(FlightModel flight);
	
	FlightModel getFlight(Long id);
	
	void deleteFlight(FlightModel flight);
	
	void updateFlight(FlightModel flight, Long id);
	
}
