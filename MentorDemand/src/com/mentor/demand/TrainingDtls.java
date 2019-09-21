package com.mentor.demand;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="training")
public class TrainingDtls {
	private static final long serialversionUID = 1L;
	@Id
	private Long id;
	private String status;
	private Integer progress;
	private Float commissionAmount;
	private Integer rating;
	private Float avgRating = (float) 0.01;
	private String startDate;
	private String endDate;
	private String startTime;
	private String endTime;
	private Float amountReceived;
	private Long userId;
	private String userName;
	private Long mentorid;
	private String mentorName;
	private Long skillid;
	private String skillName;
	private Float fees;
//	@ManyToOne
	//private UserDtls user;

	public TrainingDtls(Long id, String status, Integer progress, Float commissionAmount, Integer rating,
			Float avgRating, String startDate, String endDate, String startTime, String endTime, Float amountReceived,
			Long userId, String userName, Long mentorid, String mentorName, Long skillid, String skillName, Float fees) {
		super();
		this.id = id;
		this.status = status;
		this.progress = progress;
		this.commissionAmount = commissionAmount;
		this.rating = rating;
		this.avgRating = avgRating;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.amountReceived = amountReceived;
		this.userId = userId;
		this.userName = userName;
		this.mentorid = mentorid;
		this.mentorName = mentorName;
		this.skillid = skillid;
		this.skillName = skillName;
		this.fees = fees;
	}


	public Float getAmountReceived() {
		return amountReceived;
	}

	public void setAmountReceived(Float amountReceived) {
		this.amountReceived = amountReceived;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getProgress() {
		return progress;
	}

	public void setProgress(Integer progress) {
		this.progress = progress;
	}

	public Float getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(Float commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Float getAvgRating() {
		return avgRating;
	}

	public void setAvgRating(Float avgRating) {
		this.avgRating = avgRating;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getMentorid() {
		return mentorid;
	}

	public void setMentorid(Long mentorid) {
		this.mentorid = mentorid;
	}

	public String getMentorName() {
		return mentorName;
	}

	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}

	public Long getSkillid() {
		return skillid;
	}

	public void setSkillid(Long skillid) {
		this.skillid = skillid;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Float getFees() {
		return fees;
	}

	public void setFees(Float fees) {
		this.fees = fees;
	}

	public static long getSerialversionuid() {
		return serialversionUID;
	}


	public TrainingDtls() {
		super();
		// TODO Auto-generated constructor stub
	}
}