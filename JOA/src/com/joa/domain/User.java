package com.joa.domain;

import java.io.Serializable;

public class User implements Serializable {
	private Long uid;
	private String uname;
	private String password;
	private String sex;
	private String phone;
	
	//用户与post是多对多关系
	
	//用户与department是多对一关系
	
}
