package com.mapper;

import java.util.ArrayList;

import com.vo.Category;

public interface CategoryMapper {
	public void insert(Category obj);
	public void delete(Integer obj);
	public void update(Category obj);
	public Category select(Integer obj);
	public ArrayList<Category> selectall();
	public void insertCheckCateNum(Category obj);
}



