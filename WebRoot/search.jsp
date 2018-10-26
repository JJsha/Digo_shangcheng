<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>My JSP 'search.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
		<link rel="stylesheet" type="text/css" href="css/search.css">
	<script type="text/javascript">
		function ol(){
		var wellcome=document.getElementById("Wellcome");
			var login=document.getElementById("headBar_right1_log");
			
	  		if(wellcome.title!="null"){
	  			login.style.display="none";
	  			wellcome.style.display="block";
	  			
	  		}
		}
		    
	</script>
  </head>
  
  <body onload="ol();">
    	<div id="headBar">
    	<div id="headBar_Controler">
    		<div id="headBar_left">
    			<span id="pageTag"><a class="headBar_left_aLag" href="#">DiGo</a></span>
    			<span class="headBar_left_spanLag">|</span>
    		
    			<span class="headBar_left_spanLag">Digo为烧钱而生</span>
    		
    		</div>
    		<div id="headBar_right1">
    			<div id="headBar_right1_log">
    				<a class="headBar_right1_log" href="digo_Login.jsp">登陆</a>
    				<span>|</span>
    				<a class="headBar_right1_log" href="digo_Logup.jsp" >注册</a>
    			</div>
    			<span id="Wellcome" style="display:none" title="<%= session.getAttribute("userName")%>" >欢迎!<%= session.getAttribute("userName")%></span>
    		</div>
    		<div id="headBar_right2">
    			<a class="headBar_right2_aTag" href="<s:url action="personaction"/>">我的DIGO</a>
    			<span>|</span>
    			<a class="headBar_right2_aTag" href="<s:url action="caraction"/>" >购物车</a>
    		</div>
    	</div>
    </div>
    <div id="main">
    	<div id="body">
    	<div id="search">
    	<s:form action="search">
    		<input id="searchText" type="text" name="SName">
  			<s:submit id="searchTextBtn" value="搜索" method="searchgoods" theme = "simple"></s:submit>
  		</s:form>
  		</div>
  		<div id="goods">
  			<s:iterator  value="Goods"  >
						<div class="goods">
						<a href="getGoods?SId=<s:property value="SId"/>"><img  src="<s:property value="img"/>"><br><br></a>
						<span ><s:property value="SName"/></span><br><br>
						<span><s:property value="SMoney"/>元</span><br><br>
						<a  class="addcar" href="addcar?SId=<s:property value="SId"/>&UId=1&count=1"><input type="button" class="addcarbtn" value="加入购物车"></a>
						<input type="button" class="remindbtn" value="到货提醒" style="display: none;" onclick="remind();">
						<br><span style="display: none;"><s:property value="kucun"/></span>
						</div>
			</s:iterator>
		</div>
    	</div>
    </div>
     <div id="foot">
		<div id="foot-top">
			<ul>
				<li><img  src="img/ico1.png"><span>&nbsp预约维修服务</span></li>
				<li><img  src="img/ico2.png"><span>&nbsp7天无理由退货</span></li>
				<li><img  src="img/ico3.png"><span>&nbsp15天免费换货</span></li>
				<li><img  src="img/ico4.png"><span>&nbsp满150元包邮</span></li>
				<li><img  src="img/ico5.png"><span>&nbsp0家售后网点</span></li>
			</ul>
		</div>
		<div id="foot-bottom">
			<dl class="col-links ">
                <dt>帮助中心</dt>
                <dd>账户管理</dd>
                <dd>购物指南</dd>
                <dd>订单操作</dd>
            </dl>
            <dl class="col-links ">
                <dt>服务支持</dt>
                <dd>售后政策</dd>
                <dd>自助服务</dd>
                <dd>相关下载</dd>     
            </dl>
            <dl class="col-links ">
                <dt>线下门店</dt>
                <dd>DiGo之家</dd>
                <dd>服务网点</dd>
                <dd>授权体验店</dd>
            </dl>
            <dl class="col-links ">
                <dt>关于DiGo</dt>
                <dd>了解DiGo</dd>
                <dd>加入DiGo</dd>
                <dd>投资者关系</dd>
            </dl>
            <dl class="col-links ">
                <dt>关注我们</dt>
                <dd>新浪微博</dd>
                <dd>官方微信</dd>
                <dd>联系我们</dd>
            </dl>
		</div>
	</div> 
  </body>
</html>
