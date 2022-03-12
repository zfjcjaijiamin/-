package com.biyeseng.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.biyeseng.pojo.Course;
import com.biyeseng.service.CourseService;


@Controller
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	@RequestMapping(value="/list")
	public String list(Course course,HttpServletRequest request) throws Exception{
		List<Course> list = courseService.queryCourseList(course);
		request.setAttribute("courseList", list);
		return "/course/courselist.jsp";
	}
	
	@RequestMapping(value="/addcourse")
	public String addcourse(Course course,HttpServletRequest request) throws Exception{
		courseService.insertCourse(course);
		course=new Course();
		return this.list(course, request);
	}
	
	@RequestMapping(value="/toupdatecourse")
	public String toupdatecourse(int id,HttpServletRequest request) throws Exception{
		Course course=courseService.queryCourseById(id);
		request.setAttribute("course", course);
		return "/course/courseupdate.jsp";
	}
	
	@RequestMapping(value="/deletecourse")
	public String deletecourse(int id,HttpServletRequest request) throws Exception{
		courseService.deleteCourse(id);
		return "/course/list";
	}
	
	@RequestMapping(value="/updatecourse")
	public String updatecourse(Course course,HttpServletRequest request) throws Exception{
		courseService.updateCourse(course);
		course=new Course();
		return this.list(course, request);
	}
	
}
