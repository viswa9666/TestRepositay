package com.slokam.springhealthcare.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.springhealthcare.entity.MedicinPojo;
@Repository
public interface MedicinDao extends JpaRepository<MedicinPojo, Long> {
	
	@Query("select m.id,m.medicinname from MedicinPojo m")
	public List<MedicinPojo > GetMedicianList();

}
