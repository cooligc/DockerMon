/**
 * 
 */
package com.skc.broaker;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author sitakant
 *
 */
@Entity
@Table(name="SLACK_REQUEST_AUDIT")
public class SlackRequestEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="CONTAINER_NAME")
	private String containerName;
	
	@Column(name="REQUESTED_STATUS")
	private String requestStatus;
	
	@Column(name="REQUESTED_TIME")
	private String requestedTime;
	
	@Column(name="CURRENT_STATUS")
	private String currentStatus;
	
	@Column(name="REQUESTED_BY")
	private String requestedUser;
	
	@Column(name="FROM_CHANNEL")
	private String fromChannel;
	
	@Column(name="CREATED_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the containerName
	 */
	public String getContainerName() {
		return containerName;
	}
	/**
	 * @param containerName the containerName to set
	 */
	public void setContainerName(String containerName) {
		this.containerName = containerName;
	}
	/**
	 * @return the requestStatus
	 */
	public String getRequestStatus() {
		return requestStatus;
	}
	/**
	 * @param requestStatus the requestStatus to set
	 */
	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}
	/**
	 * @return the requestedTime
	 */
	public String getRequestedTime() {
		return requestedTime;
	}
	/**
	 * @param requestedTime the requestedTime to set
	 */
	public void setRequestedTime(String requestedTime) {
		this.requestedTime = requestedTime;
	}
	/**
	 * @return the currentStatus
	 */
	public String getCurrentStatus() {
		return currentStatus;
	}
	/**
	 * @param currentStatus the currentStatus to set
	 */
	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}
	
	/**
	 * @return the requestedUser
	 */
	public String getRequestedUser() {
		return requestedUser;
	}
	/**
	 * @param requestedUser the requestedUser to set
	 */
	public void setRequestedUser(String requestedUser) {
		this.requestedUser = requestedUser;
	}
	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the fromChannel
	 */
	public String getFromChannel() {
		return fromChannel;
	}
	/**
	 * @param fromChannel the fromChannel to set
	 */
	public void setFromChannel(String fromChannel) {
		this.fromChannel = fromChannel;
	}
	
}
