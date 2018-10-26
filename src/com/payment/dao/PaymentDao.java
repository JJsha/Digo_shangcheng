package com.payment.dao;

import java.util.List;

import com.domain.Dingdan;

public interface PaymentDao {
	public List searchDD(String whereSql);
	public List searchGoods(String whereSql);
	public void createdd(Dingdan dingdan);
	public int searchddid(String whereSql);
	public boolean updatakucun(String whereSql);
}
