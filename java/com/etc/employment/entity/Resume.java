package com.etc.employment.entity;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;

/**
 * 简历实体
 * @author xwp
 *
 */
public class Resume {
	private int rid;				//简历编号
	private String positiontype;		//申请职位类别
	private String experience;		//工作经历
	private String education;		//教育背景
	private String certificate;		//证书
	private int member_id;			//提交简历会员的id
	private int company_id;			//收到简历的企业会员id
	private int rtag;				//审核标记（0:未审，1：通过，2：未通过）
	private String rtime;			//简历最近修改时间
	private String positionname;		//期望工作名称
	private String expectationsalary;		//期望月薪
	private String currentstate;		//当前状态
	private String email;		//当前状态
	private String jobnature;		//工作性质
	private String phone;		//联系方式
	private String currentaddress;		//当前位置
	public Resume() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Resume(int rid, String positiontype, String experience,
			String education, String certificate, int member_id,
			int company_id, int rtag, String rtime, String positionname,
			String expectationsalary, String currentstate, String email,
			String jobnature, String phone, String currentaddress) {
		super();
		this.rid = rid;
		this.positiontype = positiontype;
		this.experience = experience;
		this.education = education;
		this.certificate = certificate;
		this.member_id = member_id;
		this.company_id = company_id;
		this.rtag = rtag;
		this.rtime = rtime;
		this.positionname = positionname;
		this.expectationsalary = expectationsalary;
		this.currentstate = currentstate;
		this.email = email;
		this.jobnature = jobnature;
		this.phone = phone;
		this.currentaddress = currentaddress;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getPositiontype() {
		return positiontype;
	}
	public void setPositiontype(String positiontype) {
		this.positiontype = positiontype;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getCertificate() {
		return certificate;
	}
	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}
	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	public int getRtag() {
		return rtag;
	}
	public void setRtag(int rtag) {
		this.rtag = rtag;
	}
	public String getRtime() {
		return rtime;
	}
	public void setRtime(String rtime) {
		this.rtime = rtime;
	}
	public String getPositionname() {
		return positionname;
	}
	public void setPositionname(String positionname) {
		this.positionname = positionname;
	}
	public String getExpectationsalary() {
		return expectationsalary;
	}
	public void setExpectationsalary(String expectationsalary) {
		this.expectationsalary = expectationsalary;
	}
	public String getCurrentstate() {
		return currentstate;
	}
	public void setCurrentstate(String currentstate) {
		this.currentstate = currentstate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJobnature() {
		return jobnature;
	}
	public void setJobnature(String jobnature) {
		this.jobnature = jobnature;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCurrentaddress() {
		return currentaddress;
	}
	public void setCurrentaddress(String currentaddress) {
		this.currentaddress = currentaddress;
	}
	@Override
	public String toString() {
		return "Resume [rid=" + rid + ", positiontype=" + positiontype
				+ ", experience=" + experience + ", education=" + education
				+ ", certificate=" + certificate + ", member_id=" + member_id
				+ ", company_id=" + company_id + ", rtag=" + rtag + ", rtime="
				+ rtime + ", positionname=" + positionname
				+ ", expectationsalary=" + expectationsalary
				+ ", currentstate=" + currentstate + ", email=" + email
				+ ", jobnature=" + jobnature + ", phone=" + phone
				+ ", currentaddress=" + currentaddress + "]";
	}
	
	
}