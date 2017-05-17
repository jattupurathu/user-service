package com.jay.rr.merchant.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jay.rr.merchant.model.MRegistrationModel;
import com.jay.rr.merchant.repo.MRegistrationRepository;
import com.jay.rr.user.model.UserRegistrationModel;
import com.jay.rr.user.repo.UserRegistrationRepository;

@Service
public class MLoginService {
	@Autowired
	MRegistrationRepository mRegistrationRepository;
	
	private String reasonCode = "done";

	public String login(String mobile, String password){
		MRegistrationModel uModel = mRegistrationRepository.findByMobile(mobile);
		if(uModel == null){
			reasonCode ="User is not registered";
		}else if(password.trim().equals(uModel.getPassword())){
			// we are good here
			System.out.println(uModel.getMobile());			
		}else{
			reasonCode = "incorrect password";
		}
		return reasonCode;
	}

}
