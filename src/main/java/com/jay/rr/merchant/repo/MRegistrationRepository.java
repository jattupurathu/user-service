package com.jay.rr.merchant.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jay.rr.merchant.model.MRegistrationModel;
import com.jay.rr.user.model.UserRegistrationModel;

@Repository
public interface MRegistrationRepository extends MongoRepository<UserRegistrationModel, String>{
	
	public MRegistrationModel findByFirstName(String firstName);
	public MRegistrationModel findByEmail(String email);
	public MRegistrationModel findByMobile(String mobile);
	public long deleteByEmail(String email);
    public List<MRegistrationModel> findByLastName(String lastName);
}
