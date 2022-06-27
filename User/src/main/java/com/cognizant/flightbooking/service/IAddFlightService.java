package com.cognizant.flightbooking.service;

import java.util.Date;
import java.util.List;

import com.cognizant.flightbooking.entity.AddFlightDetails;

public interface IAddFlightService {

	AddFlightDetails bookFlight(AddFlightDetails addFlight);

	
	
	
	
	List<AddFlightDetails> searchFlight(String fromPlace, String toPlace,  Date startDate);

}
