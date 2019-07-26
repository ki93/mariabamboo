package com.reply;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.frame.DependenciesDao;
import com.mapper.ReplyMapper;
import com.vo.Reply;


@Repository("rdao")
public class ReplyDao implements DependenciesDao<Integer, Reply>{

	@Autowired
	ReplyMapper rm;

	@Override
	public void insert(Reply v) throws Exception {
		rm.insert(v);
	}

	@Override
	public void update(Reply v) throws Exception {
		rm.update(v);
	}

	@Override
	public void delete(Integer k) throws Exception {
		rm.delete(k);
	}

	@Override
	public Reply select(Integer k) throws Exception {
		return rm.select(k);
	}

	@Override
	public ArrayList<Reply> select() throws Exception {
		return rm.selectall();
	}
	
	@Override
	public ArrayList<Reply> selectByOwnerId(Integer k, String kw) throws Exception {
		return rm.selectByOwnerId(k);
	}

	@Override
	public void deleteByOwnerId(Integer k, String kw) throws Exception {
		rm.deleteByOwnerId(k);
	}
}







