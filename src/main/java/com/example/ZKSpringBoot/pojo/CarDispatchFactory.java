package com.example.ZKSpringBoot.pojo;

import com.example.ZKSpringBoot.pojo.base.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "CarDispatchFactory", schema = "dbo")
public class CarDispatchFactory extends BaseEntity {

	/**
	 * DriverID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DriverID")
	private Long factID;

	@NotBlank
	@Column(name = "FactNo")
	private String factNo;

	@NotBlank
	@Column(name = "FactName")
	private String factName;

	@Column(name = "Description")
	private String description;

}
