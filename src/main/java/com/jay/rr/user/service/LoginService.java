package com.jay.rr.user.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jay.rr.user.model.UserRegistrationModel;
import com.jay.rr.user.repo.UserRegistrationRepository;

@Service
public class LoginService {
	@Autowired
	UserRegistrationRepository userRegistrationRepository;

	public String login(String email, String password){
		UserRegistrationModel uModel = userRegistrationRepository.findByEmail(email);
		System.out.println(uModel.getEmail());
		return "done";
	}

}
