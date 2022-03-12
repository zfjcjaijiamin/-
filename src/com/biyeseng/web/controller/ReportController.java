package com.biyeseng.web.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.biyeseng.pojo.Course;
import com.biyeseng.pojo.Report;
import com.biyeseng.pojo.Stu;
import com.biyeseng.service.CourseService;
import com.biyeseng.service.ReportService;


@Controller
@RequestMapping("/report")
public class ReportController {
	@Autowired
	private ReportService reportService;
	@Autowired
	private CourseService courseService;
	
	@RequestMapping(value="/list")
	public String list(Report report,HttpServletRequest request) throws Exception{
		List<Report> list = reportService.queryReportList(report);
		request.setAttribute("reportList", list);
		return "/report/reportlist.jsp";
	}
	
	@RequestMapping(value="/listmy")
	public String listmy(Report report,HttpServletRequest request) throws Exception{
		Stu stu=(Stu) request.getSession().getAttribute("user");
		report.setStuno(stu.getStuno());
		List<Report> list = reportService.queryReportList(report);
		request.setAttribute("reportList", list);
		return "/report/reportlistmy.jsp";
	}
	
	@RequestMapping(value="/addreport")
	public String addreport(Report report,HttpServletRequest request) throws Exception{
		reportService.insertReport(report);
		report=new Report();
		return this.list(report, request);
	}
	
	@RequestMapping(value="/toaddreport")
	public String toaddreport(Report report,HttpServletRequest request) throws Exception{
		List<Course> courseList=courseService.queryCourseList(null);
		request.setAttribute("courseList", courseList);
		return "/report/reportadd.jsp";
	}
	
	@RequestMapping(value="/toupdatereport")
	public String toupdatereport(int id,HttpServletRequest request) throws Exception{
		Report report=reportService.queryReportById(id);
		request.setAttribute("report", report);
		List<Course> courseList=courseService.queryCourseList(null);
		request.setAttribute("courseList", courseList);
		return "/report/reportupdate.jsp";
	}
	
	@RequestMapping(value="/deletereport")
	public String deletereport(int id,HttpServletRequest request) throws Exception{
		reportService.deleteReport(id);
		return "/report/list";
	}
	
	@RequestMapping(value="/updatereport")
	public String updatereport(Report report,HttpServletRequest request) throws Exception{
		reportService.updateReport(report);
		report=new Report();
		return this.list(report, request);
	}
	
}
