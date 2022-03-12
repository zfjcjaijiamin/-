package com.biyeseng.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biyeseng.mapper.StuMapper;
import com.biyeseng.pojo.Stu;
import com.biyeseng.service.StuService;



@Service
public class StuServiceImpl implements StuService {
	@Autowired
	private StuMapper stuMapper;

	@Override
	public List<Stu> queryStuList(Stu stu) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		if(stu!=null){
			map.put("username", stu.getUsername());
			map.put("pwd", stu.getPwd());
			map.put("stuno", stu.getStuno());
		}
		
		List<Stu> getStu = stuMapper.query(map);
		return getStu;
	}

	public int insertStu(Stu stu) throws Exception {
		stuMapper.insertStu(stu);
		return stu.getId();
	}

	public int deleteStu(int id) throws Exception {
		return stuMapper.deleteStu(id);
	}

	public int updateStu(Stu stu) throws Exception {
		return stuMapper.updateStu(stu);
	}
	
	public Stu queryStuById(int id) throws Exception {
		return stuMapper.queryStuById(id);
	}

	public Stu login(String stuno, String pwd) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("stuno", stuno);
		map.put("pwd", pwd);
		List<Stu> getStu = stuMapper.query(map);
		if (getStu != null && getStu.size() > 0) {
			System.out.println("用户密码正确");
			return getStu.get(0);
		} else {
			System.out.println("用户密码有误");
			return null;
		}
	}

}
