package com.restaurant;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.frame.Biz;
import com.frame.Dao;
import com.vo.Bfile;
import com.vo.Restaurant;


@Service("rtbiz")
public class RestaurantBiz implements Biz<Integer, Restaurant>{

	@Resource(name="rtdao")
	Dao<Integer, Restaurant> dao;

	@Override
	public void register(Restaurant v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(Restaurant v) throws Exception {
		dao.update(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public Restaurant get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public ArrayList<Restaurant> get() throws Exception {
		return dao.select();
	}
	
}












