package com.jay.rr.user.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.jay.rr.user.model.UserRegistrationModel;

public class UserRegistryRepositoryCustomImpl implements UserRegistryRepositoryCustom {

	@Autowired
    MongoTemplate mongoTemplate;
	@Override
	public String registerUser(UserRegistrationModel model) {
		mongoTemplate.save(model);
		return model.getId();
	}

}
