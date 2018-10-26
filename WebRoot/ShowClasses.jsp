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
    <title>My JSP 'ShowClasses.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="css/Back.css" type="text/css" />
  </head>
  
  
  <body>
  <div id="SC_div">
    
    <table border="solid" style="text-align: center;" align="center">
    <tr>
    	<td height="25px" width="100px">品牌</td>
    	<td height="25px" width="200px">描述</td>
    	<td height="25px" ><input type="submit" value="删除" disabled="disabled"></td>
    	</tr>
    <s:iterator value="list" var="list" status="list">
    <s:form action="DeleteClasses" namespace="/Back" theme="simple">
    	<tr>
    	<td style="display:none"><input type="text" name="CId" value="<s:property value="CId" />"></td>
    		<td height="25px" width="100px"><s:property value="CName" /></td>
		    <td height="25px" width="200px"><s:property value="CDetail" /></td>
		    <td><input type="submit" value="删除" style="border:0px;background: #ff3737; color:white;"></td>
		</tr>
		</s:form>
			</s:iterator> 
		</table>
	
	</div>
  </body>
</html>
