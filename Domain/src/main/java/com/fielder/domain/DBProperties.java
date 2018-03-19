package com.fielder.domain;

import java.util.Date;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
//https://dzone.com/articles/spring-data-jpa-auditing-automatically-the-good-stuff
public abstract class DBProperties {
	
	@CreatedBy
	protected String createdBy;
	
	@CreatedDate
    @Temporal(TemporalType.DATE)
	protected Date createdDate;
	
	@LastModifiedBy
	protected String updatedBy;

	@LastModifiedDate
    @Temporal(TemporalType.DATE)
	protected Date updatedDate;
	
//	@PrePersist
//	protected void onCreate() {
//		Date now = new Date();
//		createdDate = now;
//		updatedDate = now;
//	}
//
//	@PreUpdate
//	protected void onUpdate() {
//		updatedDate = new Date();
//	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

}
