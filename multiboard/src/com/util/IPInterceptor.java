package com.util;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.vo.User;

public class IPInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		
		User loginUser = (User)session.getAttribute("loginuser");
		
		if(loginUser == null) {
			System.out.println("Not logged in yet");
			
//			RequestDispatcher rd = request.getRequestDispatcher("view/session/authRequired.jsp");
//			rd.forward(request, response);
			return true;
		}

		System.out.println("Welcome " + loginUser.getU_name());
		return true;
	}
	
}
