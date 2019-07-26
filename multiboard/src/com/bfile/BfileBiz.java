package com.bfile;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.frame.DependenciesBiz;
import com.frame.DependenciesDao;
import com.vo.Bfile;

@Service("bfbiz")
public class BfileBiz implements DependenciesBiz<Integer, Bfile>{

	@Resource(name="bfdao")
	DependenciesDao<Integer, Bfile> dao;

	
	public void register(Bfile v) throws Exception {
		dao.insert(v);
	}

	public void modify(Bfile v) throws Exception {
		dao.update(v);	
		
	}

	public void remove(Integer k) throws Exception {
		dao.delete(k);
		
	}

	public Bfile get(Integer k) throws Exception {
		return dao.select(k);
	}

	public ArrayList<Bfile> get() throws Exception {
		return dao.select();
	}

	@Override
	public ArrayList<Bfile> getByOwnerId(Integer k, String kw) throws Exception {
		return dao.selectByOwnerId(k, null);
	}

	@Override
	public void removeByOwnerId(Integer k, String kw) throws Exception {
		dao.deleteByOwnerId(k, null);
	}
}
