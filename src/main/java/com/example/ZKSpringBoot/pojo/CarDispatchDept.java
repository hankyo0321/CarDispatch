package com.example.ZKSpringBoot.pojo;

import com.example.ZKSpringBoot.pojo.base.BaseEntity;
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
@Table(name = "CarDispatchDept", schema = "dbo")
public class CarDispatchDept extends CarDispatchBaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DeptID")
	private Long DeptID;
	
	
	@Column(name = "FactID")
	private String factID;
	
	@Column(name = "DeptNo")
	private String deptNo;
	
	@Column(name = "DeptName")
	private String deptName;
	

}
