package com.cognizant.flightbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.flightbooking.entity.AdminEntity;
import com.cognizant.flightbooking.exception.UserNotFoundException;
import com.cognizant.flightbooking.service.RegistraionService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RegistrationController {

	@Autowired
	private RegistraionService registraionService;

	@PostMapping("/admin/registeration")
	public String registerAdmin(@RequestBody AdminEntity adminEntity) throws Exception {
		String tempEmailId = adminEntity.getEmailId();
		if (tempEmailId != null && !"".equals(tempEmailId)) {
			AdminEntity adminObj = registraionService.getUserByEmailId(tempEmailId);

			if (adminObj != null) {
				return "Admin with " + tempEmailId + " is already exit";
			}

		}
		 registraionService.saveAdmin(adminEntity);
		return "Registraion successful...";
	}
	
	@GetMapping("/admin/login/{emailId}/{password}")
	public String loginAdmin(@PathVariable String emailId,@PathVariable String password) throws Exception {
		
		
			try {
				 registraionService.getUserByEmailIdAndPassword(emailId, password);
			} catch (UserNotFoundException e) {
				// TODO: handle exception
				throw new UserNotFoundException();
			}
		
		
		return "Login Success";
		
	}

}
