package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.UserInfoBean;

@RestController
@RequestMapping("/api")
public class LoginController {

	@GetMapping("/login")
    public ResponseEntity<?> hello(@RequestBody UserInfoBean userInfoBean) {
       
		
		return ResponseEntity.ok("登录成功！");
    }
	
}
