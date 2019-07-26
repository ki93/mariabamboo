package com.vo;

import java.sql.Date;

public class Board {
	private int at_id;
	private String u_id;
	private String at_title;
	private String at_detail;
	private int at_hits;
	private int b_type;
	private Date at_date;
	private int rt_id;
	
	public Board() {
		
	}

	public Board(int at_id, String u_id, String at_title, String at_detail, int at_hits, int b_type, Date at_date) {
		super();
		this.at_id = at_id;
		this.u_id = u_id;
		this.at_title = at_title;
		this.at_detail = at_detail;
		this.at_hits = at_hits;
		this.b_type = b_type;
		this.at_date = at_date;
	}

	public Board(int at_id, String u_id, String at_title, String at_detail, int at_hits, int b_type, Date at_date,
			int rt_id) {
		super();
		this.at_id = at_id;
		this.u_id = u_id;
		this.at_title = at_title;
		this.at_detail = at_detail;
		this.at_hits = at_hits;
		this.b_type = b_type;
		this.at_date = at_date;
		this.rt_id = rt_id;
	}

	public int getAt_id() {
		return at_id;
	}

	public void setAt_id(int at_id) {
		this.at_id = at_id;
	}

	public String getU_id() {
		return u_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public String getAt_title() {
		return at_title;
	}

	public void setAt_title(String at_title) {
		this.at_title = at_title;
	}

	public String getAt_detail() {
		return at_detail;
	}

	public void setAt_detail(String at_detail) {
		this.at_detail = at_detail;
	}

	public int getAt_hits() {
		return at_hits;
	}

	public void setAt_hits(int at_hits) {
		this.at_hits = at_hits;
	}

	public int getB_type() {
		return b_type;
	}

	public void setB_type(int b_type) {
		this.b_type = b_type;
	}

	public Date getAt_date() {
		return at_date;
	}

	public void setAt_date(Date at_date) {
		this.at_date = at_date;
	}

	public int getRt_id() {
		return rt_id;
	}

	public void setRt_id(int rt_id) {
		this.rt_id = rt_id;
	}
	


	@Override
	public String toString() {
		return "Board [at_id=" + at_id + ", u_id=" + u_id + ", at_title=" + at_title + ", at_detail=" + at_detail
				+ ", at_hits=" + at_hits + ", b_type=" + b_type + ", at_date=" + at_date + ", rt_id=" + rt_id+"]";
	}

	
	
}
