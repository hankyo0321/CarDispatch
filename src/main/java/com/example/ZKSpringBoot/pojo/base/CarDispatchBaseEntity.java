package com.example.ZKSpringBoot.pojo.base;

import java.io.Serializable;
import java.time.ZonedDateTime;

import org.hibernate.annotations.Comment;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class CarDispatchBaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "CreateUser")
	@CreatedBy
	@Comment("創建者")
	private String createUser;

	@LastModifiedBy
	@Column(name = "CreateDate")
	@Comment("創立時間")
	private ZonedDateTime CreateDate;

	@CreatedBy
	@Column(name = "UpdateUser")
	@Comment("編輯者")
	private String updateUser;

	@LastModifiedBy
	@UpdateTimestamp
	@Column(name = "UpdateDate")
	@Temporal(TemporalType.TIMESTAMP)
	@Comment("編輯時間")
	private ZonedDateTime updateDate;

	@Column(name = "ValidFlag")
	private String validFlag;

}
