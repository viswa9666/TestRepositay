package com.slokam.springhealthcare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ward")
public class WardPojo {
	
	@Id
	@GeneratedValue
	private long id;
	private String wardname;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return wardname;
	}
	public void setName(String name) {
		this.wardname = name;
	}
	

		
}
