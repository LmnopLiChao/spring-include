package com.project.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareDate {

	public static int year;
	public static int month;
	public static long day;
	public static long hour;
	public static long min;
	public static long second;

	 public CompareDate(String dt1, String dt2) {
		
	}
	/**
	 * 
	 * @title: compare_date
	 * @author 李超 lichao0322@foxmail.com
	 * @date 2018年5月22日
	 * @description: 比较日期大小
	 * @param date1
	 * @param date2
	 * @return date1>date2
	 */
	public static boolean compare_date(String date1, String date2) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try {
			Date dt1 = df.parse(date1);
			Date dt2 = df.parse(date2);
			return dt1.getTime() > dt2.getTime();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return true;
	}
	public static boolean compare_date(Date date1, Date date2) {
		String dt1 = FormatDate.format4(date1);
		String dt2 = FormatDate.format4(date1);
		return compare_date(dt1,dt2);
	}
}
