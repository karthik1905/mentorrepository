package com.mentor.demand.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mentor.demand.pojo.MentorDtls;
import com.mentor.demand.repository.MentorDetailsRepository;

@Service
public class MentorDetailsService {
	@Autowired
	private MentorDetailsRepository mdr;

	public void setMentorDetails(MentorDtls mentorDtls) {
		mdr.save(mentorDtls);
	}

}
