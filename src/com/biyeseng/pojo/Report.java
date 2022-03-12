package com.biyeseng.pojo;

import java.io.Serializable;


/**
 * 成绩单bean
 */
public class Report implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;//主键
	private String stuno;//学号
	private String coursename;//课程名
	private String score;
	
	
	public Integer getId() {
		return id;
	}


	public String getStuno() {
		return stuno;
	}


	public void setStuno(String stuno) {
		this.stuno = stuno;
	}


	public String getCoursename() {
		return coursename;
	}


	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}


	public String getScore() {
		return score;
	}


	public void setScore(String score) {
		this.score = score;
	}


	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	

}
