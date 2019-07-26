package com.vo;

public class Restaurant {
	private int rt_id;
	private String rt_name;
	private String addr;
	private int cate_num;
	private int lat;
	private int lon;
	private String tel;
	
	public Restaurant() {
		
	}

	public Restaurant(int rt_id, String rt_name, String addr, int cate_num, int lat, int lon, String tel) {
		super();
		this.rt_id = rt_id;
		this.rt_name = rt_name;
		this.addr = addr;
		this.cate_num = cate_num;
		this.lat = lat;
		this.lon = lon;
		this.tel = tel;
	}

	public int getRt_id() {
		return rt_id;
	}

	public void setRt_id(int rt_id) {
		this.rt_id = rt_id;
	}

	public String getRt_name() {
		return rt_name;
	}

	public void setRt_name(String rt_name) {
		this.rt_name = rt_name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getCate_num() {
		return cate_num;
	}

	public void setCate_num(int cate_num) {
		this.cate_num = cate_num;
	}

	public int getLat() {
		return lat;
	}

	public void setLat(int lat) {
		this.lat = lat;
	}

	public int getLon() {
		return lon;
	}

	public void setLon(int lon) {
		this.lon = lon;
	}

	public String gettel() {
		return tel;
	}

	public void settel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Restaurant [rt_id=" + rt_id + ", rt_name=" + rt_name + ", addr=" + addr + ", cate_num=" + cate_num
				+ ", lat=" + lat + ", lon=" + lon + ", tel=" + tel + "]";
	}

}
