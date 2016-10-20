package com.tjport.sys.dao;

import java.util.List;

import com.tjport.common.hibernate.IBaseDao;
import com.tjport.sys.model.Resource;



public interface IResourceDao extends IBaseDao<Resource, String> {
	List<Resource> getSubResources(String pid);
	

}
