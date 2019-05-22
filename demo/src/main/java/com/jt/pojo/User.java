package com.jt.pojo;

import java.io.Serializable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties(prefix="user") 
//在配置文件中查找user的前缀
//之后如果属性值得名称与key的名称一致则利用对象的setXXX方法进行属性赋值
public class User implements Serializable{
	private static final long serialVersionUID = -6161009932524706762L;
	private Integer id;
	private String username;
	private Integer age;
	private String sex;
	/*
	 * @Value("${user.id}") private Integer id;
	 * 
	 * @Value("${user.username}") 无需利用set方法 private String username;
	 * 
	 * @Value("${user.age}") private Integer age;
	 * 
	 * @Value("${user.sex}") private String sex;
	 */
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", age=" + age + ", sex=" + sex + "]";
	}
}
