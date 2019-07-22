package com.slokam.springhealthcare.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.springhealthcare.Dao.WardDao;
import com.slokam.springhealthcare.entity.WardPojo;

@Service
public class WardService {

	@Autowired
	private WardDao warddao;
	
	
	public void SaveWardData(WardPojo ward){
		warddao.save(ward);
	}
	public List<WardPojo> GetWardList(){
		return warddao.GetWardList();
	}
}
