package com.mentor.demand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mentor.demand.pojo.UserDtls;
import com.mentor.demand.service.UserDetailsService;

@RestController
public class UserDetailsController {

	@Autowired
	private UserDetailsService uds;
	
	@RequestMapping(method=RequestMethod.POST , value="/userdetails")
	public void addUserDetails(@RequestBody UserDtls userDtls) {
		uds.setUserDetails(userDtls);
	}

}
