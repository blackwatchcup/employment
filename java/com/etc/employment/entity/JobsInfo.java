package com.etc.employment.entity;
/**
 * 招聘信息实体
 * @author xwp
 *
 */
public class JobsInfo {
	private int aid;
	private String aposition;
	private int anum;
	private String aaddress;
	private int company_id;
	private int atag;
	private String atime;
	public JobsInfo() {
		super();
	}
	public JobsInfo(int aid, String aposition, int anum, String aaddress,
			int company_id, int atag, String atime) {
		super();
		this.aid = aid;
		this.aposition = aposition;
		this.anum = anum;
		this.aaddress = aaddress;
		this.company_id = company_id;
		this.atag = atag;
		this.atime = atime;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAposition() {
		return aposition;
	}
	public void setAposition(String aposition) {
		this.aposition = aposition;
	}
	public int getAnum() {
		return anum;
	}
	public void setAnum(int anum) {
		this.anum = anum;
	}
	public String getAaddress() {
		return aaddress;
	}
	public void setAaddress(String aaddress) {
		this.aaddress = aaddress;
	}
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	public int getAtag() {
		return atag;
	}
	public void setAtag(int atag) {
		this.atag = atag;
	}
	public String getAtime() {
		return atime;
	}
	public void setAtime(String atime) {
		this.atime = atime;
	}
	@Override
	public String toString() {
		return "JobsInfo [aid=" + aid + ", aposition=" + aposition + ", anum="
				+ anum + ", aaddress=" + aaddress + ", company_id="
				+ company_id + ", atag=" + atag + ", atime=" + atime + "]";
	}
	
	
	
}
