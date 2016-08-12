package com.mkyong.bo.impl;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Order")
@XmlType(propOrder={"orderid", "items"})
public class Order implements Serializable{

	private String orderid;
	private List<Item> items;
		
	public Order() {
		
	}
	public Order(String orderid, List<Item> items) {
		super();
		this.orderid = orderid;
		this.items = items;
	}
	
	/**
	 * @return the orderid
	 */
	@XmlElement(name="orderid")
	public String getOrderid() {
		return orderid;
	}
	/**
	 * @param orderid the orderid to set
	 */
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	/**
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}
	/**
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	

}
