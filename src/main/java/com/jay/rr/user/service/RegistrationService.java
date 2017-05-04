package com.jay.rr.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jay.rr.user.model.UserRegistrationModel;
import com.jay.rr.user.model.UserRegistrationServiceModel;
import com.jay.rr.user.repo.UserRegistrationRepository;

@Service
public class RegistrationService {
	@Autowired
	UserRegistrationRepository userRegistrationRepository;
	String reasonCode = "done";
	public String register(UserRegistrationServiceModel model){
		UserRegistrationModel uModel = new UserRegistrationModel();
		uModel.setEmail(model.getEmail());
		uModel.setPassword(model.getPassword());
		uModel.setAdd1(model.getAdd1());
		uModel.setAdd1(model.getAdd2());
		uModel.setAdd1(model.getAdd3());
		uModel.setCity(model.getCity());
		uModel.setState(model.getState());
		uModel.setPincode(model.getPincode());
		userRegistrationRepository.insert(uModel);
		return reasonCode;
	}

}
