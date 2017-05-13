package com.jay.rr.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jay.rr.user.common.EmailValidator;
import com.jay.rr.user.model.UserRegistrationModel;
import com.jay.rr.user.model.UserRegistrationServiceModel;
import com.jay.rr.user.repo.UserRegistrationRepository;

@Service
public class RegistrationService {
	@Autowired
	UserRegistrationRepository userRegistrationRepository;
	
	String reasonCode = "done";

	public String register(UserRegistrationServiceModel model) {

		// check if the mobile is already present.
		UserRegistrationModel mod = userRegistrationRepository.findByMobile(model.getMobile());
		
		if (mod != null) {
			// user is already registered
			reasonCode = "user already registered";
		} else {
			/*
			 * Mandatory Data First Name, Last Name, Mobile and Email
			 * 
			 */
			EmailValidator emailValidator = new EmailValidator();
			if (model.getFirstName() == null || model.getFirstName().trim().isEmpty()) {
				reasonCode = "First Name is Mandatory";
			} else if (model.getLastName() == null || model.getLastName().trim().isEmpty()) {
				reasonCode = "Last Name is Mandatory";
			}else if (model.getEmail() == null || model.getEmail().trim().isEmpty() || !emailValidator.validate(model.getEmail())) {
				reasonCode ="Invalid email - "+model.getEmail();	
			}else if (model.getMobile() == null || model.getMobile().trim().isEmpty() || !validateMobile(model.getMobile())) {
				reasonCode ="Invalid Mobile number - "+model.getMobile();
			}else{
				// valid mobile via otp 
				// register a new user
				UserRegistrationModel uModel = new UserRegistrationModel();
				uModel.setEmail(model.getEmail());
				uModel.setPassword(model.getPassword());
				uModel.setAdd1(model.getAdd1());
				uModel.setAdd1(model.getAdd2());
				uModel.setAdd1(model.getAdd3());
				uModel.setCity(model.getCity());
				uModel.setState(model.getState());
				uModel.setPincode(model.getPincode());
				uModel.setMobile(model.getMobile());
				userRegistrationRepository.insert(uModel);
				reasonCode = "done";
			}
		}
		return reasonCode;
	}

	
	public boolean validateMobile(String mobile){
		
		mobile.trim();
		mobile = mobile.replaceAll("\\s", "");
		while (mobile.startsWith("+")) {
			mobile = new String(mobile.toString().substring(1));
		}
		
		if (mobile.matches("^\\s*\\d+\\s*$")) {

			System.out.println("match");
			if (mobile.length() == 10 || mobile.length() == 12) {
				if ((mobile != null)) {
					if (mobile.matches("9{1}1{1}[7-8-9]{1}[0-9]{9}")) {
						System.out.println(" correct number");

					} else if (mobile.matches("[7-8-9]{1}[0-9]{9}")) {} 
					else {
						return false;
					}
				} else {
					return false;
				}

			} else {
				return false;
			}
		} else {
			return false;
		}
		return true;
	}
}
