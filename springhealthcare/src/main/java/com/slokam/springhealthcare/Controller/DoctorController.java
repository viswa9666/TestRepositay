package com.slokam.springhealthcare.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.springhealthcare.Service.DoctorService;
import com.slokam.springhealthcare.entity.DoctorPojo;

@RestController
@RequestMapping("doctor")
@CrossOrigin
public class DoctorController {

	@Autowired
	private DoctorService doctorservice;
	
	@PostMapping
	public void SaveDoctorData(@RequestBody DoctorPojo doctor){
		doctorservice.SaveDoctorData(doctor);
	}
	@GetMapping("/all")
	public ResponseEntity<List<DoctorPojo>> getdoctordata(){
		List<DoctorPojo> list=doctorservice.getdoctordata();
		
		ResponseEntity<List<DoctorPojo>> re=new ResponseEntity<List<DoctorPojo>>(list,HttpStatus.OK);
		return re;
	}
}
