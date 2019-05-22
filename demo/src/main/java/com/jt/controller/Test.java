package com.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.pojo.Dog;
import com.jt.pojo.Student;
import com.jt.pojo.User;

@RestController
public class Test {
	@Autowired
	private User user;
	@Autowired
	private Dog dog;

	@RequestMapping("/hello")
	public String hello() {
		return "哈哈哈哈哈哈哈哈哈哈哈";
	}
	
	@RequestMapping("/user/getUser")
	public User getUser() {
		return user;
	}
	/**
	 * 	测试lombok
	 * @return
	 */
	@RequestMapping("/user/getStudent")
	public Student getStudent() {
		Student s = new Student();
		s.setId(10).setName("aaaa");
		return s;
	}
	//调用测试类方法,检查程序是否正确.	
		@RequestMapping("/user/getDog")
		public Dog getDog() {
			return dog;
		}

}
