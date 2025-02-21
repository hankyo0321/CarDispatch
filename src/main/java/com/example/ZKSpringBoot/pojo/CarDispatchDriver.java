package com.example.ZKSpringBoot.pojo;

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
@Table(name = "CarDispatchDriver", schema = "dbo")
public class CarDispatchDriver extends CarDispatchBaseEntity {

	/**
	 * DriverID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DriverID")
	private Long driverID;

	@Column(name = "FactID")
	private String factID;

	@Column(name = "DriverGroupID")
	private String driverGroupID;

	@Column(name = "DriverName")
	private String driverName;

	@Column(name = "PhoneNo")
	private String phoneNo;

	@Column(name = "ShortNo")
	private String shortNo;

	@Column(name = "Mail")
	private String mail;

}
