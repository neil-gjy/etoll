package com.tjport.wechat.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.tjport.common.utils.wechat.weChatUtil;
import com.tjport.common.utils.po.AccessTokenPo;
import com.tjport.wechat.controller.TokenController;

public class AccessTokenJob implements Job {

	public static AccessTokenPo token = null;
	
    public void execute(JobExecutionContext context) 
            throws JobExecutionException {
    	
    	TokenController.setToken(weChatUtil.getAccessToken());//获取AccessToken
    }
}