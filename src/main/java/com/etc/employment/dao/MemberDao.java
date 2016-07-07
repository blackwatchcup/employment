package com.etc.employment.dao;

import com.etc.employment.entity.Member;

public interface MemberDao {
	public int addMember(Member member);
	public int delMember(int mid);
}
