package com.java.blog.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.StringUtils;

public class Result {
   //状态码code 成功："0" 失败："1"
	private String code;
	
	//信息
	private String message;
	
	//数据
	private Map<String,Object> data = new HashMap<String,Object>();
	
	public static Result success() {
		Result result = new Result();
		result.setCode("0");
		result.setMessage("操作成功");
		return result;
	}
	
	public static Result error(String string) {
		Result result = new Result();
		result.setCode("1");
		if (StringUtils.isEmpty(string)) {
			result.setMessage("操作失败");
		} else {
			result.setMessage(string);
		}
		
		return result;
	}

	public Result add(String key,Object obj) {
		this.getData().put(key, obj);
		return this;
	}
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}
	
	
	
}
