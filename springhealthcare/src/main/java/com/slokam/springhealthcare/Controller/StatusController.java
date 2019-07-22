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

import com.slokam.springhealthcare.Service.StatusService;
import com.slokam.springhealthcare.entity.StatusPojo;
@RestController
@RequestMapping("status")
@CrossOrigin
public class StatusController {

	@Autowired
	private StatusService statusservice;
	
	@PostMapping
	public void SaveStatusData(@RequestBody StatusPojo status){
		statusservice.SaveStatusData(status);
	}
	@GetMapping("/all")
	public ResponseEntity<List<StatusPojo>> GetSatatusList(){
		List<StatusPojo> statuslist=statusservice.GetSatatusList();
		ResponseEntity<List<StatusPojo>> re=new ResponseEntity<List<StatusPojo>>(statuslist,HttpStatus.OK);
		
		
		return re;
	}
}
