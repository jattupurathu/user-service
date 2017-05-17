package com.jay.rr.merchant.controller;

import org.springframework.web.bind.annotation.RestController;

import com.jay.rr.merchant.model.MRegistrationServiceModel;
import com.jay.rr.merchant.service.MRegistrationService;
import com.jay.rr.user.common.IConstants;
import com.jay.rr.user.model.UserRegistrationServiceModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(IConstants.M_REGISTER_REQUEST_MAPPING)
public class MRegisterController {
    	
	@Autowired
	MRegistrationService mregistrationService ; 
	
	@RequestMapping(method = RequestMethod.POST)
    public String register(@RequestBody MRegistrationServiceModel model) {
		return mregistrationService.register(model);
    }
    
}
