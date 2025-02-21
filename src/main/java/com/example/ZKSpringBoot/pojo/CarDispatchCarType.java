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
@Table(name = "CarDispatchCarType", schema = "dbo")
public class CarDispatchCarType extends CarDispatchBaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CarTypeID")
	private Long CarTypeID;

	@Column(name ="CarType")
	private String carType;
	
	
}
