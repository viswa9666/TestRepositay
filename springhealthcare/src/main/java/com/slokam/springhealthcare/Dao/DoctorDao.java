package com.slokam.springhealthcare.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.springhealthcare.entity.DoctorPojo;
@Repository
public interface DoctorDao extends JpaRepository<DoctorPojo, Long> {
	
	@Query("select d.id,d.doctorname from DoctorPojo d")
	public List<DoctorPojo> getdoctordata();

}
