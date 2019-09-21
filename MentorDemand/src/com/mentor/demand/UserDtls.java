package com.mentor.demand;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	private String regCode;
	private String role;
	private String linkedinUrl;
	private Float yearsOfExperience;
	private Boolean active = false;
	private Boolean confirmedSignUp = false;
	private Boolean resetPassword = false;

//	@OneToMany(mappedBy = "user_id")
//	private List<SkillDtls> skillmap = new ArrayList<SkillDtls>();

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private Set<SkillDtls> skillmap;

	public Set<SkillDtls> getSkillmap() {
		return skillmap;
	}

	public void setSkillmap(Set<SkillDtls> skillmap) {
		this.skillmap = skillmap;
	}

	public UserDtls(Long id, String userName, String password, String firstName, String lastName, Long contactNumber,
			String regCode, String role, String linkedinUrl, Float yearsOfExperience, Boolean active,
			Boolean confirmedSignUp, Boolean resetPassword) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		ContactNumber = contactNumber;
		this.regCode = regCode;
		this.role = role;
		this.linkedinUrl = linkedinUrl;
		this.yearsOfExperience = yearsOfExperience;
		this.active = active;
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

	public String getRegCode() {
		return regCode;
	}

	public void setRegCode(String regCode) {
		this.regCode = regCode;
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

	public UserDtls() {
		super();
		// TODO Auto-generated constructor stub
	}
}