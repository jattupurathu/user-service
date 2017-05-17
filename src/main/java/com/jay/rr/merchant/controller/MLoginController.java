package com.jay.rr.merchant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jay.rr.merchant.service.MLoginService;
import com.jay.rr.user.common.IConstants;
import com.jay.rr.user.service.LoginService;

@RestController
@RequestMapping(IConstants.LOGIN_REQUEST_MAPPING+"/{mobile}/{password}")

public class MLoginController {
	
	@Autowired
	MLoginService mLoginService ; 
	
	
	@RequestMapping(method = RequestMethod.POST)
    public String login(@PathVariable String mobile, @PathVariable String password) {
		return mLoginService.login(mobile, password);
	}

}
