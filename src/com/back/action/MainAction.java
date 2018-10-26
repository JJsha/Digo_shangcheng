package com.back.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;



public class MainAction extends ActionSupport {

	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String execute() throws Exception {
		if(a==1){return "addclasses";}
		return null;
		
	}
}
