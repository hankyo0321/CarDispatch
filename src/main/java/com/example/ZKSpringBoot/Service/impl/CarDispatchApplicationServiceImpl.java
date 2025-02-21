package com.example.ZKSpringBoot.Service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ZKSpringBoot.Service.CarDispatchApplicationService;
import com.example.ZKSpringBoot.dao.repository.CarDispatchApplicationRepository;
import com.example.ZKSpringBoot.model.bo.CarDispatchApplicationBO;
import com.example.ZKSpringBoot.pojo.CarDispatchApplication;
import com.example.ZKSpringBoot.utils.BaseUtils;

import jakarta.transaction.Transactional;

@Service("CarDispatchApplicationService")
public class CarDispatchApplicationServiceImpl implements CarDispatchApplicationService {

	@Autowired
	private CarDispatchApplicationRepository carDispatchApplicationRepository;

	@Override
	@Transactional
	public CarDispatchApplicationBO save(CarDispatchApplicationBO carDispatchApplication) throws Exception {
		CarDispatchApplicationBO resultBO = new CarDispatchApplicationBO();
		if (carDispatchApplication == null) {
			throw new Exception("申請單不可為空");
		}
		CarDispatchApplication carDispatchApplicationPo = new CarDispatchApplication();
		carDispatchApplicationPo.setAppDate(carDispatchApplication.getAppDate());
		carDispatchApplicationPo.setUseType(carDispatchApplication.getUseType());
		carDispatchApplicationPo.setExpecedDateFm(carDispatchApplication.getExpecedDateFm());
		carDispatchApplicationPo.setExpecedDateTo(carDispatchApplication.getExpecedDateTo());
		carDispatchApplicationPo.setCarLevel(carDispatchApplication.getCarLevel());
		carDispatchApplicationPo.setCarTypeID(carDispatchApplication.getCarTypeID());
		carDispatchApplicationPo.setUserName(carDispatchApplication.getUserName());
		carDispatchApplicationPo.setNumberOfPeole(carDispatchApplication.getNumberOfPeole());
		carDispatchApplicationPo.setCompanions(carDispatchApplication.getCompanions());
		carDispatchApplicationPo.setDestination(carDispatchApplication.getDestination());
		carDispatchApplicationPo.setReason(carDispatchApplication.getReason());
		carDispatchApplicationPo.setWaitingPlace(carDispatchApplication.getWaitingPlace());
		CarDispatchApplication savedPo = carDispatchApplicationRepository.save(carDispatchApplicationPo);
		BaseUtils.copyPropertiesAutoConvert(savedPo, resultBO);
		return resultBO;
	}

	@Override
	public List<CarDispatchApplicationBO> findAll() {
		List<CarDispatchApplication> carDipatchApplicationPOList = carDispatchApplicationRepository.findAll();
		carDipatchApplicationPOList.stream().forEach(car -> {
			car.setCarLevel(ConverCarLevel(car.getCarLevel()));
			car.setUseType(ConverUseType(car.getUseType()));
		});
		return BaseUtils.copyListProperties(carDipatchApplicationPOList, CarDispatchApplicationBO::new);
	}

	private static String ConverUseType(String useType) {
		String result = "";
		switch (useType) {
		case "1":
			result = "一般用車";
			break;
		case "2":
			result = "特殊用車";
			break;
		case "3":
			result = "緊急用車";
			break;
		}
		return result;
	}
	
	private static String ConverCarLevel(String carLevel) {
		String result = "";
		switch (carLevel) {
		case "1":
			result = "一般";
			break;
		case "2":
			result = "高級";
			break;
		case "3":
			result = "特殊";
			break;
		}
		return result;
	}

	@Override
	public CarDispatchApplicationBO findById(Long ID) throws Exception {
		Optional<CarDispatchApplication> carDispatchApplication = carDispatchApplicationRepository.findById(ID);
		if (carDispatchApplication.isPresent()) {
			CarDispatchApplication carDispatchApplicationPO = carDispatchApplication.get();
			return BaseUtils.copyProperties(carDispatchApplicationPO, CarDispatchApplicationBO::new);
		} else {
			throw new Exception("查無派車資訊");
		}
	}

	@Override
	public Boolean deleteCarDispatchApplication(Long ID) {
		Optional<CarDispatchApplication> carDispatchApplication = carDispatchApplicationRepository.findById(ID);
		if (carDispatchApplication.isPresent()) {
			carDispatchApplicationRepository.delete(carDispatchApplication.get());
			return true;
		}
		return false;
	}

	@Override
	public List<CarDispatchApplicationBO> findByUserName(String userName) {
		List<CarDispatchApplication> carDipatchApplicationPOList = carDispatchApplicationRepository
				.findByUserName(userName);
		carDipatchApplicationPOList.stream().forEach(car -> {
			car.setCarLevel(ConverCarLevel(car.getCarLevel()));
			car.setUseType(ConverUseType(car.getUseType()));
		});
		return BaseUtils.copyListProperties(carDipatchApplicationPOList, CarDispatchApplicationBO::new);
	}

	@Override
	public CarDispatchApplicationBO findByAppNo(String appNo) {
		Optional<CarDispatchApplication> carDispatchApplication = carDispatchApplicationRepository.findByAppNo(appNo);
		if (carDispatchApplication.isPresent()) {
			CarDispatchApplication CarDispatchApplicationPO =carDispatchApplication.get();
			CarDispatchApplicationPO.setCarLevel(ConverCarLevel(CarDispatchApplicationPO.getCarLevel()));
			CarDispatchApplicationPO.setUseType(ConverUseType(CarDispatchApplicationPO.getUseType()));
			return BaseUtils.copyProperties(carDispatchApplication.get(), CarDispatchApplicationBO::new);
		}
		return null;
	}

	@Override
	public void isdelete(CarDispatchApplication carDispatchApplication) {
		
		carDispatchApplicationRepository.delete(carDispatchApplication);
	}

}
