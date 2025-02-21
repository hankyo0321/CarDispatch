package com.example.ZKSpringBoot.pojo;

import com.example.ZKSpringBoot.pojo.base.CarDispatchBaseEntity;

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
@Table(name = "CarDispatchReason", schema = "dbo")
public class CarDispatchReason extends CarDispatchBaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ReasonID")
	private Long reasonID;

	@NotBlank
	@Column(name = "FactID")
	private String factID;

	@NotBlank
	@Column(name = "Reason")
	private String reason;
}
