package com.example.demo.bean;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class UserInfoBean {

	private String userName;
	private String password;
	private String mail;
	private int code;
	private Timestamp lastLogin;
	private int loginFlag;

}
