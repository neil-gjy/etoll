package com.tjport.sys.vo;

import java.util.List;

import com.tjport.common.model.BaseVo;
import com.tjport.common.utils.DesUtils;
import com.tjport.sys.model.Department;
import com.tjport.sys.model.Role;
import com.tjport.sys.model.User;

public class UserVo extends BaseVo{
	
	private String username;
	
	private String name;
	
	private String password;
	
	private String telephone;
	
	private String email;
	
	private String ip;
	
	private String mac;

	private String deptId;
	
	private String deptName;
	
	private String roleId;
	
	private String roleName;
	
	private String isAdmin;
	
	private String status;
	
	public UserVo() {
		
	}
	
	public UserVo(User user) throws Exception {
		
		this.setId(user.getId());
		this.username = user.getUsername();
		this.name = user.getName();
		this.password = DesUtils.decrypt(user.getPassword());
        if (user.getIsAdmin()!= null) {
		   this.isAdmin = user.getIsAdmin() == true ? "是" : "否";
        }
        if(user.getStatus() != null){
           this.status = user.getStatus().equals("Y") ? "是" : "否";
        }
        this.telephone = user.getTelephone();
        this.email = user.getEmail();
        this.ip = user.getIp();
        this.mac = user.getMac();
		this.setCreateTime(user.getCreateTime());
		this.setUpdateTime(user.getUpdateTime());
		this.setOrgId(user.getOrg() != null ? user.getOrg().getId() : "");
		this.setOrgName(user.getOrg() != null ? user.getOrg().getName() : "");
		Department dept = user.getDept();
		if (dept != null) {
			this.deptId = dept.getId();
			this.deptName = dept.getName();
		}
		
		List<Role> roles = user.getRoles();
		if (roles.size() > 0) {
			Role role = roles.get(0);
			this.roleId = role.getId();
			this.roleName = role.getName();
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

}
