package com.etc.employment.entity;
/*
 * 
 * 公告表
 */
public class Notice {
	private int nid;		//主键
	private String nauthor;//发布者
	private String ntitle;//
	private String ncontent;
	private String ntime; //发布时间
	
	
	
	public Notice() {
		super();
	}
	public Notice(int nid, String nauthor, String ntitle, String ncontent,
			String ntime) {
		super();
		this.nid = nid;
		this.nauthor = nauthor;
		this.ntitle = ntitle;
		this.ncontent = ncontent;
		this.ntime = ntime;
	}
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public String getNauthor() {
		return nauthor;
	}
	public void setNauthor(String nauthor) {
		this.nauthor = nauthor;
	}
	public String getNtitle() {
		return ntitle;
	}
	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}
	public String getNcontent() {
		return ncontent;
	}
	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}
	public String getNtime() {
		return ntime;
	}
	public void setNtime(String ntime) {
		this.ntime = ntime;
	}
	@Override
	public String toString() {
		return "Notice [nid=" + nid + ", nauthor=" + nauthor + ", ntitle="
				+ ntitle + ", ncontent=" + ncontent + ", ntime=" + ntime + "]";
	}
	
	
}
