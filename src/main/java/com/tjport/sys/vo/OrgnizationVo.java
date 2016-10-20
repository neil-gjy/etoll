package com.tjport.sys.vo;

import com.tjport.common.model.BaseVo;
import com.tjport.sys.model.Organization;

public class OrgnizationVo extends BaseVo{

	private String id;

	private String name;

	private String organizecode;

	private String rscode;

	private String remembercode;

	private String license;

	private String taxnumber;

	private String presider;

	private String address;

	private String linkman;

	private String telephone;

	private String fax;

	private String email;

	private Float maxmoney;

	private String prohibitflag;

	public OrgnizationVo() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrganizecode() {
		return organizecode;
	}

	public void setOrganizecode(String organizecode) {
		this.organizecode = organizecode;
	}

	public String getRscode() {
		return rscode;
	}

	public void setRscode(String rscode) {
		this.rscode = rscode;
	}

	public String getRemembercode() {
		return remembercode;
	}

	public void setRemembercode(String remembercode) {
		this.remembercode = remembercode;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getTaxnumber() {
		return taxnumber;
	}

	public void setTaxnumber(String taxnumber) {
		this.taxnumber = taxnumber;
	}

	public String getPresider() {
		return presider;
	}

	public void setPresider(String presider) {
		this.presider = presider;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Float getMaxmoney() {
		return maxmoney;
	}

	public void setMaxmoney(Float maxmoney) {
		this.maxmoney = maxmoney;
	}

	public String getProhibitflag() {
		return prohibitflag;
	}

	public void setProhibitflag(String prohibitflag) {
		this.prohibitflag = prohibitflag;
	}

	public OrgnizationVo(Organization orgnization) {
		this.id = orgnization.getId();
		this.name = orgnization.getName();
		this.organizecode=orgnization.getOrganizecode();
		this.rscode=orgnization.getRscode();
		this.remembercode=orgnization.getRemembercode();
		this.license=orgnization.getLicense();
		this.taxnumber=orgnization.getTaxnumber();
		this.presider=orgnization.getPresider();
		this.address=orgnization.getAddress();
		this.linkman=orgnization.getLinkman();
		this.telephone=orgnization.getTelephone();
		this.fax=orgnization.getFax();
		this.email=orgnization.getEmail();
		this.maxmoney=orgnization.getMaxmoney();
		if(orgnization.getProhibitflag()!=null){
		   this.prohibitflag = orgnization.getProhibitflag().equals("Y") ? "是" : "否";
		}
	}

}
