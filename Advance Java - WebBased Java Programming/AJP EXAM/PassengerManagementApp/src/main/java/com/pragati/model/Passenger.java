package com.pragati.model;

public class Passenger {
	private int id;
	private int uid;
	private String name;
	private String gender;
	private String country ;
	private String about;
	private String maillist;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getMaillist() {
		return maillist;
	}
	public void setMaillist(String maillist) {
		this.maillist = maillist;
	}
	
}