package com.back.services;

import java.util.List;

import com.domain.Classes;
import com.domain.Gly;
import com.domain.Shangpin;

public interface BackServices {
	public Gly login(String whereSql);
	public Classes checkclasses(String sql);
	public void addclasses(Classes classes);
	public List searchclasses(String sql);
	public void delete(String sql);
	public Shangpin checkShangpin(String sql);
}
