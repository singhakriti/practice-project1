package com.vc.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vc.entity.Citizens;

@Repository
public interface CitizenRepository extends JpaRepository<Citizens, Integer>{
	List<Citizens> findByListofvc_Vcid(int vcid);

	

}

