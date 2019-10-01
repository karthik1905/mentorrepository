package com.mentor.demand;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserDtls {
	private static final long serialversionUID = 1L;
	@Id
	private Long id;
	private String userName = "";
	private String password;
	private String firstName = "";
	private String lastName = "";
	private Long ContactNumber;
	private Boolean confirmedSignUp = false;
	private Boolean resetPassword = false;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<TrainingDtls> trainingObj;
	
	public Set<TrainingDtls> getTrainingObj() {
		return trainingObj;
	}

	public void setTrainingObj(Set<TrainingDtls> trainingObj) {
		this.trainingObj = trainingObj;
	}

	public UserDtls(Long id, String userName, String password, String firstName, String lastName, Long contactNumber,
			Boolean confirmedSignUp, Boolean resetPassword) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		ContactNumber = contactNumber;
		this.confirmedSignUp = confirmedSignUp;
		this.resetPassword = resetPassword;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public UserDtls() {
		super();
		// TODO Auto-generated constructor stub
	}
}