package com.slokam.springhealthcare.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.springhealthcare.entity.StatusPojo;
@Repository
public interface StatusDao extends JpaRepository<StatusPojo, Long> {
	
	@Query("select s.id,s.name from StatusPojo s ")
	public List<StatusPojo> GetSatatusList();

}
