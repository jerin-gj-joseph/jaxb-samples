package com.jerin.jaxb.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Site {
	
	private Integer id;
	private String site;
	private String userId;
	private String password;
	private boolean visibleByDefault;
	private List<Attribute> attributeList = new ArrayList<>();
	
	public Site(Integer id, String site, String userId, String password, boolean visibleByDefault) {
		super();
		this.id = id;
		this.site = site;
		this.userId = userId;
		this.password = password;
		this.visibleByDefault = visibleByDefault;
	}
	
	
	public Site() {
		super();
	}
	
	


	public Site(String site, String userId, String password) {
		super();
		this.id = 1;
		this.site = site;
		this.userId = userId;
		this.password = password;
		this.visibleByDefault = false;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isVisibleByDefault() {
		return visibleByDefault;
	}
	public void setVisibleByDefault(boolean visibleByDefault) {
		this.visibleByDefault = visibleByDefault;
	}
	
	public List<Attribute> getAttributeList() {
		return attributeList;
	}


	public void setAttributeList(List<Attribute> attributeList) {
		this.attributeList = attributeList;
	}
	
	public void addAttribute(Attribute attr) {
		if(this.attributeList==null) {
			this.attributeList = new ArrayList<>();
		}
		this.attributeList.add(attr);
	}


	@Override
	public String toString() {
		return "Site [id=" + id + ", site=" + site + ", userId=" + userId + ", password=" + password
				+ ", visibleByDefault=" + visibleByDefault + ", attributeList=" + attributeList + "]";
	}



}
