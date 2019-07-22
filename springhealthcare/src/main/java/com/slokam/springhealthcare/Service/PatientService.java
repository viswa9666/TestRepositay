package com.slokam.springhealthcare.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.springhealthcare.Dao.PatientDao;
import com.slokam.springhealthcare.entity.PatientPojo;

@Service
public class PatientService {
	@Autowired
	private PatientDao patientdao;
	

	public void SavePatientData(PatientPojo patient){
		patientdao.save(patient);
	}
	
	public List<Object> GetPatientId(Long id){
		return patientdao.GetPatientId(id);
		
	
	}
}
