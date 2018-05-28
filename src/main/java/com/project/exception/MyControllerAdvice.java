package com.project.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * 
 * @className: MyControllerAdvice
 * @description: 自定义异常处理类
 * @author 李超 
 * @date 2018年5月22日 下午3:50:35
 */
@ControllerAdvice
public class MyControllerAdvice {
	
	@ResponseBody
	@ExceptionHandler(value=BusinessException.class)
	public Map<String, Object> errorAdvice (BusinessException ex) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", ex.getCode());
		map.put("error", ex.getMsg());
		return map;
	}
}
