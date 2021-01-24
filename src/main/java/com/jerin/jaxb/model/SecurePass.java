package com.jerin.jaxb.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SecurePass {
	
	private List<User> users;

	public SecurePass(List<User> users) {
		super();
		this.users = users;
	}

	public SecurePass() {
		super();
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "SecurePass [users=" + users + "]";
	}
	
	
	
	
	

}
