package com.example.ZKSpringBoot.pojo;

import com.example.ZKSpringBoot.pojo.base.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "CarDispatchRent", schema = "dbo")
public class CarDispatchRent extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RentID")
	private Long rentID;

	@Column(name = "FactID")
	private String factID;

	@Column(name = "DriverName")
	private String driverName;

	@Column(name = "DriverPhoneNo")
	private String driverPhoneNo;

	@Column(name = "CarPlateNo")
	private String carPlateNo;

	@Column(name = "CarCapacity")
	private Double carCapacity;

	@Column(name = "LoadCapacity")
	private Double loadCapacity;

	@Column(name = "UnitPrice")
	private Double unitPrice;
}
