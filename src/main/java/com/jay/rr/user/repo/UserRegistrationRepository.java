package com.jay.rr.user.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jay.rr.user.model.UserRegistrationModel;

@Repository
public interface UserRegistrationRepository extends MongoRepository<UserRegistrationModel, String>{
	
	public UserRegistrationModel findByFirstName(String firstName);
	public UserRegistrationModel findByEmail(String email);
	public long deleteByEmail(String email);
    public List<UserRegistrationModel> findByLastName(String lastName);
}
