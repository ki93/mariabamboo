package com.mapper;

import java.util.ArrayList;

import com.vo.Bfile;
import com.vo.Reply;

public interface ReplyMapper {
	public void insert(Reply obj);
	public void delete(Integer obj);
	public void update(Reply obj);
	public Reply select(Integer obj);
	public ArrayList<Reply> selectall();
	
	// Specialized
	public ArrayList<Reply> selectByOwnerId(Integer obj);
	public void deleteByOwnerId(Integer obj);
}



