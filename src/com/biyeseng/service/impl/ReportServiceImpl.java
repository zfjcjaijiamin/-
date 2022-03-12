package com.biyeseng.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biyeseng.mapper.ReportMapper;
import com.biyeseng.pojo.Report;
import com.biyeseng.service.ReportService;


@Service
public class ReportServiceImpl implements ReportService {
	@Autowired
	private ReportMapper reportMapper;

	@Override
	public List<Report> queryReportList(Report report) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		if(report!=null){
			map.put("stuno", report.getStuno());
			map.put("coursename", report.getCoursename());
		}
		
		List<Report> getReport = reportMapper.query(map);
		return getReport;
	}

	public int insertReport(Report report) throws Exception {
		reportMapper.insertReport(report);
		return report.getId();
	}

	public int deleteReport(int id) throws Exception {
		return reportMapper.deleteReport(id);
	}

	public int updateReport(Report report) throws Exception {
		return reportMapper.updateReport(report);
	}
	
	public Report queryReportById(int id) throws Exception {
		return reportMapper.queryReportById(id);
	}

 

}
