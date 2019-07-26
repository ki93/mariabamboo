package com.vo;

public class Category {
	private int cate_num;
	private String cate_det;
	
	public Category() {
		
	}

	public Category(int cate_num, String cate_det) {
		super();
		this.cate_num = cate_num;
		this.cate_det = cate_det;
	}

	public int getCate_num() {
		return cate_num;
	}

	public void setCate_num(int cate_num) {
		this.cate_num = cate_num;
	}

	public String getCate_det() {
		return cate_det;
	}

	public void setCate_det(String cate_det) {
		this.cate_det = cate_det;
	}

	@Override
	public String toString() {
		return "Category [cate_num=" + cate_num + ", cate_det=" + cate_det + "]";
	}
	
	
	
}
