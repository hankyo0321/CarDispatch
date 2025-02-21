package com.example.ZKSpringBoot.Service;

import java.util.List;

import com.example.ZKSpringBoot.model.bo.CarDispatchApplicationBO;
import com.example.ZKSpringBoot.pojo.CarDispatchApplication;

/**
 * 派車申請
 */

public interface CarDispatchApplicationService {
	
	
	CarDispatchApplicationBO save(CarDispatchApplicationBO carDispatchApplication ) throws Exception;
	
	List<CarDispatchApplicationBO> findAll();
	
	CarDispatchApplicationBO findById(Long ID) throws Exception;
	
	Boolean deleteCarDispatchApplication(Long ID);

	List<CarDispatchApplicationBO> findByUserName(String userName);

	CarDispatchApplicationBO findByAppNo(String appNo);
	
	void isdelete(CarDispatchApplication carDispatchApplication);
	
}
