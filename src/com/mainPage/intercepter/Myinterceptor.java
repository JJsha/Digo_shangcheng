package com.mainPage.intercepter;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class Myinterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		
		String name = arg0.getInvocationContext().getName();
		if (name.equals("Digo_LoginAction")||name.equals("Digo_LogupAction")||name.equals("getGoods")) {
			return arg0.invoke();
		} else {
			// TODO Auto-generated method stub
			Map session = arg0.getInvocationContext().getSession();
			HttpServletRequest req = ServletActionContext.getRequest();
			String username = (String) session.get("userName");
			 String path = req.getServletPath();
					            String realPath =path.replace("/","") ;
			            realPath=realPath.replace(".action","");
			            session.put("prePage",realPath);        
			if (username==null) {
				
				req.setAttribute("notLogin","请先登录再进行操作！");
				
				return "login";
			} else {
				return arg0.invoke();
			}
		}
	}

}
