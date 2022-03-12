package com.biyeseng.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biyeseng.mapper.CourseMapper;
import com.biyeseng.pojo.Course;
import com.biyeseng.service.CourseService;


 
@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseMapper courseMapper;

	@Override
	public List<Course> queryCourseList(Course course) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		if(course!=null){
			map.put("name", course.getName());
			map.put("teacher", course.getTeacher());
		}
		
		List<Course> getCourse = courseMapper.query(map);
		return getCourse;
	}

	public int insertCourse(Course course) throws Exception {
		courseMapper.insertCourse(course);
		return course.getId();
	}

	public int deleteCourse(int id) throws Exception {
		return courseMapper.deleteCourse(id);
	}

	public int updateCourse(Course course) throws Exception {
		return courseMapper.updateCourse(course);
	}
	
	public Course queryCourseById(int id) throws Exception {
		return courseMapper.queryCourseById(id);
	}

 

}
