package com.mapper;

import java.util.ArrayList;

import com.vo.Bfile;
import com.vo.Board;

public interface BoardMapper {
	public void insert(Board obj);
	public void delete(Integer obj);
	public void update(Board obj);
	public Board select(Integer obj);
	public ArrayList<Board> selectall();
	
	// Specialized
	public ArrayList<Board> selectByOwnerId(String obj);
	public void deleteByOwnerId(String obj);
}



