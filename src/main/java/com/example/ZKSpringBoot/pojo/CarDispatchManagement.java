package com.example.ZKSpringBoot.pojo;

import java.util.Date;

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
@Table(name = "CarDispatchManagement", schema = "dbo")
public class CarDispatchManagement extends BaseEntity {

	/**
	 * DriverID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DispatchID")
	private Long dispatchID;

	@Column(name = "DispatchNo")
	private String dispatchNo;

	@Column(name = "AppID ")
	private String appID;

	@Column(name = "CarID")
	private String carID;
	
	@Column(name = "DriverID")
	private String driverID;
	
	@Column(name = "DispatchDate")
	private Date dispatchDate;
	
	@Column(name = "WaitingPlace")
	private String waitingPlace;
	
	@Column(name = "RentFlag")
	private String rentFlag;
	
	@Column(name = "RentID")
	private String rentID;
	
	@Column(name = "CarpoolingFlag")
	private String carpoolingFlag;

}
