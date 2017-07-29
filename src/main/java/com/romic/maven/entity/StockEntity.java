package com.romic.maven.entity;

import com.romic.maven.main.DateUtil;

public class StockEntity {
	
	private int id;
	private String name;
	private String number;
	private double price;
	private int time;
	public StockEntity() {
		super();
	}
	public StockEntity(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}
	public StockEntity(String name, String number, double price, int time) {
		super();
		this.name = name;
		this.number = number;
		this.price = price;
		this.time = time;
	}
	public StockEntity(String name, String number, double price, String time) {
		super();
		this.name = name;
		this.number = number;
		this.price = price;
		this.setTimeString(time);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getTimeString() {
		return DateUtil.getTime(time);
	}
	public void setTimeString(String time) {
		this.time = DateUtil.getTimeStemp(time);
	}
	public Double equalsPrice(StockEntity stockEntity){
		return Double.valueOf(String.format("%.2f", (this.getPrice() / stockEntity.getPrice() * 100 - 100)));
	}
	@Override
	public String toString() {
		return "StockEntity [id=" + id + ",name=" + name + ", number=" + number + ", price=" + price + ", time=" + time + ", timeString=" + this.getTimeString() + "]";
	}
}
