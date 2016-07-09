package com.etc.employment.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

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
	
	/**
	 * 通过PrintWriter将响应数据写入response，ajax可以接受到这个数据
	 * 
	 * @param response
	 * @param data
	 */
	private void renderData(HttpServletResponse response, String data) {
		PrintWriter printWriter = null;
		try {
			printWriter = response.getWriter();
			printWriter.print(data);
		} catch (IOException ex) {
			System.out.println("异常");
		} finally {
			if (null != printWriter) {
				printWriter.flush();
				printWriter.close();
			}
		}
	}
}
