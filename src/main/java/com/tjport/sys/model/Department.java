package com.tjport.sys.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.tjport.common.hibernate.UUIDEntity;

@Entity
@Table(name = "t_sys_d_dept")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Department extends UUIDEntity {
	
	// 部门名称
	private String name;
	
	@Column(name = "name",length = 20)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "s_org_id")
	public Organization getOrg() {
		return org;
	}

	public void setOrg(Organization org) {
		this.org = org;
	}*/
}
