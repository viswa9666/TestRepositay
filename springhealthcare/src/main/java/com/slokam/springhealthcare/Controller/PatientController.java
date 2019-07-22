package com.slokam.springhealthcare.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.springhealthcare.Service.PatientService;
import com.slokam.springhealthcare.entity.PatientPojo;

@RestController
@RequestMapping("patient")
@CrossOrigin
public class PatientController {

	@Autowired
	private PatientService patientservice;
	
	@PostMapping
	public void SavepatientData(@RequestBody PatientPojo patient){
		patientservice.SavePatientData(patient);
	}
	@GetMapping("/check/{id}")
	public List<Object> GetPatientId(@PathVariable (name="id")Long id){		
		return patientservice.GetPatientId(id);
	}
}
