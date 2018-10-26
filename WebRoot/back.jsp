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
    <title>My JSP 'back.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/Back.css" type="text/css" />

  </head>
  
  <body>
  
    <div>
  	<div id="back_div1" style="text-align: center;">
  	<h1>简陋的后台页面</h1>
  	<div id="div1" style="text-align: center;">
  	<s:iterator value="gly" var="gly" status="gly">
  	<span>欢迎登录，<s:property value="GName" /></span>
  	</s:iterator>
  	<a href="G_login.jsp">退出</a>
  	</div>
  	</div>
  	<div id="back_div2">
  	<div class="dropdown" id="dropdown1">
  <button class="dropbtn" id="dropbtn">品牌管理</button>
  <div class="dropdown-content" id="dropdown-content">
    <s:a href="AddClasses.jsp" target="ifm">添加品牌</s:a>
    <s:a action="ShowClasses" namespace="/Back" target="ifm">显示品牌信息</s:a>
  </div>
</div>
<div class="dropdown" id="dropdown1">
  <button class="dropbtn" id="dropbtn">商品管理</button>
  <div class="dropdown-content" id="dropdown-content">
    <s:a href="index.jsp" target="ifm">显示商品信息</s:a>
    <s:a href="loadcheckC.jsp" target="ifm">添加商品</s:a>

  </div>
</div>
  	</div>
  	<div id="back_div3">
  	<iframe name="ifm" id="ifm" width=100% height=100%></iframe>
  	</div>
  </div>
  
  </body>
</html>
