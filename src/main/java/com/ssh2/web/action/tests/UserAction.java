package com.ssh2.web.action.tests;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ssh2.po.User;
import com.ssh2.service.UserService;


@Controller
@ParentPackage(value = "ssh2-default")
public class UserAction {
	@Autowired
	private UserService userService;
	
	
	private List<User> users;
	

	public List<User> getUsers() {
		return users;
	}


	@Action("list")
	public String list(){
		users=userService.find(null);
		return SUCCESS;
	}
}
