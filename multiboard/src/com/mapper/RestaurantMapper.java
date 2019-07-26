package com.mapper;

import java.util.ArrayList;

import com.vo.Bfile;
import com.vo.Restaurant;

public interface RestaurantMapper {
	public void insert(Restaurant obj);
	public void delete(Integer obj);
	public void update(Restaurant obj);
	public Restaurant select(Integer obj);
	public ArrayList<Restaurant> selectall();
}



