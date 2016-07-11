package com.etc.employment.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etc.employment.entity.Resume;
import com.etc.employment.service.ResumeService;
@Controller
public class ResumeController {
	
	@Resource
	private ResumeService resumeService;
	@RequestMapping("/add_resume")
	@ResponseBody
	public String addResume(Resume resume) {

		System.out.println(resume);
		resumeService.addResume(resume.getPositiontype(),resume.getEducation());
		
		System.out.println("插入成功！-------》");
		return null;
		
		
	}
}
