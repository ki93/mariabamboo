package com.mapper;

import java.util.ArrayList;

import com.vo.Bfile;

public interface BfileMapper {
	public void insert(Bfile obj);
	public void delete(Integer obj);
	public void update(Bfile obj);
	public Bfile select(Integer obj);
	public ArrayList<Bfile> selectall();
	
	// Specialized
	public ArrayList<Bfile> selectByOwnerId(Integer obj);
	public void deleteByOwnerId(Integer obj);
}



