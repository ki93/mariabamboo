package com.frame;

import java.util.ArrayList;

public interface RtDependenciesDao<K,V> {
	public void insert(V v) throws Exception;
	public void update(V v) throws Exception;
	public void delete(K k) throws Exception;
	public V select(K k) throws Exception;
	public ArrayList<V> select() throws Exception;
	
	// Specialized
	public void insertCheckCateNum(V v) throws Exception;
}
