package com.mentor.demand;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "skill")
public class SkillDtls {
	@Id
	@Column(name = "id_no")
	private Long skillid;

	public Long getSkillid() {
		return skillid;
	}

	public void setSkillid(Long skillid) {
		this.skillid = skillid;
	}

	private String name = "";
	private String toc = "";
	private String prerequisites = "";
	@OneToOne
	private PaymentDtls paymentobj;

	

	public PaymentDtls getPaymentobj() {
		return paymentobj;
	}

	public void setPaymentobj(PaymentDtls paymentobj) {
		this.paymentobj = paymentobj;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getToc() {
		return toc;
	}

	public void setToc(String toc) {
		this.toc = toc;
	}

	public String getPrerequisites() {
		return prerequisites;
	}

	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}

	public SkillDtls(Long skillid, String name, String toc, String prerequisites) {
		super();
		this.skillid = skillid;
		this.name = name;
		this.toc = toc;
		this.prerequisites = prerequisites;
	}

	public SkillDtls() {
		super();
		// TODO Auto-generated constructor stub
	}
}