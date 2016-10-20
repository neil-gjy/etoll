package com.tjport.etoll.report.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSONObject;

import com.tjport.common.spring.BaseController;


@Controller
@RequestMapping(ReportController.BASE)
public class ReportController extends BaseController {
	final static String BASE = "report";
	//final static String PATH = "report";
	
	@RequestMapping("report1")
	public String index() {
		
		return BASE + "/report1";
	}
	
	
}