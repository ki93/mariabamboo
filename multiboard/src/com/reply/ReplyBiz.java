package com.reply;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.frame.DependenciesBiz;
import com.frame.DependenciesDao;
import com.vo.Reply;


@Service("rbiz")
public class ReplyBiz implements DependenciesBiz<Integer, Reply>{

	@Resource(name="rdao")
	DependenciesDao<Integer, Reply> dao;

	@Override
	public void register(Reply v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(Reply v) throws Exception {
		dao.update(v);	
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public Reply get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public ArrayList<Reply> get() throws Exception {
		return dao.select();
	}

	@Override
	public ArrayList<Reply> getByOwnerId(Integer k, String kw) throws Exception {
		return dao.selectByOwnerId(k, null);
	}

	@Override
	public void removeByOwnerId(Integer k, String kw) throws Exception {
		dao.deleteByOwnerId(k, null);
	}
}












