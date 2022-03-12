package com.biyeseng.test;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.biyeseng.pojo.User;
import com.biyeseng.service.UserService;

/**
 * 单元测试类
 * @author biyeseng
 * @company www.biyeseng.cn
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/applicationContext-*.xml"})
public class TestService {
	@Autowired
	private UserService userService;
	@Test
	public void testFindUser() throws Exception{
		//List<User> list = userService.queryUserList();
		//Assert.assertEquals(10, list.size());
		//userService.login("zhangsan", "8888");
//		User user=new User();
//		user.setId(41);
//		user.setPwd("88882");
//		user.setUsername("biyeseng2");
//		int userId=userService.updateUser(user);
		userService.queryUserById(1);
	}
}
