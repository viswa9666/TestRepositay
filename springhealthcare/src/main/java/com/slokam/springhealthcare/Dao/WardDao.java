package com.slokam.springhealthcare.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.springhealthcare.entity.WardPojo;
@Repository
public interface WardDao extends JpaRepository<WardPojo, Long>{
	@Query("select w.id,w.wardname from WardPojo w")
	public List<WardPojo> GetWardList();

}
