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

import com.slokam.springhealthcare.Service.ReportService;
import com.slokam.springhealthcare.entity.ReportPojo;

@RestController
@RequestMapping("report")
@CrossOrigin
public class ReportController {

	@Autowired
	private ReportService reportservice;
	
	
	@PostMapping
	public void SaveReportData(@RequestBody ReportPojo report){
		reportservice.SaveReportData(report);
	}
	@GetMapping("/all")
	public ResponseEntity<List<ReportPojo>> GetReportList(){
		List<ReportPojo> reportlist=reportservice.GetReportList();
		
		ResponseEntity<List<ReportPojo>> re=new ResponseEntity<List<ReportPojo>>(reportlist,HttpStatus.OK);
		
		return re;
	}
}
