package com.back.dao;
import java.util.List;

import com.domain.*;


public interface BackDao {
	public Gly login(String whereSql);
	public Classes checkclasses(String sql);
	public Shangpin checkShangpin(String sql);
	public void addclasses(Classes classes);
	public List searchclasses(String sql);
	public void delete(String sql);
}
