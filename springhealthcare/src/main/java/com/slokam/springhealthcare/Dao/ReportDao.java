package com.slokam.springhealthcare.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.springhealthcare.entity.ReportPojo;
@Repository
public interface ReportDao extends JpaRepository<ReportPojo, Long> {
	
	@Query("select r.id,r.name from ReportPojo r")
	public List<ReportPojo> GetReportList();

}
