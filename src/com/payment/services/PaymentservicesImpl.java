package com.payment.services;

import java.util.List;

import com.domain.Dingdan;
import com.payment.dao.*;

public class PaymentservicesImpl implements Paymentservices {
	PaymentDao PaymentDao;
	
	public PaymentDao getPaymentDao() {
		return PaymentDao;
	}

	public void setPaymentDao(PaymentDao paymentDao) {
		PaymentDao = paymentDao;
	}

	@Override
	public List searchDD(String whereSql) {
		// TODO Auto-generated method stub
		return PaymentDao.searchDD(whereSql);
	}
	public List searchGoods(String whereSql){
		return PaymentDao.searchGoods(whereSql);
	}

	@Override
	public void createdd(Dingdan dingdan) {
		// TODO Auto-generated method stub
		 PaymentDao.createdd(dingdan);
	}

	@Override
	public int searchddid(String whereSql) {
		// TODO Auto-generated method stub
		return PaymentDao.searchddid(whereSql);
	}

	@Override
	public boolean updatakucun(String whereSql) {
		// TODO Auto-generated method stub
		return PaymentDao.updatakucun(whereSql);
	}

}
