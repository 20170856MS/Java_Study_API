package com.util.list.ex1;

public class CityDTO {
	//도시의 날씨정보
	
	
	private String name; //도시명
	private double gion; //기온정보
	private int hun; //습도정보
	private String status; //맑음, 비 ,눈 태풍 
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGion() {
		return gion;
	}
	public void setGion(double gion) {
		this.gion = gion;
	}
	public int getHun() {
		return hun;
	}
	public void setHun(int hun) {
		this.hun = hun;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
