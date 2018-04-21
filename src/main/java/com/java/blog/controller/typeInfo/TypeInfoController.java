package com.java.blog.controller.typeInfo;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.blog.model.TypeInfo;
import com.java.blog.service.typeInfo.TypeInfoService;



@Controller
@RequestMapping("type_info")
public class TypeInfoController {
	
	private Logger log = Logger.getLogger(this.getClass());
	@Autowired
	private TypeInfoService typeInfoService;
	
	@RequestMapping("typeList.action")
	public String typeList(ModelMap map) {
		 List<TypeInfo> typeInfoList = typeInfoService.typeList();
		 map.put("typeInfoList", typeInfoList);
		 log.debug(map);
		 return "admin/type_info/typeInfoList";
	}
	
	

}
