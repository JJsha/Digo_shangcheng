<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		function check(form){
			if(form.SName.value==''){
			alert("请输入商品名称！");
			form.SName.focus();
			return false;
			}
			if(form.SMoney.value==''){
			alert("请输入商品价格！");
			form.SName.focus();
			return false;
			}
			if(form.kucun.value==''){
			alert("请输入商品库存！");
			form.SName.focus();
			return false;
			}
			if(form.img.value==''){
			alert("请输入图片路径！");
			form.SName.focus();
			return false;
			}
			if(form.CId.value==''){
			alert("请输入类型ID！");
			form.SName.focus();
			return false;
			}
			if(confirm('你确定要增加吗？')){
			return true;
			}
			return false;
		}
	</script>
  </head>
  
  <body>
  <h1 style="text-align:center;">增加商品信息</h1>
    <s:form action="add" method="post">
    <table border="1" align="center">        
                <tr><td><P>商品名称：<input type="text" name="SName" value="${SName }"></P></td></tr>
                <tr><td><P>商品价格：<input type="text" name="SMoney" value="${SMoney }"></P></td></tr>
                <tr><td><P>商品库存：<input type="text" name="kucun" value="${kucun }"></P></td></tr>
                <tr><td><P>商品描述：<input type="text" name="SDetails" value="${SDetails}"></P></td></tr>
                <tr><td><P>图片路径：<input type="text" name="img" value="${img }"></P></td></tr>           
                <tr><td><P>类型ID：
                	<s:select list="list" theme="simple" listKey="CId" listValue="CName"></s:select>
                </P></td></tr>
                
            <tr><td><input type="submit" value="添加" onclick="return check(this.form)"/></td></tr>           
            <tr><td><input type="button" value="返回" onclick="javascript:window.location.href ='index.jsp';"></td></tr>        
    </table>
  	  
        </s:form>
    
  </body>
</html>
