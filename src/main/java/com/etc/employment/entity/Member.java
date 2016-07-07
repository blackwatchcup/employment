package com.etc.employment.entity;

import java.util.Date;

/**
 * 会员实体类
 * @author xwp
 *
 */
public class Member {
	private int mid;      		//会员用户编号
	private String mname;	    //会员账户
	private String mpwd;		//会员登录密码
	private String mphone;		//会员电话
	private String memail;		//会员邮箱
	private String rname;		//会员真实姓名
	private Date birth;			//会员生日
	private String mtag;		//审核标记
	private String mphoto;		//照片
	public Member() {
		super();
	}
	public Member(int mid, String mname, String mpwd, String mphone,
			String memail, String rname, Date birth, String mtag, String mphoto) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mpwd = mpwd;
		this.mphone = mphone;
		this.memail = memail;
		this.rname = rname;
		this.birth = birth;
		this.mtag = mtag;
		this.mphoto = mphoto;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMpwd() {
		return mpwd;
	}
	public void setMpwd(String mpwd) {
		this.mpwd = mpwd;
	}
	public String getMphone() {
		return mphone;
	}
	public void setMphone(String mphone) {
		this.mphone = mphone;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getMtag() {
		return mtag;
	}
	public void setMtag(String mtag) {
		this.mtag = mtag;
	}
	public String getMphoto() {
		return mphoto;
	}
	public void setMphoto(String mphoto) {
		this.mphoto = mphoto;
	}
	@Override
	public String toString() {
		return "Member [mid=" + mid + ", mname=" + mname + ", mpwd=" + mpwd
				+ ", mphone=" + mphone + ", memail=" + memail + ", rname="
				+ rname + ", birth=" + birth + ", mtag=" + mtag + ", mphoto="
				+ mphoto + "]";
	}
	
	

}
