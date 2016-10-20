package com.tjport.etoll.report.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSONObject;

import com.tjport.common.spring.BaseController;


@Controller
@RequestMapping(IndexController.BASE)
public class IndexController extends BaseController {
	final static String BASE = "report";
	//final static String PATH = "report";
	
	@RequestMapping("index")
	public String index() {
		
		return BASE + "/index";
	}
}