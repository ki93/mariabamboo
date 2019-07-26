package com.category;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.frame.RtDependenciesBiz;
import com.frame.RtDependenciesDao;
import com.vo.Category;


@Service("catebiz")
public class CategoryBiz implements RtDependenciesBiz<Integer, Category>{

	@Resource(name="catedao")
	RtDependenciesDao<Integer, Category> dao;

	@Override
	public void register(Category v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(Category v) throws Exception {
		dao.update(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public Category get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public ArrayList<Category> get() throws Exception {
		return dao.select();
	}

	@Override
	public void registerCheckCateNum(Category v) throws Exception {
		dao.insertCheckCateNum(v);
	}
}












