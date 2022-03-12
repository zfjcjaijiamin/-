package com.biyeseng.mapper;

import java.util.List;
import java.util.Map;

import com.biyeseng.pojo.Stu;


/**
 * 学生Mapper
 */
public interface StuMapper {
	public List<Stu> findStuList();
	
	public List<Stu> query(Map<String,Object> inputParam);
	
	public int insertStu(Stu stu);
	
	public int deleteStu(int id);
	
	public int updateStu(Stu stu);
	
	public Stu queryStuById(int id);
}
