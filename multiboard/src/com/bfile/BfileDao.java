package com.bfile;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.frame.DependenciesDao;
import com.mapper.BfileMapper;
import com.vo.Bfile;

@Repository("bfdao")
public class BfileDao implements DependenciesDao<Integer, Bfile> {


	@Autowired
	BfileMapper bm;
	
	
	@Override
	public void insert(Bfile v) throws Exception {
		bm.insert(v);
		
	}

	@Override
	public void update(Bfile v) throws Exception {
		bm.update(v);
	}

	@Override
	public void delete(Integer k) throws Exception {
		bm.delete(k);
	}
	
	@Override
	public Bfile select(Integer k) throws Exception {
		return bm.select(k);
	}

	@Override
	public ArrayList<Bfile> select() throws Exception {
		return bm.selectall();
	}

	@Override
	public ArrayList<Bfile> selectByOwnerId(Integer k, String kw) throws Exception {
		return bm.selectByOwnerId(k);
	}

	@Override
	public void deleteByOwnerId(Integer k, String kw) throws Exception {
		bm.deleteByOwnerId(k);
	}
}
