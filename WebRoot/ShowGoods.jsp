<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'ShowGoods.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	 <link rel="stylesheet" href="css/lightbox.css">
	<link rel="stylesheet" type="text/css" href="css/ShowGoods.css">
	<script src="js/lightbox-plus-jquery.min.js"></script>
	<script type="text/javascript">
		function add(){
			var count = document.getElementById("count");
			var kucun= document.getElementById("kucun").innerHTML;
			var num=count.value;
			if((num<kucun)&&(num<5)){
				num++;
				count.value=num;}
		}
		function minus(){
			var count = document.getElementById("count");
			var num=count.value;
			if(num>1){
			num--;
			count.value=num;}
		}
		function f(){
		var kucun= document.getElementById("kucun").innerHTML;
		var count = document.getElementById("count");
		var addcar=document.getElementById("addcarbtn");
		var btn=document.getElementById("btn");
			var wellcome=document.getElementById("Wellcome");
			var login=document.getElementById("headBar_right1_log");
			
	  		if(wellcome.title!="null"){
	  			login.style.display="none";
	  			wellcome.style.display="block";
	  			
	  		}
		if(kucun==0)
			{
			count.value=0;
			btn.style.display="block";
			addcar.style.display="none";
			}
		if(document.getElementById("msg").value=="error"){
			alert("每人限购5台");
		}	
		}
		function remind()
		{
		 alert("到货提醒设置成功");
		}
		function addfavorites()
	    {    
	  	var wellcome=document.getElementById("Wellcome");
			
			
	  		if(wellcome.title=="null"){
	  			
	  				alert("请先登录");
	  			
	  		}
	  		else{
	        var url = 'addfavorites.action';
	        var params = {
	        SId:eval(document.getElementById('SId')).value,
	    };
	    $.post(url, params);
	  	alert("加入收藏夹成功");
	    }
	}
	    
	</script>
  </head>
  
  <body onload="f();">
  <div id="headBar">
    	<div id="headBar_Controler">
    		<div id="headBar_left">
    			<span id="pageTag"><a class="headBar_left_aLag" href="digo_mainPage.jsp">DiGo</a></span>
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
   
   	<div id="nav">
   		
   	</div>
   	<div id="body">
   	<% String s=(String)request.getAttribute("error"); %>
   	<input type="hidden" id="msg" value="<%= s %>" />
   	<s:iterator  value="list" var="list" status="list"> 
   		<div id="imgbox">
   		 <a  href="<s:property value="img" />" data-lightbox="img1"><img  id="img" src="<s:property value="img" />"></a>
   		</div>
   		<div id="page">

   			<s:form action="addcar" namespace="/" >
   				<input type="hidden" name="SId" id="SId" value="<s:property value="SId" />">
		    	<span id="s_name"><s:property value="SName" /></span><br>
		    	<span id="S_Details"><s:property value="SDetails" /></span><br>
		     	<span id="s_money"><s:property value="SMoney" />元</span><br>
		    	本店活动：暂无活动<br><br>
		    	数量:
		    	<input type="button" class="count_c" value="-" onclick="minus();">
		    	<input type="text" name="count" value="1" id="count"  readonly="readonly">
		    	<input type="button" class="count_c" value="+" onclick="add();">
		    	<span>每人限购5台</span><br><br>
		    	库存<span id="kucun"><s:property value="kucun" /></span>件<br><br>
		    	<s:submit name="addcar"   id="addcarbtn" method="addcar" value="加入购物车" theme = "simple" ></s:submit>
		    	<input type="button" id=addfavoritesbtn value="加入收藏夹"  onclick="addfavorites();"><br>
		    	<input type="button" id="btn" value="到货提醒" style="display: none;" onclick="remind();">
    		</s:form>
    		<span class="support">  <i class="iconfont"></i>  7天无理由退货</span>
    		<span class="support">  <i class="iconfont"></i>  15天质量问题换货 </span>
    		<span class="support">  <i class="iconfont"></i>  365天保修 </span>
   		</div>
   			</s:iterator> 
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
