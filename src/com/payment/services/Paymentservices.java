package com.payment.services;

import java.util.List;

import com.domain.Dingdan;

public interface Paymentservices {
	public List searchDD(String whereSql);
	public List searchGoods(String whereSql);
	public void createdd(Dingdan dingdan);
	public int searchddid(String whereSql);
	public boolean updatakucun(String whereSql);
}
