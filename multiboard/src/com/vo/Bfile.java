package com.vo;

import org.springframework.web.multipart.MultipartFile;

public class Bfile {
	private int f_id;
	private String f_name;
	private int at_id;
	MultipartFile mf;
	
	
	public Bfile() {
		
	}

	


	public Bfile(int f_id, String f_name, int at_id, MultipartFile mf) {
		super();
		this.f_id = f_id;
		this.f_name = f_name;
		this.at_id = at_id;
		this.mf = mf;
	}

	public Bfile(int f_id, String f_name, int at_id) {
		super();
		this.f_id = f_id;
		this.f_name = f_name;
		this.at_id = at_id;
	}

	public int getF_id() {
		return f_id;
	}

	public void setF_id(int f_id) {
		this.f_id = f_id;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public int getAt_id() {
		return at_id;
	}

	public void setAt_id(int at_id) {
		this.at_id = at_id;
	}

	public MultipartFile getMf() {
		return mf;
	}

	public void setMf(MultipartFile mf) {
		this.mf = mf;
	}

	@Override
	public String toString() {
		return "Bfile [f_id=" + f_id + ", f_name=" + f_name + ", at_id=" + at_id + ", mf=" + mf + "]";
	}

    
	
	
}
