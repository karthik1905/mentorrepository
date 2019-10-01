package com.mentor.demand;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mentor")
public class MentorDtls {
	private static final long serialversionUID = 1L;
	@Id
	private Long mentorId;
	private String userName = "";
	private String password;
	private String firstName = "";
	private String lastName = "";
	private Long ContactNumber;
	private String role;
	private String linkedinUrl;
	private Float yearsOfExperience;
	private Boolean active = false;
	private Boolean confirmedSignUp = false;
	private Boolean resetPassword = false;

	public MentorDtls(Long mentorId, String userName, String password, String firstName, String lastName,
			Long contactNumber, String role, String linkedinUrl, Float yearsOfExperience, Boolean active,
			Boolean confirmedSignUp, Boolean resetPassword) {
		super();
		this.mentorId = mentorId;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		ContactNumber = contactNumber;
		this.role = role;
		this.linkedinUrl = linkedinUrl;
		this.yearsOfExperience = yearsOfExperience;
		this.active = active;
		this.confirmedSignUp = confirmedSignUp;
		this.resetPassword = resetPassword;
	}

	public Long getMentorId() {
		return mentorId;
	}

	public void setMentorId(Long mentorId) {
		this.mentorId = mentorId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getContactNumber() {
		return ContactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		ContactNumber = contactNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLinkedinUrl() {
		return linkedinUrl;
	}

	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}

	public Float getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(Float yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean getConfirmedSignUp() {
		return confirmedSignUp;
	}

	public void setConfirmedSignUp(Boolean confirmedSignUp) {
		this.confirmedSignUp = confirmedSignUp;
	}

	public Boolean getResetPassword() {
		return resetPassword;
	}

	public void setResetPassword(Boolean resetPassword) {
		this.resetPassword = resetPassword;
	}

	public static long getSerialversionuid() {
		return serialversionUID;
	}

	public MentorDtls() {
		// TODO Auto-generated constructor stub
	}

}
