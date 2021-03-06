package com.jay.rr.user.controller;

import org.springframework.web.bind.annotation.RestController;

import com.jay.rr.user.common.IConstants;
import com.jay.rr.user.model.UserRegistrationServiceModel;
import com.jay.rr.user.service.RegistrationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(IConstants.REGISTER_REQUEST_MAPPING)
public class RegisterController {
    	
	@Autowired
	RegistrationService registrationService ; 
	
	@RequestMapping(method = RequestMethod.POST)
    public String register(@RequestBody UserRegistrationServiceModel model) {
		//UserRegistrationServiceModel model1 = new UserRegistrationServiceModel("Jayashankar", "Attupurathu", "sam1", "sam1", "1", "2", "3", "pune", "mh", "00000000");
		//System.out.println(model1.toString());
		return registrationService.register(model);
    }
    
}
