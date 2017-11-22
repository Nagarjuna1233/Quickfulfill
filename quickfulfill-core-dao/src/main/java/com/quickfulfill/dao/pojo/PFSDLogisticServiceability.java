package com.quickfulfill.dao.pojo;

import java.io.Serializable;
import java.util.Date;

public class PFSDLogisticServiceability implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String logisticid;
	private String deliverymode;
	private String transportmode;
	private String srcpincode;
	private String destpincode;
	private boolean fragile;
	private boolean precious;
	private boolean scheduled;
	private int deliveryTat;
	private boolean active;
	private int id;
	private Date creationTime;
	private Date modifiedTime;
	public PFSDLogisticServiceability(String logisticid, String deliverymode,
			String transportmode, String srcpincode, String destpincode,
			boolean fragile, boolean precious, boolean scheduled,
			int deliveryTat, boolean active, int id, Date creationTime,
			Date modifiedTime) {
		super();
		this.logisticid = logisticid;
		this.deliverymode = deliverymode;
		this.transportmode = transportmode;
		this.srcpincode = srcpincode;
		this.destpincode = destpincode;
		this.fragile = fragile;
		this.precious = precious;
		this.scheduled = scheduled;
		this.deliveryTat = deliveryTat;
		this.active = active;
		this.id = id;
		this.creationTime = creationTime;
		this.modifiedTime = modifiedTime;
	}
	public String getLogisticid() {
		return logisticid;
	}
	public void setLogisticid(String logisticid) {
		this.logisticid = logisticid;
	}
	public String getDeliverymode() {
		return deliverymode;
	}
	public void setDeliverymode(String deliverymode) {
		this.deliverymode = deliverymode;
	}
	public String getTransportmode() {
		return transportmode;
	}
	public void setTransportmode(String transportmode) {
		this.transportmode = transportmode;
	}
	public String getSrcpincode() {
		return srcpincode;
	}
	public void setSrcpincode(String srcpincode) {
		this.srcpincode = srcpincode;
	}
	public String getDestpincode() {
		return destpincode;
	}
	public void setDestpincode(String destpincode) {
		this.destpincode = destpincode;
	}
	public boolean isFragile() {
		return fragile;
	}
	public void setFragile(boolean fragile) {
		this.fragile = fragile;
	}
	public boolean isPrecious() {
		return precious;
	}
	public void setPrecious(boolean precious) {
		this.precious = precious;
	}
	public boolean isScheduled() {
		return scheduled;
	}
	public void setScheduled(boolean scheduled) {
		this.scheduled = scheduled;
	}
	public int getDeliveryTat() {
		return deliveryTat;
	}
	public void setDeliveryTat(int deliveryTat) {
		this.deliveryTat = deliveryTat;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
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
