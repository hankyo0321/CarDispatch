package com.example.ZKSpringBoot.pojo;

import java.util.Date;

import com.example.ZKSpringBoot.pojo.base.CarDispatchBaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "CarDispatchCar", schema = "dbo")
public class CarDispatchCar extends CarDispatchBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CarID")
	private Long carID;
	
	@Column(name = "FactID")
	private String factID;
	
	@Column(name = "CarTypeID")
	private String CarTypeID;
	
	@Column(name = "CarPlateNo")
	private String carPlateNo;
	
	@Column(name = "CarBrand")
	private String carBrand;
	
	@Column(name = "CarModel")
	private String carModel;

	@Column(name = "CarCapacity")
	private Double carCapacity;
	
	@Column(name = "YearOfProduction")
	private String yearOfProduction;
	
	@Column(name = "CarColor")
	private String carColor;
	
	@Column(name = "CarVin")
	private String carVin;
	
	@Column(name = "PurchaseDate")
	private Date purchaseDate;
	
	@Column(name = "Price")
	private Double price;
	
	@Column(name = "MaintenanceDate")
	private Date maintenanceDate;
	
	@Column(name = "InsuranceExDate")
	private Date insuranceExDate;
	
	@Column(name = "loadCapacity")
	private Double LoadCapacity;
	
	@Column(name = "Description")
	private String description;
	
	@Column(name = "EnableFlag")
	private String enableFlag;
}
