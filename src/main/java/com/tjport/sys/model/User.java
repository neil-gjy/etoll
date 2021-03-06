package com.tjport.sys.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Type;

import com.google.common.collect.Lists;
import com.tjport.common.hibernate.UUIDEntity;


@Entity
@Table(name = "t_sys_d_user")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class User extends UUIDEntity {

	// 用户名（系统登录时使用）
	private String username;
	
	// 密码
	private String password;
	
	// 姓名
	private String name;

	// 超级管理员
	private Boolean isAdmin = false;
	
	// 电话
	private String telephone;
	
	// 邮箱
	private String email;
	
	// IP地址
	private String ip;
	
	// MAC地址
	private String mac;
	
	// 单位
	private Organization org;
	
	// 部门
	private Department dept;
	
	// 用户角色
	private List<Role> roles = Lists.newArrayList();
	 
	@Column(name = "username",length = 32)
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name = "password",length = 32)
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name = "name", length = 10)
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "is_admin")
	@Type(type="yes_no")
	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	@Column(name = "telephone",length = 50)
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name = "email",length = 50)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "ip",length = 50)
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Column(name = "mac",length = 50)
	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "org_id")
	public Organization getOrg() {
		return org;
	}

	public void setOrg(Organization org) {
		this.org = org;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dept_id")
	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinTable(name = "t_sys_d_user_role", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = { @JoinColumn(name = "role_id") })
    @OrderBy("id")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	@Transient
	public List<String> getRoleIds() {
		ArrayList<String> roleIds = new ArrayList<String>();
		if (this.roles != null) {
			for(Role role : this.roles){
				roleIds.add(role.getId());
			}
		}
		
		return roleIds;
	}
	
	@Transient
	public String getRoleNames() {
		StringBuilder roleNames = new StringBuilder();
		int len = roles.size();
		if (this.roles != null) {
			for(int i = 0; i < len; i++){
				roleNames.append(roles.get(i).getName());
				
				if (i < (len - 1)) {
					roleNames.append(",");
				}
				
			}
		}
		
		return roleNames.toString();
	}
}
