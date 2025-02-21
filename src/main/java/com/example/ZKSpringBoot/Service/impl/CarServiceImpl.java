//package com.example.ZKSpringBoot.Service.impl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Service;
//
//import com.example.ZKSpringBoot.Service.CarService;
//import com.example.ZKSpringBoot.dao.repository.CarRepository;
//import com.example.ZKSpringBoot.pojo.Car;
//
//
//@Service("carService")
//@Scope("singleton")
//public class CarServiceImpl implements CarService {
//	
//	
//	@Autowired
//	CarRepository carRepository;
//
//	@Override
//	public List<Car> getCarByMake(String make) {
//		
//		return carRepository.findByMakeContaining(make);
//	}
//
//	@Override
//	public void saveCar(Car car) {
//		
//		carRepository.save(car);
//	}
//	
//	
//
//}
