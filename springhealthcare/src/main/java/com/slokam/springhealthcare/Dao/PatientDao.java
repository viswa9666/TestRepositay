package com.slokam.springhealthcare.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.springhealthcare.entity.PatientPojo;
@Repository
public interface PatientDao extends JpaRepository<PatientPojo, Long> {
	
	@Query("select p.patientname,p.statuslist.name,d.doctorname from PatientPojo p join p.doctorlist d  where p.id=?1")
	
	public List<Object> GetPatientId(Long id);

}
