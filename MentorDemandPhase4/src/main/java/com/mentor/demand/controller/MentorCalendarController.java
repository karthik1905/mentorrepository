package com.mentor.demand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mentor.demand.pojo.MentorCalendar;
import com.mentor.demand.service.MentorCalendarService;

@RestController
public class MentorCalendarController {
	@Autowired
	private MentorCalendarService mcs;
	
	@RequestMapping(method=RequestMethod.POST , value="/mentorcalendar")
	public void addMentorDetails(@RequestBody MentorCalendar mentorCalendar) {
		mcs.setMentorCalendar(mentorCalendar);
	}
}