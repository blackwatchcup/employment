package com.etc.employment.entity;

public class Certi {
	private int cid;
	private String cnum;
	private String address;
	
	public Certi() {
		super();
	}
	
	public Certi(int cid, String cnum, String address) {
		super();
		this.cid = cid;
		this.cnum = cnum;
		this.address = address;
	}

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCnum() {
		return cnum;
	}
	public void setCnum(String cnum) {
		this.cnum = cnum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Certi [cid=" + cid + ", cnum=" + cnum + ", address=" + address
				+ "]";
	}
	
}
