package com.vo;

public class User {
	private String u_id;
	private String pwd;
	private String u_name;
	private String u_ip;
	
	public User() {
	}

	public User(String u_id, String pwd, String u_name, String u_ip) {
		this.u_id = u_id;
		this.pwd = pwd;
		this.u_name = u_name;
		this.u_ip = u_ip;
	}

	public String getU_id() {
		return u_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	
	public String getU_ip() {
		return u_ip;
	}

	public void setU_ip(String u_ip) {
		this.u_ip = u_ip;
	}

	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", pwd=" + pwd + ", u_name=" + u_name + ", u_ip=" + u_ip + "]";
	}

	
	
	
	
}
