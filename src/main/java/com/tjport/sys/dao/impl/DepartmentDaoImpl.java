package com.tjport.sys.dao.impl;

import org.springframework.stereotype.Repository;

import com.tjport.common.hibernate.BaseDaoImpl;
import com.tjport.sys.dao.IDepartmentDao;
import com.tjport.sys.model.Department;

@Repository("departmentDao")
public class DepartmentDaoImpl extends BaseDaoImpl <Department, String> implements IDepartmentDao {
	
}
