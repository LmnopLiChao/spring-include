package com.project.main.entity;

import java.util.List;

import javax.persistence.*;
@Entity
@Table(name = "navs", schema = "project")
public class Navs {
	
	private String id;
	private String href;
	private String icon;
	private String power;
	private String spread;
	private String title;
	private Navs parent;
	private List<Navs> child;
	
	@Id
	@Column(name="id")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Basic
	@Column(name="href")
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	@Basic
	@Column(name="icon")
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	@Basic
	@Column(name="power")
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	@Basic
	@Column(name="spread")
	public String getSpread() {
		return spread;
	}
	public void setSpread(String spread) {
		this.spread = spread;
	}
	@Basic
	@Column(name="title")
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@ManyToOne(fetch = FetchType.LAZY)  
    @JoinColumn(name = "parent")  
	public Navs getParent() {
		return parent;
	}
	public void setParent(Navs parent) {
		this.parent = parent;
	}
	@OneToMany  
    @JoinColumn(name = "parent",nullable = true)  
	public List<Navs> getChild() {
		return child;
	}
	public void setChild(List<Navs> child) {
		this.child = child;
	}
	
}
