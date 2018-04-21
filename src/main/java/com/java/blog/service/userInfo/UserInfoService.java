package com.java.blog.service.userInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.blog.dao.userInfo.IUserInfoDao;
import com.java.blog.model.UserInfo;

@Service
public class UserInfoService {
	@Autowired
	private IUserInfoDao iUserInfoDAO;
	/**
	 * У���û���½ 
	 * username �û���
	 * password ����
	 * return
	 */
	public UserInfo checkUser (String username,String password)
	{
		return iUserInfoDAO.checkUser(username, password);
	}

}
