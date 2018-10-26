package com.ShowGoods.dao;

import java.util.List;

public interface ShowGoodsDao {
	public List searchGoods(String whereSql);
	public void addcar(int uId, int sId, int count);
	public int searchCar(String whereSql);
	public void updatecar(String whereSql);
	public void addfavorites(int uId, int sId);
}
