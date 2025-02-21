package com.example.ZKSpringBoot.pojo;

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
@Table(name = "CarDispatchVerifySetting", schema = "dbo")
public class CarDispatchVerifySetting {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "VerifyID")
	private Long verifyID;

	@NotBlank
	@Column(name = "GroupID")
	private String groupID;

	@NotBlank
	@Column(name = "VerifyGroupID1")
	private String verifyGroupID1;

	@Column(name = "VerifyGroupID2")
	private String verifyGroupID2;
}
