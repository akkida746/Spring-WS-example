package com.mkyong.bo.impl;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Item")
@XmlType(propOrder={"itemId", "status"})
public class Item implements Serializable{
	
	private String itemId;
	private String status;
	
	public Item() {
		
	}
	
	public Item(String itemId, String status) {
		super();
		this.itemId = itemId;
		this.status = status;
	}
	/**
	 * @return the itemId
	 */
	@XmlElement(name="itemid")
	public String getItemId() {
		return itemId;
	}
	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
