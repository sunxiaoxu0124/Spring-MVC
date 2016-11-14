package com.sxx.entity;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 8391476145704742467L;
	private long id;
	private String userName;
	private String password;
	private int isDel;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIsDel() {
		return isDel;
	}

	public void setIsDel(int isDel) {
		this.isDel = isDel;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password="
				+ password + ", isDel=" + isDel + "]";
	}

}
