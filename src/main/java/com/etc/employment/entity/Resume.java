package com.etc.employment.entity;
/**
 * 简历实体
 * @author xwp
 *
 */
public class Resume {
	private int rid;				//简历编号
	private String position;		//申请职位
	private String experience;		//工作经历
	private String education;		//教育背景
	private String certificate;		//证书
	private int member_id;			//提交简历会员的id
	private int company_id;			//收到简历的企业会员id
	private int rtag;				//审核标记（0:未审，1：通过，2：未通过）
	private String rtime;			//简历最近修改时间
	public Resume() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Resume(int rid, String position, String experience,
			String education, String certificate, int member_id,
			int company_id, int rtag, String rtime) {
		super();
		this.rid = rid;
		this.position = position;
		this.experience = experience;
		this.education = education;
		this.certificate = certificate;
		this.member_id = member_id;
		this.company_id = company_id;
		this.rtag = rtag;
		this.rtime = rtime;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
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
	@Override
	public String toString() {
		return "Resume [rid=" + rid + ", position=" + position
				+ ", experience=" + experience + ", education=" + education
				+ ", certificate=" + certificate + ", member_id=" + member_id
				+ ", company_id=" + company_id + ", rtag=" + rtag + ", rtime="
				+ rtime + "]";
	}
	
	
}
