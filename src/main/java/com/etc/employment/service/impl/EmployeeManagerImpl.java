package com.etc.employment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etc.employment.dao.EmployeeDAO;
import com.etc.employment.entity.EmployeeVO;
import com.etc.employment.service.EmployeeManager;



@Service
public class EmployeeManagerImpl implements EmployeeManager {
 
    @Autowired
    EmployeeDAO dao;
 
    public List<EmployeeVO> getAllEmployees()
    {
        return dao.getAllEmployees();
    }
}