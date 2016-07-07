package com.etc.employment.controller;

import java.util.Date;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.employment.entity.Member;
import com.etc.employment.service.MemberService;
@Controller
@RequestMapping("/member")
public class MemberController {
	@Resource
	private MemberService memberService;
	@RequestMapping("/add")
	public String add() {
		Date date = new Date();
		Member m1 = new Member(6, "小谍", "123", "12345687", "145021225@qq.com", "小巫婆", date, "1","dfd");
		memberService.addMember(m1);
		return "test";	
	}
}
