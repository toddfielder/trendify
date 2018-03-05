package com.fielder.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.fielder.model.UserHolder;
import com.fielder.service.UserService;

@Component
public class InterceptorUser extends HandlerInterceptorAdapter{
	
	@Autowired
	private UserHolder appUser;

	@Autowired	
	private UserService userService;
//
//	@Value("${security.user.name}")
//	private String localUserId;
//	
//	@Autowired 
//	private Environment env;
	
	//before the actual handler will be executed
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler)
					throws Exception {

		if(appUser.getUser().getPerson() == null){
			userService.assignPersonAndRoles(request);
		}
		return true;
	}
}
