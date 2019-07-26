package com.restaurant;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.mapper.RestaurantMapper;
import com.vo.Bfile;
import com.vo.Board;
import com.vo.Restaurant;


@Repository("rtdao")
public class RestaurantDao implements Dao<Integer, Restaurant>{

	@Autowired
	RestaurantMapper rtm;

	@Override
	public void insert(Restaurant v) throws Exception {
		rtm.insert(v);
	}

	@Override
	public void update(Restaurant v) throws Exception {
		rtm.update(v);
	}

	@Override
	public void delete(Integer k) throws Exception {
		rtm.delete(k);
	}

	@Override
	public Restaurant select(Integer k) throws Exception {
		return rtm.select(k);
	}
  
	@Override
	public ArrayList<Restaurant> select() throws Exception {
		return rtm.selectall();
	}
}







