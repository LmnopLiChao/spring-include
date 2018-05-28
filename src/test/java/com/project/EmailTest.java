package com.project;

import org.junit.Test;

import com.project.util.CaptchaUtils;
import com.project.util.MailUtil;

public class EmailTest {

	@Test
	public  void test(){
		String text = CaptchaUtils.creatCaptcha(6);
		MailUtil.send_mail("1243183609@qq.com", "你的验证码是"+text+"，请妥善保管切勿告诉他人！");
		System.out.println("邮件发送成功!");
	}

}
