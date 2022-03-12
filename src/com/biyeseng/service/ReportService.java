package com.biyeseng.service;

import java.util.List;

import com.biyeseng.pojo.Report;


/**
 * 成绩单Service
 
 */
public interface ReportService{
	public List<Report> queryReportList(Report report) throws Exception;
	
	public int insertReport(Report report) throws Exception ;
	
	public int deleteReport(int id) throws Exception ;
	
	public int updateReport(Report report) throws Exception ;
	
	public Report queryReportById(int id) throws Exception ;
}
