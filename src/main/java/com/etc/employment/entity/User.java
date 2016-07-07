package com.etc.employment.entity;

import java.util.List;

public class User {
	private int uid;
	private String uname;
	private String upassword;
	private List<Role> roles;
	private Certi certi;
	
	public User() {
		super();
	}
	public User(int uid, String uname, String upassword) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upassword = upassword;
	}
	public User(String uname, String upassword) {
		super();
	
		this.uname = uname;
		this.upassword = upassword;
	}
	
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public Certi getCerti() {
		return certi;
	}
	public void setCerti(Certi certi) {
		this.certi = certi;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upassword="
				+ upassword + ", roles=" + roles + ", certi=" + certi + "]";
	}

	
	
}
