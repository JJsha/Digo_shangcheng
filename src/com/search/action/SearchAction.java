package com.search.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionContext;
import com.search.services.Searchservices;



public class SearchAction {
	private String SName;
	@Autowired
	Searchservices Searchservices;
	public Searchservices getSearchservices() {
		return Searchservices;
	}

	public void setSearchservices(Searchservices Searchservices) {
		this.Searchservices = Searchservices;
	}

	public String getSName() {
		return SName;
	}

	public void setSName(String sName) {
		SName = sName;
	}
	public String searchgoods(){
		List Goods;
		if(this.SName.isEmpty())
		{
			 Goods=Searchservices.searchGoods("SELECT TOP 10 * FROM Shangpin order by newid()");
			
		}
		else{
			 Goods=Searchservices.searchGoods("select * from Shangpin where s_name like '%"+this.SName+"%'");
		}
		ActionContext.getContext().put("Goods", Goods);
		return "success";
	}
}
