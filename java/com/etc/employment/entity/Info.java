package com.etc.employment.entity;

public class Info {
	private int iid ;		//主键
	private int postid;		//发送消息者id
	private int getis;		//消息发送者id
	private String itime;		//时间
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	public int getPostid() {
		return postid;
	}
	public void setPostid(int postid) {
		this.postid = postid;
	}
	public int getGetis() {
		return getis;
	}
	public void setGetis(int getis) {
		this.getis = getis;
	}
	public String getItime() {
		return itime;
	}
	public void setItime(String itime) {
		this.itime = itime;
	}
	@Override
	public String toString() {
		return "Info [iid=" + iid + ", postid=" + postid + ", getis=" + getis
				+ ", itime=" + itime + "]";
	}
	public Info(int iid, int postid, int getis, String itime) {
		super();
		this.iid = iid;
		this.postid = postid;
		this.getis = getis;
		this.itime = itime;
	}
	public Info() {
		super();
	}
	
}
