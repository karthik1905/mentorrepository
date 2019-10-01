package com.mentor.demand.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payments")
public class PaymentDtls {
	private static final long serialVersionUID = 11;
	@Id
	private Long amount;
	private Long cardNumber;
	private Integer cvv;
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Integer getCvv() {
		return cvv;
	}
	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public PaymentDtls(Long amount, Long cardNumber, Integer cvv) {
		super();
		this.amount = amount;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}
	
}