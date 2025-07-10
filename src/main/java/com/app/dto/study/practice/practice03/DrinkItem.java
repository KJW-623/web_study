package com.app.dto.study.practice.practice03;

public class DrinkItem {

	String name;
	String type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "DrinkItem [name=" + name + ", type=" + type + "]";
	}
	
}
