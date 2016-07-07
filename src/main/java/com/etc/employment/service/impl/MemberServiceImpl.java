package com.etc.employment.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.etc.employment.dao.MemberDao;
import com.etc.employment.entity.Member;
import com.etc.employment.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

	@Resource 
	private MemberDao memberDao;
	
	public int addMember(Member member) {
		return memberDao.addMember(member);
	}

}
