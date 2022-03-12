package com.biyeseng.mapper;

import java.util.List;
import java.util.Map;

import com.biyeseng.pojo.Course;

/**
 * 课程Mapper
 */
public interface CourseMapper {
	public List<Course> findCourseList();
	
	public List<Course> query(Map<String,Object> inputParam);
	
	public int insertCourse(Course course);
	
	public int deleteCourse(int id);
	
	public int updateCourse(Course course);
	
	public Course queryCourseById(int id);
}
