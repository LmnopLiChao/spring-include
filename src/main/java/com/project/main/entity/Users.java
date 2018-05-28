/**
 * @fileName: Users.java
 * @package: com.project.main.entity
 * @description: TODO
 * @author: 李超   lichao322@foxmail.com
 * @date: 2018年5月22日 下午4:12:06
 * @version: V1.0
 */
package com.project.main.entity;

import java.util.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "users", schema = "project")
public class Users {               
	//用户ID
	private String id;            
	//用户姓名
	private String name;          
	//登陆ID
	private String loginId;      
	//密码
	private String password;      
	//菜单权限
	private Integer power;        
	//最后一次登录时间
	private Date lastLoginTime;  
	//登陆失败次数
	private Integer failures;   
	//有效性
	private Boolean effective;
	
	@Id
	@Column(name="id")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Basic
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Basic
	@Column(name="loginId")
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	@Basic
	@Column(name="password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Basic
	@Column(name="power")
	public Integer getPower() {
		return power;
	}
	public void setPower(Integer power) {
		this.power = power;
	}
	@Basic
	@Column(name="lastLoginTime")
	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	@Basic
	@Column(name="failures")
	public Integer getFailures() {
		return failures;
	}
	public void setFailures(Integer failures) {
		this.failures = failures;
	}
	@Basic
	@Column(name="effective")
	public Boolean getEffective() {
		return effective;
	}
	public void setEffective(Boolean effective) {
		this.effective = effective;
	}
	
}
