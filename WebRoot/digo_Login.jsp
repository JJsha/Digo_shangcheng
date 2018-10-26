<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Happy to Login DIGO!</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body style="background: url('digoMainPage_pic/background_moeStarNight.jpg'); text-align: center;">
  	<div style="text-align:center; width: 100%; height:140px;">
    	<font style="color: white; font-size: 80px;">简&nbsp;陋&nbsp;的&nbsp;登&nbsp;陆</font>
    </div>
  	<div style=" margin-left:50%; left:-150px;  top: 150px; position: absolute; width: 300px;height: 200px; border: 1px solid white; text-align: center;">
    	<s:form action="Digo_LoginAction" namespace="/" >
    		<br>
	    	<font style="color: white;">用户：</font><input type="text" name="userName"><br><font style="color: white;"><s:property value="errors.userName[0]"/></font><br><br>
	    	<font style="color: white;">密码：</font><input type="password" name="password"><br><font style="color: white;"><s:property value="errors.password[0]"/></font><br><br>
	    	<input type="submit" value="提交">&nbsp;&nbsp;&nbsp;&nbsp;
	    	<input type="reset" value="重置">&nbsp;&nbsp;&nbsp;&nbsp;<a style="color:white;" href="digo_Logup.jsp">注册</a>
    	</s:form>
    </div>
    	<% 
    		if(request.getAttribute("error")!=null){
    			String error=(String)request.getAttribute("error");
    			%>
    			<h4 style="color: white; top:350px; position: absolute; margin-left:50%; left:-62px;"><%=error %></h4><br>
    			<%
    		}else if(request.getAttribute("empty")!=null){
    			String empty=(String)request.getAttribute("empty");
    			%>
    			<h4 style="color: white; top:350px; position: absolute; margin-left:50%; left:-62px;"><%=empty %></h4><br>
    			<%
    		}else if(request.getAttribute("notLogin")!=null){
    			String notLogin=(String)request.getAttribute("notLogin");
    			%>
    			<h4 style="color: white; top:350px; position: absolute; margin-left:50%; left:-62px;"><%=notLogin %></h4><br>
    			<%
    		}
    	%> 
    	
  </body>
</html>
