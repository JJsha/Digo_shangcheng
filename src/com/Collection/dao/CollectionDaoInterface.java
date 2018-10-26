package com.Collection.dao;

import java.util.List;

import com.domain.*;
public interface CollectionDaoInterface {
   public List searchCollcetion(int Uid);
   public int deletecollection(int uid,int sid);
}
