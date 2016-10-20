package com.tjport.sys.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.google.common.collect.Lists;
import com.tjport.common.hibernate.UUIDEntity;

@Entity
@Table(name = "t_sys_d_org")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Organization extends UUIDEntity {
	
	// 公司名称
	private String name;
	
	// 公司编码
	private String organizecode;
	
	// 公司编码(人事)
	private String rscode;
	
	// 助记编码
	private String remembercode;
	
	// 营业执照号
	private String license;
	
	// 税务登记号
	private String taxnumber;
	
	// 法人代表
	private String presider;
	
	// 地址
	private String address;
	
	// 联系人员
	private String linkman;
	
	// 电话
	private String telephone;
	
	// 传真
	private String fax;
	
	// 电子邮件
	private String email;
	
	// 密码单张票最大金额
	private Float maxmoney;
	
	// 禁用标志
	private String prohibitflag;
	
	// 部门列表
    private List<Department> depts = Lists.newArrayList();

	@Column(name = "name",length = 255)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinTable(name = "t_sys_d_org_dept", joinColumns = { @JoinColumn(name = "org_id") }, inverseJoinColumns = { @JoinColumn(name = "dept_id") })
    @OrderBy("id")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
	public List<Department> getDepts() {
		return depts;
	}

	public void setDepts(List<Department> depts) {
		this.depts = depts;
	}

	@Column(name = "organizecode",length = 32)
	public String getOrganizecode() {
		return organizecode;
	}

	public void setOrganizecode(String organizecode) {
		this.organizecode = organizecode;
	}

	@Column(name = "rscode",length = 30)
	public String getRscode() {
		return rscode;
	}

	public void setRscode(String rscode) {
		this.rscode = rscode;
	}

	@Column(name = "remembercode",length = 20)
	public String getRemembercode() {
		return remembercode;
	}

	public void setRemembercode(String remembercode) {
		this.remembercode = remembercode;
	}

	@Column(name = "license",length = 30)
	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	@Column(name = "taxnumber",length = 30)
	public String getTaxnumber() {
		return taxnumber;
	}

	public void setTaxnumber(String taxnumber) {
		this.taxnumber = taxnumber;
	}

	@Column(name = "presider",length = 20)
	public String getPresider() {
		return presider;
	}

	public void setPresider(String presider) {
		this.presider = presider;
	}

	@Column(name = "address",length = 20)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "linkman",length = 50)
	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	@Column(name = "telephone",length = 50)
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name = "fax",length = 50)
	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}
	
	@Column(name = "email",length = 50)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "maxmoney")
	public Float getMaxmoney() {
		return maxmoney;
	}

	public void setMaxmoney(Float maxmoney) {
		this.maxmoney = maxmoney;
	}

	@Column(name = "prohibitflag",length = 20)
	public String getProhibitflag() {
		return prohibitflag;
	}

	public void setProhibitflag(String prohibitflag) {
		this.prohibitflag = prohibitflag;
	}
	
}
