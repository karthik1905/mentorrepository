package com.mentor.demand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mentor.demand.pojo.MentorDtls;
import com.mentor.demand.service.MentorDetailsService;

@RestController
public class MentorDetailsController {
	@Autowired
	private MentorDetailsService mds;
	
	@RequestMapping(method=RequestMethod.POST , value="/mentordetails")
	public void addMentorDetails(@RequestBody MentorDtls mentorDtls) {
		mds.setMentorDetails(mentorDtls);
	}
}