package com.search.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.search.dao.*;
public class SearchservicesImpl implements Searchservices {
	@Autowired
	Searchdao searchdao;

	public Searchdao getSearchdao() {
		return searchdao;
	}

	public void setSearchdao(Searchdao searchdao) {
		this.searchdao = searchdao;
	}

	@Override
	public List searchGoods(String whereSql) {
		// TODO Auto-generated method stub
		return searchdao.searchGoods(whereSql);
	}

}
