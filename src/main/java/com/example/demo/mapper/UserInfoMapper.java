package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.bean.UserInfoBean;

@Mapper
public interface UserInfoMapper {

	boolean selectFromUserInfo(UserInfoBean userInfoBean);
	
}
