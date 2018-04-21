package com.java.blog.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.java.blog.model.UserInfo;

public class Interceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		//1.获取请求地址
		 String url = request.getRequestURI();
		//2.对特殊地址放行
		 if (url.indexOf("login") > 0 || url.indexOf("index") > 0) {
			 return true;
		 }	
		//3.session存在，后台登陆
		 HttpSession session = request.getSession();
		 UserInfo userInfo = (UserInfo)session.getAttribute("userInfo");
		 if (userInfo != null) {
			 return true;
		 }
		 //4.跳转页面
		 request.getRequestDispatcher("WEB-INF/page/admin/login.jsp").forward(request, response);
		 
		 return false;
	}

}
