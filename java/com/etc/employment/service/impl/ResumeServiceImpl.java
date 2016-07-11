package com.etc.employment.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.etc.employment.dao.ResumeDao;
import com.etc.employment.service.ResumeService;
@Service
public class ResumeServiceImpl implements ResumeService{
		@Resource 
		private ResumeDao resumeDao;
		
		public int addResume(String positiontype, String edcation) {
		
		return resumeDao.addResume(positiontype, edcation);
	}
}
