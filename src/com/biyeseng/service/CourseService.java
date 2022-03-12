package com.biyeseng.service;

import java.util.List;

import com.biyeseng.pojo.Course;


/**
 * 课程Service
 */
public interface CourseService{
	public List<Course> queryCourseList(Course course) throws Exception;
	
	public int insertCourse(Course course) throws Exception ;
	
	public int deleteCourse(int id) throws Exception ;
	
	public int updateCourse(Course course) throws Exception ;
	
	public Course queryCourseById(int id) throws Exception ;
}
