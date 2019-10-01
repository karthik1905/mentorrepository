package com.mentor.demand.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mentor.demand.pojo.UserDtls;
import com.mentor.demand.repository.UserDetailsRepository;


@Service
public class UserDetailsService {
	@Autowired
	private UserDetailsRepository udr;

	public void setUserDetails(UserDtls userDtls) {
		udr.save(userDtls);
	}

}
