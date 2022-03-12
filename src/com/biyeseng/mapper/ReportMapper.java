package com.biyeseng.mapper;

import java.util.List;
import java.util.Map;

import com.biyeseng.pojo.Report;


/**
 * 成绩Mapper
 */
public interface ReportMapper {
	public List<Report> findReportList();
	
	public List<Report> query(Map<String,Object> inputParam);
	
	public int insertReport(Report report);
	
	public int deleteReport(int id);
	
	public int updateReport(Report report);
	
	public Report queryReportById(int id);
}
