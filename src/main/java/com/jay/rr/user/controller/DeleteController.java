package com.jay.rr.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jay.rr.user.common.IConstants;
import com.jay.rr.user.service.DeleteService;
import com.jay.rr.user.service.LoginService;

@RestController
@RequestMapping(IConstants.DELETE_REQUEST_MAPPING+"/{email}/{password}")

public class DeleteController {
	
	@Autowired
	DeleteService deleteService ; 
	
	
	@RequestMapping(method = RequestMethod.POST)
    public long delete(@PathVariable String email, @PathVariable String password) {
		return deleteService.delete(email, password);
	}

}
