package com.mentor.demand;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="payment")
public class PaymentDtls {
	private static final long serialVersionUID = 11;
	@Id
	private Long id;
	private String txnType;
	private Float amount;
	private String remarks;
	private Long mentorld;
	private String mentorName;
	private Long trainingid;
	private String skillName;
	private Float totalAmountToMentor;
	public Float getTotalAmountToMentor() {
		return totalAmountToMentor;
	}

	public void setTotalAmountToMentor(Float totalAmountToMentor) {
		this.totalAmountToMentor = totalAmountToMentor;
	}

	public PaymentDtls() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentDtls(Long id, String txnType, Float amount, String remarks, Long mentorld, String mentorName,
			Long trainingid, String skillName, Float totalAmountToMentor) {
		super();
		this.id = id;
		this.txnType = txnType;
		this.amount = amount;
		this.remarks = remarks;
		this.mentorld = mentorld;
		this.mentorName = mentorName;
		this.trainingid = trainingid;
		this.skillName = skillName;
		this.totalAmountToMentor = totalAmountToMentor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTxnType() {
		return txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Long getMentorld() {
		return mentorld;
	}

	public void setMentorld(Long mentorld) {
		this.mentorld = mentorld;
	}

	public String getMentorName() {
		return mentorName;
	}

	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}

	public Long getTrainingid() {
		return trainingid;
	}

	public void setTrainingid(Long trainingid) {
		this.trainingid = trainingid;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}