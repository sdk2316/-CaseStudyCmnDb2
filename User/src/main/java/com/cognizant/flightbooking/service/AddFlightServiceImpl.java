package com.cognizant.flightbooking.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.flightbooking.entity.AddFlightDetails;
import com.cognizant.flightbooking.exception.ResourceNotFoundException;
import com.cognizant.flightbooking.repo.AddFlightRepository;

@Service
public class AddFlightServiceImpl implements IAddFlightService {

	@Autowired
	AddFlightRepository flightRepository;

	@Override
	public AddFlightDetails bookFlight(AddFlightDetails addFlight) {
		// TODO Auto-generated method stub
		return flightRepository.save(addFlight);
	}


	
	@Override
	
	public List<AddFlightDetails> searchFlight(String fromPlace, String toPlace,  Date startDate) {
				return flightRepository.searchFlight(fromPlace, toPlace,startDate);
	}



}
