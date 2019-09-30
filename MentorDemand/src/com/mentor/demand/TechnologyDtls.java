package com.mentor.demand;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "technology")
public class TechnologyDtls {
	private static final long serialversionUID = 1L;
	public static long getSerialversionuid() {
		return serialversionUID;
	}

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

	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="Mentor_ID")
    private Collection<MentorDtls> mentorDtlsObj=new ArrayList<MentorDtls>();

	public Collection<MentorDtls> getMentorDtlsObj() {
		return mentorDtlsObj;
	}

	public void setMentorDtlsObj(Collection<MentorDtls> mentorMapObj) {
		this.mentorDtlsObj = mentorMapObj;
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

	public TechnologyDtls(Long skillid, String name, String toc, String prerequisites) {
		super();
		this.skillid = skillid;
		this.name = name;
		this.toc = toc;
		this.prerequisites = prerequisites;
	}

	public TechnologyDtls() {
		super();
		// TODO Auto-generated constructor stub
	}
}