package com.category;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.frame.RtDependenciesDao;
import com.mapper.CategoryMapper;
import com.vo.Category;


@Repository("catedao")
public class CategoryDao implements RtDependenciesDao<Integer, Category>{

	@Autowired
	CategoryMapper catem;

	@Override
	public void insert(Category v) throws Exception {
		catem.insert(v);
	}

	@Override
	public void update(Category v) throws Exception {
		catem.update(v);		
	}

	@Override
	public void delete(Integer k) throws Exception {
		catem.delete(k);
	}

	@Override
	public Category select(Integer k) throws Exception {
		return catem.select(k);
	}

	@Override
	public ArrayList<Category> select() throws Exception {
		return catem.selectall();
	}

	@Override
	public void insertCheckCateNum(Category v) throws Exception {
		catem.insertCheckCateNum(v);
	}
}







