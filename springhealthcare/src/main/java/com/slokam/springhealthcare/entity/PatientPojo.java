package com.slokam.springhealthcare.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class PatientPojo {
	
	@Id
	@GeneratedValue
	private long id;
	private String patientname;
	private String description;
	private long mobilenumber;
	private String distname;
	private Date consultdate;
	private long adharcard;
	
	@OneToMany(mappedBy="patient")
	private List<DoctorPojo> doctorlist;
	
	public List<DoctorPojo> getDoctorlist() {
		return doctorlist;
	}
	public void setDoctorlist(List<DoctorPojo> doctorlist) {
		this.doctorlist = doctorlist;
	}
	@OneToMany(mappedBy="patient")
	private List<ReportPojo> reportlist;
	
	@OneToMany(mappedBy="patient")
	private List<MedicinPojo> medicinlist;
	
	@ManyToOne
	@JoinColumn(name="sid")
	private StatusPojo statuslist;
	
	public void setStatuslist(StatusPojo statuslist) {
		this.statuslist = statuslist;
	}
	@ManyToOne
	@JoinColumn(name="wid")
	private WardPojo wardlist;
	
	public void setWardlist(WardPojo wardlist) {
		this.wardlist = wardlist;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}public List<ReportPojo> getReportlist() {
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
	public long getAdharcard() {
		return adharcard;
	}
	public void setAdharcard(long adharcard) {
		this.adharcard = adharcard;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getDistname() {
		return distname;
	}
	public void setDistname(String distname) {
		this.distname = distname;
	}
	public Date getConsultdate() {
		return consultdate;
	}
	public void setConsultdate(Date consultdate) {
		this.consultdate = consultdate;
	}
	public StatusPojo getStatuslist() {
		return statuslist;
	}
	public WardPojo getWardlist() {
		return wardlist;
	}
	
	
	
			

}
