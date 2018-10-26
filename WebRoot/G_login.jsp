<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'G_login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/Back.css" type="text/css" />
  </head>
  
  
  <body style="background:url(img/back-background.jpg)">
  <s:actionmessage cssStyle="list-style-type:none;" escape="false"/>
  
  <div id="login_div">
  <h1 style="">简陋的后台登录页面</h1>
  	<s:form action="Login" namespace="/Back">
  		用户名：<input type="text" name="GName"><br>
  		<span class="s2"><s:property value="errors.GName[0]"/></span><br>
  		密&nbsp;&nbsp;码：<input type="password" name="password"><br>
  		<span class="s2"><s:property value="errors.password[0]"/></span><br>
  		<input type="submit" value="登录" >
  	</s:form>
  	</div>
  	
  </body>
</html>
