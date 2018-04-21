package com.java.blog.controller.userInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.blog.exception.HandleException;
import com.java.blog.model.Result;
import com.java.blog.model.UserInfo;
import com.java.blog.service.userInfo.UserInfoService;


@Controller
@RequestMapping("admin")
public class UserInfoController {
	
	private Logger log = Logger.getLogger(this.getClass());
	@Autowired
	private UserInfoService userInfoService;
	/**
	 * 首页跳转登录页面
	 */
	@RequestMapping("index.action")
	public String index(){
		return "admin/index";
	}
	
	/**
	 *用户登录
	 * @param loginName 登录名
	 * @param passWord 登录密码
	 */
	@RequestMapping("login.action")
	public String login(){
		return "admin/login";
	}
	/**
	 * 
	 * @param 用户退出
	 * @param request
	 * @return
	 */
	@RequestMapping("login_out.action")
	public String loginOut(HttpSession session) {
		session.invalidate();
		return "admin/login";
	}
	
	@RequestMapping("login.json")
	@ResponseBody
	public Result loginSubmit(ModelMap map,HttpServletRequest request) throws HandleException{
		//1.获取参数
		String loginName = request.getParameter("login_name");
		String passWord = request.getParameter("pass_word");
        log.debug(loginName);
		//2.验证参数
		if (StringUtils.isEmpty(loginName) || StringUtils.isEmpty(passWord)) {
			
			throw new HandleException("用户名或密码不能为空");
		}
		
		UserInfo userInfo = userInfoService.checkUser(loginName, passWord);
		if (null == userInfo) {
			
			throw new HandleException("用户名或密码不正确");
		}
		
		//3.设置session
		request.getSession().setAttribute("userInfo", userInfo);
		return Result.success();
		
	}

}
