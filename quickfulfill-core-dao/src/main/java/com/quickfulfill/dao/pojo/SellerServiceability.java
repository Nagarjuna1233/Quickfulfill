package com.quickfulfill.dao.pojo;

import java.io.Serializable;
import java.util.Date;

public class SellerServiceability implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sellerId;
	private String pincode;
	private String fulfilmentType;
	private String transportMode;
	private String deliveryMode;
	private String locationList;
	private int id;
	private Date creationTime;
	private Date modifiedTime;
	public SellerServiceability(String sellerId, String pincode,
			String fulfilmentType, String transportMode, String deliveryMode,
			String locationList, int id, Date creationTime, Date modifiedTime) {
		super();
		this.sellerId = sellerId;
		this.pincode = pincode;
		this.fulfilmentType = fulfilmentType;
		this.transportMode = transportMode;
		this.deliveryMode = deliveryMode;
		this.locationList = locationList;
		this.id = id;
		this.creationTime = creationTime;
		this.modifiedTime = modifiedTime;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getFulfilmentType() {
		return fulfilmentType;
	}
	public void setFulfilmentType(String fulfilmentType) {
		this.fulfilmentType = fulfilmentType;
	}
	public String getTransportMode() {
		return transportMode;
	}
	public void setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}
	public String getDeliveryMode() {
		return deliveryMode;
	}
	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}
	public String getLocationList() {
		return locationList;
	}
	public void setLocationList(String locationList) {
		this.locationList = locationList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
	public Date getModifiedTime() {
		return modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	
}
