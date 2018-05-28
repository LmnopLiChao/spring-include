package com.project.util;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.mail.util.MailSSLSocketFactory;

import java.security.GeneralSecurityException;
import java.util.Properties;

/**
 * 邮件工具类
 */
public class MailUtil {
    /**
     * 发送邮件
     * @param to 给谁发
     * @param text 发送内容
     *
     */
    public static void send_mail(String to,String text){
       
    	 Properties props = new Properties();
    	 
    	    // 开启debug调试
    	    props.setProperty("mail.debug", "true");
    	    // 发送服务器需要身份验证
    	    props.setProperty("mail.smtp.auth", "true");
    	    // 设置邮件服务器主机名
    	    props.setProperty("mail.host", "smtp.qq.com");
    	    // 发送邮件协议名称
    	    props.setProperty("mail.transport.protocol", "smtp");
    	    MailSSLSocketFactory sf;
			try {
				sf = new MailSSLSocketFactory();
				sf.setTrustAllHosts(true);
			    props.put("mail.smtp.ssl.enable", "true");
	    	    props.put("mail.smtp.ssl.socketFactory", sf);
			} catch (GeneralSecurityException e) {
				e.printStackTrace();
			}
    	    Session session = Session.getInstance(props);
    	    Transport transport = null;
    	    try {
				transport = session.getTransport();
				
			} catch (NoSuchProviderException e) {
				e.printStackTrace();
			}
    	    Message msg = new MimeMessage(session);
    	    try {
				msg.setSubject("随机验证码");
				msg.setText(text);
		    	msg.setFrom(new InternetAddress("1563322963@qq.com"));
		    	transport.connect("smtp.qq.com", "1563322963@qq.com", "jnypzasgwnaghfje");
	    	    transport.sendMessage(msg, new Address[] { new InternetAddress(to) });
	    	    transport.close();
			} catch (MessagingException e) {
				e.printStackTrace();
			}
			

    }
}