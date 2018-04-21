package com.java.blog.dao.typeInfo;

import java.util.List;

import com.java.blog.model.TypeInfo;

public interface ITypeInfoDao {

	/**
	 * 查询所有分类
	 * @param name
	 * @param sort
	 * @return
	 */
	
	List<TypeInfo>  typeList();

}
