package com.jt.pojo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource(value = { "classpath:/properties/dog.properties" })
@Component
public class Dog implements Serializable{
	private static final long serialVersionUID = -1562814184547346096L;
	@Value("${dog.id}")
	private Integer id;
	@Value("${dog.name}")
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
