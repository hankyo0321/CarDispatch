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
@Table(name = "CarDispatchApplication" ,  schema = "dbo")
public class CarDispatchApplication extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name = "AppID")
	private Long appID;
	/**
	 * 申請單號
	 */
	@Column(name = "AppNo")
	private String appNo;

	@Column(name = "FactID")
	private String factID;

	@Column(name = "AppGroupID")
	private String appGroupID;
	
	/**
	 * 申請日期
	 */
	@Column(name = "AppDate")
	private Date appDate;
	
	/**
	 * 用車性質
	 */
	@Column(name = "UseType")
	private String useType;
	
	/**
	 * 預計出發
	 */
	@Column(name = "ExpecedDateFm")
	private Date expecedDateFm;
	
	/**
	 * 預計返回
	 */
	@Column(name = "ExpecedDateTo")
	private Date expecedDateTo;
	
	/**
	 * 部門
	 */
	@Column(name = "DeptID")
	private String deptID;
	
	/**
	 * 用車等級
	 */
	@Column(name = "CarLevel")
	private String carLevel;
	
	/***
	 * 車輛類型
	 */
	@Column(name = "CarTypeID")
	private String carTypeID;
	
	/**
	 * 使用人
	 */
	@Column(name = "UserName")
	private String userName;
	
	/**
	 * 乘座人數
	 */
	@Column(name = "NumberOfPeole")
	private Integer numberOfPeole;
	
	/**
	 * 隨車人員
	 */
	@Column(name = "Companions")
	private String companions;
	
	/**
	 * 目的地址
	 */
	@Column(name = "Destination")
	private String destination;
	
	/**
	 * 事由
	 */
	@Column(name = "Reason")
	private String reason;
	
	/**
	 * 候車地點
	 */
	@Column(name = "WaitingPlace")
	private String waitingPlace;
	
	/**
	 * 申請狀態
	 */
	@Column(name = "AppStatus")
	private String appStatus;
	
	/**
	 * 
	 */
	@Column(name = "DispatchID")
	private String dispatchID;
	
	

}
