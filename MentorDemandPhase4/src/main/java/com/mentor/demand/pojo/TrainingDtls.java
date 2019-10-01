package com.mentor.demand.pojo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="training")
public class TrainingDtls {
	private static final long serialversionUID = 1L;
	@Id
	private Long id;
	private String status;
	private String startDate;
	private String endDate;
	private Float amountReceived;
	private Float fees;
	@OneToOne
	private PaymentDtls paymentobj;
	@ManyToMany(mappedBy = "trainingObj")
	private Set<UserDtls> userObj;

	public Set<UserDtls> getUserObj() {
		return userObj;
	}

	public void setUserObj(Set<UserDtls> userObj) {
		this.userObj = userObj;
	}

	public PaymentDtls getPaymentobj() {
		return paymentobj;
	}

	public void setPaymentobj(PaymentDtls paymentobj) {
		this.paymentobj = paymentobj;
	}

	public Float getAmountReceived() {
		return amountReceived;
	}

	public TrainingDtls(Long id, String status, String startDate, String endDate,
		Float amountReceived, Float fees) {
	super();
	this.id = id;
	this.status = status;
	this.startDate = startDate;
	this.endDate = endDate;
	this.amountReceived = amountReceived;
	this.fees = fees;
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