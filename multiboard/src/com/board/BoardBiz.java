package com.board;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.frame.DependenciesBiz;
import com.frame.DependenciesDao;
import com.vo.Board;


@Service("bbiz")
public class BoardBiz implements DependenciesBiz<Integer, Board>{

	@Resource(name="bdao")
	DependenciesDao<Integer, Board> dao;

	@Override
	public void register(Board v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(Board v) throws Exception {
		dao.update(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	
	@Override
	public Board get(Integer k) throws Exception {
		return dao.select(k);
	}
	@Override
	public ArrayList<Board> get() throws Exception {
		return dao.select();
	}

	@Override
	public ArrayList<Board> getByOwnerId(Integer k, String kw) throws Exception {
		return dao.selectByOwnerId(null, kw);
	}

	@Override
	public void removeByOwnerId(Integer k, String kw) throws Exception {
		dao.deleteByOwnerId(null, kw);
	}
}












