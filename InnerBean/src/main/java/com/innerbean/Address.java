package com.innerbean;

public class Address {
	private int Hno;
	private String Streetno;
	private String city;
	public int getHno() {
		return Hno;
	}
	public void setHno(int hno) {
		Hno = hno;
	}
	public String getStreetno() {
		return Streetno;
	}
	public void setStreetno(String streetno) {
		Streetno = streetno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address Hno=" + Hno + ", Streetno=" + Streetno + ", city=" + city ;
	}
	
	

}
