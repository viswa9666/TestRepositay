package com.slokam.springhealthcare.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.springhealthcare.Dao.MedicinDao;
import com.slokam.springhealthcare.entity.MedicinPojo;

@Service
public class MedicinService {

	@Autowired
	private MedicinDao medicindao;
	
	
	public void SaveMedicinData(MedicinPojo medicin){
		medicindao.save(medicin);
		
	}
	public List<MedicinPojo > GetMedicianList(){
		return medicindao.GetMedicianList();
	}
}
