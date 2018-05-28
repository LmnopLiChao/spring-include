package com.project;

import java.util.Date;

import org.junit.Test;

import com.project.util.FormatDate;

public class FormatDateTest {
	
	Date date = new Date();
	@Test
	public void format() {
		System.out.println(FormatDate.format(date));
		System.out.println(FormatDate.format0(date));
		System.out.println(FormatDate.format1(date));
		System.out.println(FormatDate.format21(date));
		System.out.println(FormatDate.format22(date));
		System.out.println(FormatDate.format3(date));
		System.out.println(FormatDate.format4(date));
	}
}
