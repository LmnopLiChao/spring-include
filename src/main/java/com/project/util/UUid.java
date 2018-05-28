package com.project.util;

import java.util.UUID;
/**
 * 
 * @className: UUid
 * @description: 格式化uuid
 * @author 李超 lichao03@yinhai.com
 * @date 2018年5月21日 下午2:44:52
 */
public class UUid {

	public static String getId() {
		return  uuid();
	}
	
	private static String uuid() {
		String s = UUID.randomUUID().toString();
        String uuid=  s.substring(0,8)+s.substring(9,13)+s.substring(14,18)
        								+s.substring(19,23)+s.substring(24);
		return uuid;
	}
}
