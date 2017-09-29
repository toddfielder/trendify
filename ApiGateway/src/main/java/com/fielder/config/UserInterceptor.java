package com.fielder.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class UserInterceptor extends HandlerInterceptorAdapter{
	
	//before the actual handler will be executed
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler)
					throws Exception {

		long startTime = System.currentTimeMillis();
		request.setAttribute("startTime", startTime);

		return true;
	}
}
