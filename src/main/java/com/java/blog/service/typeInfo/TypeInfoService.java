package com.java.blog.service.typeInfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.blog.dao.typeInfo.ITypeInfoDao;
import com.java.blog.model.TypeInfo;

@Service
public class TypeInfoService {
	@Autowired
	private ITypeInfoDao iTypeInfoDAO;
	/**
	 * 所有分类
	 * return
	 */
	public List<TypeInfo> typeList ()
	{
		return iTypeInfoDAO.typeList();
	}

}
