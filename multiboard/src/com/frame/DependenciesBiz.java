package com.frame;

import java.util.ArrayList;

import org.springframework.transaction.annotation.Transactional;

public interface DependenciesBiz<K,V> {
	@Transactional
	public void register(V v) throws Exception;
	@Transactional
	public void modify(V v) throws Exception;
	@Transactional
	public void remove(K k) throws Exception;
	public V get(K k) throws Exception;
	public ArrayList<V> get() throws Exception;

	// Specialized
	public ArrayList<V> getByOwnerId(K k, String kw) throws Exception;
	public void removeByOwnerId(K k, String kw) throws Exception;
}
