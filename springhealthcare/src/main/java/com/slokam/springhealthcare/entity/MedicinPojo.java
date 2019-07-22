package com.slokam.springhealthcare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="medicin")
public class MedicinPojo {
	
	@Id
	@GeneratedValue
	private long id;
	private String medicinname;
	@ManyToOne
	@JoinColumn(name="pmid")
	private PatientPojo patient;
	@ManyToOne
	@JoinColumn(name="dmid")
	private DoctorPojo doctor;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMedicinname() {
		return medicinname;
	}
	public void setMedicinname(String medicinname) {
		this.medicinname = medicinname;
	}
	public PatientPojo getPatient() {
		return patient;
	}
	public void setPatient(PatientPojo patient) {
		this.patient = patient;
	}
	public DoctorPojo getDoctor() {
		return doctor;
	}
	public void setDoctor(DoctorPojo doctor) {
		this.doctor = doctor;
	}
	
	
	
}
