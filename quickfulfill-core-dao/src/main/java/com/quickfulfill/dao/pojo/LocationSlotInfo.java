package com.quickfulfill.dao.pojo;

import java.io.Serializable;
import java.util.Date;

public class LocationSlotInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String locationId;
	private String slotFrom;
	private String slotTo;
	private String slotCapacity;
	private boolean Active;
	private int id;
	private Date creationTime;
	private Date modifiedTime;
	public LocationSlotInfo(String locationId, String slotFrom, String slotTo,
			String slotCapacity, boolean active, int id, Date creationTime,
			Date modifiedTime) {
		super();
		this.locationId = locationId;
		this.slotFrom = slotFrom;
		this.slotTo = slotTo;
		this.slotCapacity = slotCapacity;
		Active = active;
		this.id = id;
		this.creationTime = creationTime;
		this.modifiedTime = modifiedTime;
	}
	public String getLocationId() {
		return locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	public String getSlotFrom() {
		return slotFrom;
	}
	public void setSlotFrom(String slotFrom) {
		this.slotFrom = slotFrom;
	}
	public String getSlotTo() {
		return slotTo;
	}
	public void setSlotTo(String slotTo) {
		this.slotTo = slotTo;
	}
	public String getSlotCapacity() {
		return slotCapacity;
	}
	public void setSlotCapacity(String slotCapacity) {
		this.slotCapacity = slotCapacity;
	}
	public boolean isActive() {
		return Active;
	}
	public void setActive(boolean active) {
		Active = active;
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
