package com.jyo.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String username,String password) {
		boolean isValidUserName = username.equalsIgnoreCase("jyothish");
		boolean isValidPassword = password.equalsIgnoreCase("dummy");
		
		return isValidUserName&isValidPassword;
	}
}
