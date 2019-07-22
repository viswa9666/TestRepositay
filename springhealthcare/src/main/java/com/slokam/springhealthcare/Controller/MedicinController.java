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

import com.slokam.springhealthcare.Service.MedicinService;
import com.slokam.springhealthcare.entity.MedicinPojo;

@RestController
@RequestMapping("medicin")
@CrossOrigin
public class MedicinController {

	@Autowired
	private MedicinService medicinservice;
	@PostMapping
	public void SavemedicinData(@RequestBody MedicinPojo medicin){
		medicinservice.SaveMedicinData(medicin);
	}
	@GetMapping("/all")
	public ResponseEntity<List<MedicinPojo >> GetMedicianList(){
		List<MedicinPojo> medicianlist=medicinservice.GetMedicianList();
	
		ResponseEntity<List<MedicinPojo >> re=new ResponseEntity<List<MedicinPojo >>(medicianlist,HttpStatus.OK);
		return re;
	}
}
