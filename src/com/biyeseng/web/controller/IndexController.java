package com.biyeseng.web.controller;

 

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.biyeseng.pojo.Stu;
import com.biyeseng.pojo.User;
import com.biyeseng.service.StuService;
import com.biyeseng.service.UserService;



@Controller
@RequestMapping("/index")
public class IndexController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private StuService stuService;

	@RequestMapping(value = "/login")
	public String login(HttpServletRequest request) throws Exception {
		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		String type = request.getParameter("type");

		if (type.equals("user")) {
			User user = userService.login(username, pwd);
			if (user != null) {
				request.getSession().setAttribute("username",
						user.getUsername());
				request.getSession().setAttribute("type", "管理员");
				request.getSession().setAttribute("user", user);
				return "/index.jsp";
			} else {
				request.setAttribute("messageInfo", "用户名或密码有误");
				return "/login.jsp";
			}
		} else if (type.equals("stu")) {
			Stu stu=stuService.login(username, pwd);
			if (stu != null) {
				request.getSession().setAttribute("username",
						stu.getUsername());
				request.getSession().setAttribute("type", "学生");
				request.getSession().setAttribute("user", stu);
				return "/index.jsp";
			} else {
				request.setAttribute("messageInfo", "用户名或密码有误");
				return "/login.jsp";
			}
		} else {
			return "/login.jsp";
		}

	}
	
	@RequestMapping(value = "/loginout")
	public String loginout(HttpServletRequest request) throws Exception {
		request.getSession().invalidate();
		return "/login.jsp";
	}
}
