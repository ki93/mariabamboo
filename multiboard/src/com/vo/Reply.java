package com.vo;

import java.util.Date;

public class Reply {
	private int r_id;
	private int at_id;
	private String r_cont;  
	private String u_id;
	private Date r_date;
	
	
	public Reply() {
		
	}

	public Reply(String r_cont) {
		super();
		this.r_cont = r_cont;
	}

	public Reply(int r_id, int at_id, String r_cont, String u_id, Date r_date) {
		super();
		this.r_id = r_id;
		this.at_id = at_id;
		this.r_cont = r_cont;
		this.u_id = u_id;
		this.r_date = r_date;
	}

	public int getR_id() {
		return r_id;
	}

	public void setR_id(int r_id) {
		this.r_id = r_id;
	}

	public int getAt_id() {
		return at_id;
	}

	public void setAt_id(int at_id) {
		this.at_id = at_id;
	}

	public String getR_cont() {
		return r_cont;
	}

	public void setR_cont(String r_cont) {
		this.r_cont = r_cont;
	}

	public String getU_id() {
		return u_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public Date getR_date() {
		return r_date;
	}

	public void setR_date(Date r_date) {
		this.r_date = r_date;
	}

	@Override
	public String toString() {
		return "Reply [r_id=" + r_id + ", at_id=" + at_id + ", r_cont=" + r_cont + ", u_id=" + u_id + ", r_date="
				+ r_date + "]";
	}
	
	
	
}
