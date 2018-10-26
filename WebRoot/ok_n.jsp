<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>  
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ok_n.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
  </head>
  
  <body>
  <h1 style="text-align:center;">查询所有商品信息</h1>
   <table border="1" align="center">
        <tr>
                <td><a href="toadd.action">增加商品</a></td>
                <td style="display:none;"></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td><a href="queryall.action">刷新</a></td>   
        </tr>
        <tr>
                <th>商品ID</th>
                <th>商品名称</th>
                <th>商品价格</th>
                <th>商品库存</th>
                <th>类型ID</th>
                <th>商品描述</th>
                <th>商品图片</th>
                <th>操作</th>
        </tr>
        <s:iterator value="allshangpin">
            <tr>
                <td><s:property value="SId"/></td>
                <td><s:property value="SName"/></td>
                <td><s:property value="SMoney"/></td>
                <td><s:property value="kucun"/></td> 
                <td><s:property value="CId"/></td>         
                <td><s:property value="SDetails"/></td>
                <td><img  width="150px" height="150px" src="<s:property value="img"/>"></td>               
                <td>
                    <a href="del.action?SId=${SId }" onclick="{if(confirm('你确定要删除吗？')){return true;}return false;}" >删除</a>
                    <a href="toup.action?SId=${SId }">修改</a>
                    <a href="news.action?SId=${SId }">详细</a>
                </td>
            </tr>
        </s:iterator>
    </table>
    
  </body>
</html>
