package com.example.ZKSpringBoot.pojo;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "CarDispatchApproverHistory" , schema = "dbo")
public class CarDispatchApproverHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "HistoryID")
	private Long HistoryID;

	@Column(name = "AppID")
	private String AppID;

	@Column(name = "VerifyUser1")
	private String VerifyUser1;

	@Column(name = "VerifyStatus1")
	private String VerifyStatus1;

	@Column(name = "VerifyDate1")
	private Date VerifyDate1;

	@Column(name = "VerifyUser2")
	private String VerifyUser2;

	@Column(name = "VerifyStatus2")
	private String VerifyStatus2;

	@Column(name = "VerifyDate2")
	private Date VerifyDate2;

	@Column(name = "Description")
	private String Description;
}
