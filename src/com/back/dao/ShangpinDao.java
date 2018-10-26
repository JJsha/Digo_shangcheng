package com.back.dao;

import java.util.List;

import com.domain.Classes;
import com.domain.Shangpin;

public interface ShangpinDao {
	
	public void insert(Shangpin shangpin);
	
	public void update(Shangpin shangpin);
	
	public void delete(Integer SId);
	
	public List<Shangpin> select();
	
	public  List<Shangpin> selectSid(Integer SId);
		
	public List<Classes> selectClasses();
	
	public Classes selectClasses(Integer CId);
	
	public List<Classes> checkClasses(String sql);
}
