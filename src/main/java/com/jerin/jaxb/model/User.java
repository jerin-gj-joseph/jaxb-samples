package com.jerin.jaxb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.jerin.jaxb.main.JaxbDateAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class User {

	private String userId;
	private String password;
	private String firstName;
	private String lastName;
	private String passPhrase;
	private Integer failedPasswordAttempts;
	
	@XmlJavaTypeAdapter(JaxbDateAdapter.class)
	private Date lastFailedAttempt;
	
	List<Site> sites = new ArrayList<>();

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getPassPhrase() {
		return passPhrase;
	}

	public void setPassPhrase(String passPhrase) {
		this.passPhrase = passPhrase;
	}

	public Integer getFailedPasswordAttempts() {
		return failedPasswordAttempts;
	}

	public void setFailedPasswordAttempts(Integer failedPasswordAttempts) {
		this.failedPasswordAttempts = failedPasswordAttempts;
	}

	public Date getLastFailedAttempt() {
		return lastFailedAttempt;
	}

	public void setLastFailedAttempt(Date lastFailedAttempt) {
		this.lastFailedAttempt = lastFailedAttempt;
	}

	public List<Site> getSites() {
		return sites;
	}

	public void setSites(List<Site> sites) {
		this.sites = sites;
	}

	public void addSite(Site site) {
		if(this.sites==null) {
			this.sites = new ArrayList<>();
		}
		this.sites.add(site);
	}
	
	public void addSites(List<Site> sites) {
		if(this.sites==null) {
			this.sites = new ArrayList<>();
		}
		this.sites.addAll(sites);
	}

	public User(String firstName, String lastName, String userId, String password, String passPhrase) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userId = userId;
		this.password = password;
		this.passPhrase = passPhrase;
		this.failedPasswordAttempts = 0;
		this.lastFailedAttempt = null;
	}
	
	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", userId=" + userId + ", password="
				+ password + ", passPhrase=" + passPhrase + ", failedPasswordAttempts=" + failedPasswordAttempts
				+ ", lastFailedAttempt=" + lastFailedAttempt + ", sites=" + sites + "]";
	}
	
	

}
