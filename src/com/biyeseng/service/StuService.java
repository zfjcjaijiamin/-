package com.biyeseng.service;

import java.util.List;

import com.biyeseng.pojo.Stu;


/**
 * 学生Service

 */
public interface StuService{
	public List<Stu> queryStuList(Stu stu) throws Exception;
	
	public Stu login(String stuno,String pwd) throws Exception ;
	
	public int insertStu(Stu stu) throws Exception ;
	
	public int deleteStu(int id) throws Exception ;
	
	public int updateStu(Stu stu) throws Exception ;
	
	public Stu queryStuById(int id) throws Exception ;
}
