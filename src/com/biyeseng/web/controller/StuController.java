package com.biyeseng.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.biyeseng.pojo.Stu;
import com.biyeseng.service.StuService;


@Controller
@RequestMapping("/stu")
public class StuController {
	@Autowired
	private StuService stuService;
	
	@RequestMapping(value="/list")
	public String list(Stu stu,HttpServletRequest request) throws Exception{
		List<Stu> list = stuService.queryStuList(stu);
		request.setAttribute("stuList", list);
		return "/stu/stulist.jsp";
	}
	
	@RequestMapping(value="/addstu")
	public String addstu(Stu stu,HttpServletRequest request) throws Exception{
		stuService.insertStu(stu);
		stu=new Stu();
		return this.list(stu, request);
	}
	
	@RequestMapping(value="/toupdatestu")
	public String toupdatestu(int id,HttpServletRequest request) throws Exception{
		Stu stu=stuService.queryStuById(id);
		request.setAttribute("stu", stu);
		return "/stu/stuupdate.jsp";
	}
	
	@RequestMapping(value="/deletestu")
	public String deletestu(int id,HttpServletRequest request) throws Exception{
		stuService.deleteStu(id);
		return "/stu/list";
	}
	
	@RequestMapping(value="/updatestu")
	public String updatestu(Stu stu,HttpServletRequest request) throws Exception{
		stuService.updateStu(stu);
		stu=new Stu();
		return this.list(stu, request);
	}
	
}
