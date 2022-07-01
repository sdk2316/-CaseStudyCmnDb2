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
	public AdminEntity registerAdmin(@RequestBody AdminEntity adminEntity) throws Exception {
		String tempEmailId = adminEntity.getEmailId();
		if (tempEmailId != null && !"".equals(tempEmailId)) {
			AdminEntity adminObj = registraionService.getUserByEmailId(tempEmailId);

			if (adminObj != null) {
				throw new Exception("Admin with " + tempEmailId + " is already exit");
			}

		}
		AdminEntity admin = registraionService.saveAdmin(adminEntity);
		return admin;
	}
	@PostMapping("/admin/login")
	public AdminEntity loginAdmin(@RequestBody AdminEntity adminEntity) throws Exception {
		String tempEmailId= adminEntity.getEmailId();
		String tempPassword=adminEntity.getPassword();
		AdminEntity adminObj=null;
		if(tempEmailId !=null && tempPassword !=null) {
			adminObj = registraionService.getUserByEmailIdAndPassword(tempEmailId, tempPassword);
		}
		if(adminObj == null) {
			throw new Exception("Bad crendentials");
			
		}
		return adminObj;
		
	}


}
