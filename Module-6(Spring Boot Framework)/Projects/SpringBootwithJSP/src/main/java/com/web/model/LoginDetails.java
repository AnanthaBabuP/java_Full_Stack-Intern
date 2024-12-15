package com.web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "login")
public class LoginDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loginId;
	private String userName;
	private String password;
	private String conf_password;
	private String mail_id;
	
	public LoginDetails() {
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public String toString() {
		return "LoginDetails [loginId=" + loginId + ", userName=" + userName + ", password=" + password
				+ ", conf_password=" + conf_password + ", mail_id=" + mail_id + "]";
	}



	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
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

	public String getConf_password() {
		return conf_password;
	}

	public void setConf_password(String conf_password) {
		this.conf_password = conf_password;
	}

	public String getMail_id() {
		return mail_id;
	}

	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	
	
}
