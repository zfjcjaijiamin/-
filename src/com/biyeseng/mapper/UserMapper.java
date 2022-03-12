package com.biyeseng.mapper;

import java.util.List;
import java.util.Map;

import com.biyeseng.pojo.User;


/**
 * 管理员Mapper
 */
public interface UserMapper {
	public List<User> findUserList();
	
	public List<User> query(Map<String,Object> inputParam);
	
	public int insertUser(User user);
	
	public int deleteUser(int id);
	
	public int updateUser(User user);
	
	public User queryUserById(int id);
}
