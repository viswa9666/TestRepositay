package com.slokam.springhealthcare.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.springhealthcare.Dao.ReportDao;
import com.slokam.springhealthcare.entity.ReportPojo;

@Service
public class ReportService {

	@Autowired
	private ReportDao reportdao;
	
	public void SaveReportData(ReportPojo report){
		reportdao.save(report);
	}
	public List<ReportPojo> GetReportList(){
		return reportdao.GetReportList();
	}
}
