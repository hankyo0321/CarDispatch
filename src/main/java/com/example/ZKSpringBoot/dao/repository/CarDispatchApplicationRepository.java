package com.example.ZKSpringBoot.dao.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ZKSpringBoot.pojo.CarDispatchApplication;

@Repository
public interface CarDispatchApplicationRepository extends JpaRepository<CarDispatchApplication,Long> {
	
		List<CarDispatchApplication> findByUserName(String username);
		
		Optional<CarDispatchApplication> findByAppNo(String appNo);
}
