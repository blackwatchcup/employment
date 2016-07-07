package com.etc.employment.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.etc.employment.dao.UserDao;
import com.etc.employment.entity.User;
import com.etc.employment.service.IUserService;

@Service
public class UserSerciceImpl implements IUserService {
	@Resource
	private UserDao userDAO;
	
	@Override
	public int addUser(User user) {
		
		return userDAO.addUser(user);
	}
	
}
