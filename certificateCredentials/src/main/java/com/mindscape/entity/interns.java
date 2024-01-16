package com.mindscape.entity;

import java.sql.Date;
import java.util.Arrays;

import javax.persistence.*;

@Entity
public class interns {

	@Id
	private int id;
	private String internname;
	private String internemail;
	private String internno;
	private String internregistrationno;
	private Date internshipstartdate;
	private Date internshipenddate;
	private String internshipcertificateno;
	private String domain;
	private int duration;
	public interns(int id, String internname, String internemail, String internno, String internregistrationno,
			Date internshipstartdate, Date internshipenddate, String internshipcertificateno, String domain,
			int duration) {
		super();
		this.id = id;
		this.internname = internname;
		this.internemail = internemail;
		this.internno = internno;
		this.internregistrationno = internregistrationno;
		this.internshipstartdate = internshipstartdate;
		this.internshipenddate = internshipenddate;
		this.internshipcertificateno = internshipcertificateno;
		this.domain = domain;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "interns [id=" + id + ", internname=" + internname + ", internemail=" + internemail + ", internno="
				+ internno + ", internregistrationno=" + internregistrationno + ", internshipstartdate="
				+ internshipstartdate + ", internshipenddate=" + internshipenddate + ", internshipcertificateno="
				+ internshipcertificateno + ", domain=" + domain + ", duration=" + duration + ", pdfdata="
				+ "]";
	}
	public interns() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInternname() {
		return internname;
	}
	public void setInternname(String internname) {
		this.internname = internname;
	}
	public String getInternemail() {
		return internemail;
	}
	public void setInternemail(String internemail) {
		this.internemail = internemail;
	}
	public String getInternno() {
		return internno;
	}
	public void setInternno(String internno) {
		this.internno = internno;
	}
	public String getInternregistrationno() {
		return internregistrationno;
	}
	public void setInternregistrationno(String internregistrationno) {
		this.internregistrationno = internregistrationno;
	}
	public Date getInternshipstartdate() {
		return internshipstartdate;
	}
	public void setInternshipstartdate(Date internshipstartdate) {
		this.internshipstartdate = internshipstartdate;
	}
	public Date getInternshipenddate() {
		return internshipenddate;
	}
	public void setInternshipenddate(Date internshipenddate) {
		this.internshipenddate = internshipenddate;
	}
	public String getInternshipcertificateno() {
		return internshipcertificateno;
	}
	public void setInternshipcertificateno(String internshipcertificateno) {
		this.internshipcertificateno = internshipcertificateno;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
}