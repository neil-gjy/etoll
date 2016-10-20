package com.tjport.sys.dao;

import java.util.List;

import com.tjport.common.hibernate.IBaseDao;
import com.tjport.common.query.Page;
import com.tjport.common.query.QueryFilter;
import com.tjport.sys.model.Organization;

public interface IOrganizationDao extends IBaseDao<Organization, String> {
	
	public List<Organization> getOrgByInfo(String info, int currentPage, int pageSize);
	
	public Page<Organization> findPage(Page<Organization> page, String search, String whereHql, Object... values);
	
	public Page<Organization> findPage(Page<Organization> page, String search);
	
	public List<Organization> getOnLineOrg();
}
