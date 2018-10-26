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
    <title>My JSP 'AddClasses.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/Back.css" type="text/css" />


  </head>
  
  <body>
  <s:actionmessage cssStyle="list-style-type:none;" escape="false"/> 
  	<div id="AC_div1">
  	<table border="1" align="center">
  		<s:form action="AddClasses" namespace="/Back" theme="simple">
  			<tr><td width="250px" height="150px">品牌名：<input type="text" name="CName" value=""><br>
  			<span class="s2"><s:property value="errors.CName[0]"/></span><br></td></tr>
  			<tr><td width="250px" height="150px">品牌描述：<textarea name="CDetail" rows="3" cols="20" style="resize:none;vertical-align:top"></textarea>
  			<span class="s2"><s:property value="errors.CDetail[0]"/></span><br></td></tr>
  			<tr><td><input type="submit" value="提交" style="border:0px;background: blue; color:white;"></td></tr>
  		</s:form>
  		
  		</table>
  	</div>
  </body>
</html>
