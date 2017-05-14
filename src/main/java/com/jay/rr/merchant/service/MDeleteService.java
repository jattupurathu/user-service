package com.jay.rr.merchant.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jay.rr.user.model.UserRegistrationModel;
import com.jay.rr.user.repo.UserRegistrationRepository;

@Service
public class MDeleteService {
	@Autowired
	UserRegistrationRepository userRegistrationRepository;

	public long delete(String email, String password){
		return userRegistrationRepository.deleteByEmail(email);
	}

}
