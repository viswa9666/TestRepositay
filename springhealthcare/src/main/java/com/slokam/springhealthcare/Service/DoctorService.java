package com.slokam.springhealthcare.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.springhealthcare.Dao.DoctorDao;
import com.slokam.springhealthcare.entity.DoctorPojo;

@Service
public class DoctorService {

	@Autowired
	private DoctorDao doctordao;
	
	public void SaveDoctorData(DoctorPojo doctor){
		doctordao.save(doctor);
	}
	
	public List<DoctorPojo> getdoctordata(){
		return doctordao.getdoctordata();
	}
}
