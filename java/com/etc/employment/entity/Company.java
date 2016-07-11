package com.etc.employment.entity;

public class Company {
	private int cid;
	private String cname;
	private String cpwd;
	private String cphone;
	private String company;
	private String caddress;
	private int cbalance ;
	private int ctag;
	
	
	public Company() {
		super();
	}
	public Company(int cid, String cname, String cpwd, String cphone,
			String company, String caddress, int cbalance, int ctag) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cpwd = cpwd;
		this.cphone = cphone;
		this.company = company;
		this.caddress = caddress;
		this.cbalance = cbalance;
		this.ctag = ctag;
	}
	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + ", cpwd=" + cpwd
				+ ", cphone=" + cphone + ", company=" + company + ", caddress="
				+ caddress + ", cbalance=" + cbalance + ", ctag=" + ctag + "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCpwd() {
		return cpwd;
	}
	public void setCpwd(String cpwd) {
		this.cpwd = cpwd;
	}
	public String getCphone() {
		return cphone;
	}
	public void setCphone(String cphone) {
		this.cphone = cphone;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public int getCbalance() {
		return cbalance;
	}
	public void setCbalance(int cbalance) {
		this.cbalance = cbalance;
	}
	public int getCtag() {
		return ctag;
	}
	public void setCtag(int ctag) {
		this.ctag = ctag;
	}
	

}
