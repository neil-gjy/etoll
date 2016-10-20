package com.tjport.sys.dao;

import com.tjport.common.hibernate.IBaseDao;
import com.tjport.sys.model.User;

public interface IUserDao extends IBaseDao<User, String> {
	User findUserByUsername(String username);
	
	boolean passModify(String userID, String oldPass, String newPass, String confirmPass) throws Exception;
}
