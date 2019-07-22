package com.slokam.springhealthcare.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.springhealthcare.Dao.StatusDao;
import com.slokam.springhealthcare.entity.StatusPojo;

@Service
public class StatusService {

	@Autowired
	private StatusDao statusdao;
	
	public void SaveStatusData(StatusPojo status){
		statusdao.save(status);
		
	}
	public List<StatusPojo> GetSatatusList(){
		return statusdao.GetSatatusList();
	}
}
