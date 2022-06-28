package com.cognizant.flightbooking.service;

import com.cognizant.flightbooking.entity.AdminEntity;

public interface RegistraionService {

	public AdminEntity saveAdmin(AdminEntity admin);

	public AdminEntity getUserByEmailId(String emailId);
	
	public AdminEntity getUserByEmailIdAndPassword(String emailId,String password);

}
