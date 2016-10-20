package com.tjport.sys.service;

import java.util.List;

import com.tjport.sys.model.Department;

public interface IOrganizationService {
	
	List<Department> getDeptsByOrgId(String orgId);

	void addDepts(String orgId, String[] deptIds);
}
