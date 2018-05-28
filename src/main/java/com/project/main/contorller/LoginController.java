package com.project.main.contorller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.exception.BusinessException;
import com.project.main.entity.Users;
import com.project.main.repository.User;
import com.project.util.CompareDate;
import com.project.util.MD5;

/**
 * 
 * @className: LoginController
 * @description: 登陆控制器
 * @author 李超   lichao322@foxmail.com
 * @date 2018年5月22日 下午4:04:06
 */
@Controller
public class LoginController {
	
	@Autowired
	User user;
	
	@ResponseBody
	@RequestMapping("login")
	public String login (String loginId, String password, HttpSession session){
		password = MD5.getMD5(password);
		Users u = user.getUserByLoginId(loginId);
		if (u==null) {
			throw new BusinessException ("1", "账号不存在！");
		}else if(u.getEffective()) {
			if (u.getFailures()<=3) {
				
			}
			 if (u.getPassword().equals(password)) {
				session.setAttribute("user", u);
			}else {
				u.setLastLoginTime(new Date());
				u.setFailures(u.getFailures()+1);
				throw new BusinessException ("2", "密码错误！");
			}
		}else {
			throw new BusinessException ("1", "账号不存在！");
		}
		return "";
		
	}
}
