package com.tjport.sys.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import com.tjport.common.hibernate.BaseDaoImpl;
import com.tjport.common.query.Page;
import com.tjport.sys.dao.IOrganizationDao;
import com.tjport.sys.model.Organization;



@Repository("organizationDao")
public class OrganizationDaoImpl extends BaseDaoImpl <Organization, String> implements IOrganizationDao {

	
	
	
	/**
	 * 公司名字与简称模糊搜索
	 * 
	 * @param info 输入条件
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
    @Override
    public List<Organization> getOrgByInfo(String info, int currentPage, int pageSize) {
        StringBuffer hql=new StringBuffer();
        List<Organization> list=new ArrayList<Organization>();
        hql.append("from Organization where 1=1 ");
        
        if (info != null){
            hql.append(" and (name like '%"+info+"%'");
            
        	hql.append(" or shortName like '%"+info+"%')");
        }
        
        list = this.find(hql.toString(),currentPage,pageSize);
        
        return list;
    }

	@Override
	public Page<Organization> findPage(Page<Organization> page, String search, String whereHql, Object... values) {
		// TODO Auto-generated method stub
		
		StringBuilder hql = new StringBuilder();
		
		if (StringUtils.isNoneBlank(search)) {
			hql.append("(name like ? or shortName like ? or address like ? or safetyManager like ? or manager like ? or companyType like ? or "
					+ "enterpriseNature like ? or mainBusiness like ?)");
		}
		
		ArrayList<Object> params = new ArrayList<Object>();
		for(int i = 0; i < 8; i++) {
			params.add(search);
		}
		
		if (StringUtils.isNoneBlank(whereHql)) {
			
			hql.append(" and (").append(whereHql).append(")");
			for(Object value : values) {
				params.add(value);
			}
		}
		
		
		
		return this.findPage(page, hql.toString(), params);
		
	}

	@Override
	public Page<Organization> findPage(Page<Organization> page, String search) {
		
		StringBuilder hql = new StringBuilder();
		
		if (StringUtils.isNoneBlank(search)) {
			hql.append("(o.name like ? or o.shortName like ? or o.address like ? or o.safetyManager like ? or o.manager like ? or o.companyType like ? or "
					+ "o.enterpriseNature like ? or o.mainBusiness like ?)");
		}
		
		
	
		
		ArrayList<Object> params = new ArrayList<Object>();
		for(int i = 0; i < 8; i++) {
			params.add("%"+search+"%");
		}
		
		return this.findPage(page, hql.toString(), params.toArray());
	}
	
	@Override
	public List<Organization> getOnLineOrg(){
		List<Organization> list = this.find("o.onLine = ?", new Object[]{true});

	    return list;
	}
}
