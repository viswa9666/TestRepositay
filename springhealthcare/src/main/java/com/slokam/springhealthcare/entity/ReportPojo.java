package com.slokam.springhealthcare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="report")
public class ReportPojo {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	@ManyToOne
	@JoinColumn(name="ppid")
	private PatientPojo patient;
	@ManyToOne
	@JoinColumn(name="did")
	private DoctorPojo doctor;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
