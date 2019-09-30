package com.mentor.demand;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="calendar")
public class MentorCalendar {
	private static final long serialversionUID = 1L;
	@Id
	private Long calendarId;
	private String fromDate;
	private String toDate;
	
	public MentorCalendar(Long calendarId, String fromDate, String toDate) {
		super();
		this.calendarId = calendarId;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public Long getCalendarId() {
		return calendarId;
	}

	public void setCalendarId(Long calendarId) {
		this.calendarId = calendarId;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public static long getSerialversionuid() {
		return serialversionUID;
	}

	public MentorCalendar() {
		// TODO Auto-generated constructor stub
	}

}
