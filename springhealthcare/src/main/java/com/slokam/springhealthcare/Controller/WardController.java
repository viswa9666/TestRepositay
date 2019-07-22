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

import com.slokam.springhealthcare.Service.WardService;
import com.slokam.springhealthcare.entity.WardPojo;

@RestController
@RequestMapping("ward")
@CrossOrigin
public class WardController {

	@Autowired
	private WardService wardservice;
	
	@PostMapping
	public void SaveWardData(@RequestBody WardPojo ward){
		wardservice.SaveWardData(ward);
	}
	@GetMapping("/all")
	public ResponseEntity<List<WardPojo>> GetWardList(){
		List<WardPojo> wardlist=wardservice.GetWardList();
	
		ResponseEntity<List<WardPojo>> re=new ResponseEntity<List<WardPojo>>(wardlist,HttpStatus.OK);
	
		return re;
	}
}
