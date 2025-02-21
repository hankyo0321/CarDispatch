package com.example.ZKSpringBoot.model.bo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)// 避免洩漏敏感
public class CarDispatchApplicationBO {
	
	private Long appID;
	
	private String appNo;
	
	private String factID;
	
	private String appGroupID;
	
	private Date appDate;
	
	private String useType;
	
	private Date expecedDateFm;
	
	private Date expecedDateTo;
	
	private String deptID;
	
	private String carLevel;
	
	private String carTypeID;
	
	private String userName;
	
	private Integer numberOfPeole;
	
	private String companions;
	
	private String destination;
	
	private String reason;
	
	private String waitingPlace;
	
	private String appStatus;
	
	private String dispatchID;
	
	public CarDispatchApplicationBO(Date appDate ,String useType,Date expecedDateFm,Date expecedDateTo,String deptID,String carLevel,
			String carTypeID,String userName ,Integer numberOfPeole , String companions, String destination,  String reason,String waitingPlace ) {
		this.appDate = appDate;
		this.useType = useType;
		this.expecedDateFm = expecedDateFm;
		this.expecedDateTo= expecedDateTo;
		this.carLevel = carLevel;
		this.carTypeID = carTypeID;
		this.userName=userName;
		this.numberOfPeole = numberOfPeole;
		this.companions =companions;
		this.destination =destination;
		this.reason= reason;
		this.waitingPlace=waitingPlace;
		
	}
	
	
	
	
}
