package com.board;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.frame.DependenciesDao;
import com.mapper.BoardMapper;
import com.vo.Board;


@Repository("bdao")
public class BoardDao implements DependenciesDao<Integer, Board>{

	@Autowired
	BoardMapper bm;

	@Override
	public void insert(Board v) throws Exception {
		bm.insert(v);		
	}

	@Override
	public void update(Board v) throws Exception {
		bm.update(v);
	}

	@Override
	public void delete(Integer k) throws Exception {
		bm.delete(k);
	}

	@Override
	public Board select(Integer k) throws Exception {
		return bm.select(k);
	}
	
	@Override
	public ArrayList<Board> select() throws Exception {
		return bm.selectall();
	}

	@Override
	public ArrayList<Board> selectByOwnerId(Integer k, String kw) throws Exception {
		return bm.selectByOwnerId(kw);
	}

	@Override
	public void deleteByOwnerId(Integer k, String kw) throws Exception {
		bm.deleteByOwnerId(kw);
	}	

}







