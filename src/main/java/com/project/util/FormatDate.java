package com.project.util;

import java.text.DateFormat;
import java.util.Date;

/**
 * DateFormat.FULL = 0 DateFormat.DEFAULT = 2 DateFormat.LONG = 1
 * DateFormat.MEDIUM = 2 DateFormat.SHORT = 3
 * 
 * @className: FormatDate
 * @description: 格式化时间类
 * @author 李超 lichao03@yinhai.com
 * @date 2018年5月21日 下午2:53:28
 */
public class FormatDate {
	/**
	 * 
	 * @title: format
	 * @author 李超 lichao03@yinhai.com
	 * @date 2018年5月21日
	 * @description:格式化年月日
	 * @param date
	 * @return yyyy-MM-dd
	 */
	public static String format(Date date) {
		return DateFormat.getDateInstance().format(date);
	}

	/**
	 * 
	 * @title: format0
	 * @author 李超 lichao03@yinhai.com
	 * @date 2018年5月21日
	 * @description:格式化年月日星期
	 * @param date
	 * @return yyyy年MM月dd日星期
	 */
	public static String format0(Date date) {
		return DateFormat.getDateInstance(DateFormat.FULL).format(date);
	}
	/**
	 * 
	 * @title: format1
	 * @author 李超 lichao03@yinhai.com
	 * @date 2018年5月21日
	 * @description:格式化年月日
	 * @param date
	 * @return yyyy年MM月dd日
	 */
	public static String format1(Date date) {
		return DateFormat.getDateInstance(DateFormat.LONG).format(date);
	}/**
	 * 
	 * @title: format21
	 * @author 李超 lichao03@yinhai.com
	 * @date 2018年5月21日
	 * @description:格式化年月日
	 * @param date
	 * @return yyyy-MM-dd
	 */
	public static String format21(Date date) {
		return DateFormat.getDateInstance(DateFormat.DEFAULT).format(date);
	}
	/**
	 * 
	 * @title: format22
	 * @author 李超 lichao03@yinhai.com
	 * @date 2018年5月21日
	 * @description:格式化年月日
	 * @param date
	 * @return yyyy-MM-dd
	 */
	public static String format22(Date date) {
		return DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);
	}
	
	/**
	 * 
	 * @title: format3
	 * @author 李超 lichao03@yinhai.com
	 * @date 2018年5月21日
	 * @description:格式化年月日
	 * @param date
	 * @return yy-MM-dd
	 */
	public static String format3(Date date) {
		return DateFormat.getDateInstance(DateFormat.SHORT).format(date);
	}
	/**
	 * 
	 * @title: format4
	 * @author 李超 lichao03@yinhai.com
	 * @date 2018年5月21日
	 * @description:格式化年月日
	 * @param date
	 * @return yyyy-MM-dd hh:mm:ss
	 */
	public static String format4(Date date) {
		return new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
	}
	
}
