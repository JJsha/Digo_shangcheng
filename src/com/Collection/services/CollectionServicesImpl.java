package com.Collection.services;

import java.util.List;
import com.Collection.dao.*;
public class CollectionServicesImpl implements CollectionServicesInterface {
	CollectionDaoInterface collectionDao;

	public CollectionDaoInterface getCollectionDao() {
		return collectionDao;
	}

	public void setCollectionDao(CollectionDaoInterface collectionDao) {
		this.collectionDao = collectionDao;
	}

	public List searchCollection(int Uid){
	  
	 return collectionDao.searchCollcetion(Uid);
  }
	 public int deleteCollection(int uid,int sid){
		return collectionDao.deletecollection(uid, sid);
	 }
}
