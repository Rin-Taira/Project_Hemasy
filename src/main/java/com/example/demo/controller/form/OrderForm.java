package com.example.demo.controller.form;

import java.sql.Timestamp;

public class OrderForm {

	private int menuId;
    private String menuName;
    private int userId;
    private String userName;
    private int brownFlag;
    private int bigFlag;
    private int riceIncFlag;
    private int price;
    private Timestamp orderDate;
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getBrownFlag() {
		return brownFlag;
	}
	public void setBrownFlag(int brownFlag) {
		this.brownFlag = brownFlag;
	}
	public int getBigFlag() {
		return bigFlag;
	}
	public void setBigFlag(int bigFlag) {
		this.bigFlag = bigFlag;
	}
	public int getRiceIncFlag() {
		return riceIncFlag;
	}
	public void setRiceIncFlag(int riceIncFlag) {
		this.riceIncFlag = riceIncFlag;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Timestamp getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}
    
	
}