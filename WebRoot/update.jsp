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
    
    <title>My JSP 'update.jsp' starting page</title>
    
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
			if(confirm('你确定要更新吗？')){
			return true;
			}
			return false;
		}
		</script>
  </head>
  
  <body>  
   	<h1 style="text-align:center;">修改商品信息</h1>
    <form action="update" method="post">
    <table border="1" align="center">
        <tr>
                <th>商品ID</th>
                <th>商品名称</th>
                <th>商品价格</th>
                <th>商品库存</th>
                <th>类型ID</th>
                <th>商品描述</th>
                <th>商品图片</th>
        </tr>
        <s:iterator value="#request.allshangpin">
            <tr>
                <td><input type="text" name="SId" onfocus="this.blur()" value="<s:property value="SId" />"></td>
                <td><input type="text" name="SName" value="<s:property value="SName"/>"></td>
                <td><input type="text" name="SMoney" value="<s:property value="SMoney"/>"></td>
                <td><input type="text" name="kucun" value="<s:property value="kucun"/>"></td> 
                <td><input type="text" name="CId" value="<s:property value="CId"/>"></td>         
                <td><input type="text" name="SDetails" value="<s:property value="SDetails"/>"></td>
                <td><input type="text" name="img" value="<s:property value="img"/>"></td>                      
            </tr>
        </s:iterator>
        <tr>
        		<td><input type="submit" value="更新" onclick="return check(this.form)"/></td>
                <td><input type="button" value="返回" onclick="javascript:window.location.href ='index.jsp';"></td> 
                                                
            </tr>
    </table>
        </form>
  </body>
</html>
