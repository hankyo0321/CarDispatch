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
@Table(name = "CarDispatchEntryExitRecord", schema = "dbo")
public class CarDispatchEntryExitRecord extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RecordID")
	private Long recordID;

	@NotBlank
	@Column(name = "EntryOrExit")
	private String entryOrExit;

	@NotBlank
	@Column(name = "CarID")
	private String carID;

	@NotBlank
	@Column(name = "DriverID")
	private String driverID;

	@NotBlank
	@Column(name = "Miles")
	private Double miles;

	@NotBlank
	@Column(name = "ReasonID")
	private String reasonID;

	@Column(name = "Description")
	private String description;

}
