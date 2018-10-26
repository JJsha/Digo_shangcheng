<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>welcome to Logup DIGO!</title>
    
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
    	<font style="color: white; font-size: 80px;">简&nbsp;陋&nbsp;的&nbsp;注&nbsp;册</font>
    </div>
  	<div style=" margin-left:50%; left:-150px;  top: 150px; position: absolute; width: 300px;height: auto; border: 1px solid white; text-align: center;">
    	<s:form action="Digo_LogupAction" >
    		<br>
	    	<font style="color: white;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;用户：</font><input type="text" name="userName"><br><font style="color: white;"><s:property value="errors.userName[0]"/></font><br><br>
	    	<font style="color: white;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;密码：</font><input type="password" name="password"><br><font style="color: white;"><s:property value="errors.password[0]"/></font><br><br>
	    	<font style="color: white;">真实姓名：</font><input type="text" name="trueName"><br><font style="color: white;"><s:property value="errors.trueName[0]"/></font><br><br>
	    	<font style="color: white;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Email：</font><input type="text" name="email"><br><font style="color: white;"><s:property value="errors.email[0]"/></font><br><br>
	    	<font style="color: white;">性别：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font>
	    		<input type="radio" name="sex" value="男">
	    			<font style="color: white;">男&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font>
	    		<input type="radio" name="sex" value="女">
	    			<font style="color: white;">女</font><br>
	    		<font style="color: white;">
	    			<s:property value="errors.sex[0]"/>
	    		</font><br><br>
	    	<font style="color: white;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;手机：</font><input type="text" name="phone"><br><font style="color: white;"><s:property value="errors.phone[0]"/></font><br><br>
	    	
	    	<input type="submit" value="提交">&nbsp;&nbsp;&nbsp;&nbsp;
	    	<input type="reset" value="重置">
    	</s:form>
    </div>
    	<% 
    		if(request.getAttribute("exist")!=null){
    			String exist=(String)request.getAttribute("exist");
    			%>
    			<h4 style="color: white; top:600px; position: absolute; margin-left:50%; left:-62px;"><%=exist %></h4><br>
    			<%
    		}else if(request.getAttribute("ok")!=null){
    			String ok=(String)request.getAttribute("ok");
    			%>
	    			<script type="text/javascript">
	    				alert("<%=ok%>");
	    				window.location='digo_Login.jsp';
	    			</script>
    			<%
    		}
    	%>
    	
  </body>
</html>
