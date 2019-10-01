package com.mentor.demand.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mentor.demand.pojo.MentorCalendar;
import com.mentor.demand.repository.MentorCalendarRepository;

@Service
public class MentorCalendarService {
	@Autowired
	private MentorCalendarRepository mcr;

	public void setMentorCalendar(MentorCalendar mentorCalendar) {
		mcr.save(mentorCalendar);
	}

}
