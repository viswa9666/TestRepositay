package com.slokam.springhealthcare.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="doctor")
public class DoctorPojo {
	
	@Id
	@GeneratedValue
	private long id;
	private String doctorname;
	@ManyToOne
	@JoinColumn(name="pid")
	private PatientPojo patient;
	
	@OneToMany(mappedBy="doctor")
	private List<ReportPojo> reportlist;
	
	@OneToMany(mappedBy="doctor")
	private List<MedicinPojo> medicinlist;
	
	@ManyToOne
	@JoinColumn(name="sid")
	private StatusPojo statuslist;
	
	@ManyToOne
	@JoinColumn(name="wid")
	private WardPojo  wordlist;
	public void setStatuslist(StatusPojo statuslist) {
		this.statuslist = statuslist;
	}
	public void setWordlist(WardPojo wordlist) {
		this.wordlist = wordlist;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public PatientPojo getPatient() {
		return patient;
	}
	public void setPatient(PatientPojo patient) {
		this.patient = patient;
	}
	public List<ReportPojo> getReportlist() {
		return reportlist;
	}
	public void setReportlist(List<ReportPojo> reportlist) {
		this.reportlist = reportlist;
	}
	public List<MedicinPojo> getMedicinlist() {
		return medicinlist;
	}
	public void setMedicinlist(List<MedicinPojo> medicinlist) {
		this.medicinlist = medicinlist;
	}
	
	}
