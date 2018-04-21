package com.java.blog.dao.userInfo;

import org.apache.ibatis.annotations.Param;


import com.java.blog.model.UserInfo;

public interface IUserInfoDao {

	/**
	 * У���û�
	 * @param loginName ��¼��
	 * @param passWord ��¼����
	 * @return
	 */
	
	UserInfo checkUser(@Param("username") String username, @Param("password") String password);

}
