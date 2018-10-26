<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>Welcome to DiGo MI Special Selling Page!</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/digo_xiaomiPageCSS.css">
  	<script src="js/jquery-3.3.1.min.js"></script>
  	<script src="js/digo_xiaomiPageJS.js"></script>
  </head>
  
  <body>
    <div id="headBar">
    	<div id="headBar_Controler">
    		<div id="headBar_left">
    			<span id="pageTag">苹果专栏</span>
    			<span class="headBar_left_spanLag">|</span>
    			<a class="headBar_left_aLag" href="https://www.apple.com/cn/">苹果中国</a>
    			<span class="headBar_left_spanLag">|</span>
    			<a class="headBar_left_aLag" href="https://developer.apple.com/ios/">IOS</a>
    			<span class="headBar_left_spanLag">|</span>
    			<a class="headBar_left_aLag" href="https://www.apple.com/cn/music/">Music</a>
    			<span class="headBar_left_spanLag">|</span>
    			<a class="headBar_left_aLag" href="digo_mainPage.jsp">DIGO!</a>
    		</div>
    		<div id="headBar_right1_iphone">
    			<div id="headBar_right1_log">
    				<a class="headBar_right1_log" href="digo_Login.jsp">登陆</a>
    				<span class="headBar_left_spanLag">|</span>
    				<a class="headBar_right1_log" href="digo_Logup.jsp" >注册</a>
    				
    			</div>
    			<span id="Wellcome" style="display:none; color:white;" title="<%= session.getAttribute("userName")%>" >欢迎!<%= session.getAttribute("userName")%></span>
    		</div>
    		<div id="headBar_right2_iphone">
    			<a class="headBar_right2_aTag" href="<s:url action="personaction"/>">我的DIGO</a>
    			<span class="headBar_left_spanLag">|</span>
    			<a class="headBar_right2_aTag" href="<s:url action="caraction"/>" >购物车</a>
    		</div>
    	</div>
    </div>
    
    <div id="titleBar">
    	<div id="titleBar_controler">
    		<div id="miIcon">
    			<a id="miIcon_aTag" href="https://www.apple.com/cn/">
    				<img src="digoMainPage_pic/iPhoneIcon.png" alt="苹果中国" title="苹果中国">
    			</a>
    		</div>
    		
    		<div id="titleBar_middle">
    			
    		</div>
    		
    		<div id="searchBar">
    			<s:form action="search">
		    		<input id="searchText" type="text" name="SName">
		  			<s:submit id="searchTextBtn" value="搜索" method="searchgoods" theme = "simple"></s:submit>
		  		</s:form>
    		</div>
    	</div>
    </div>
    
    <div id="showProduct">
    	<div id="showProdust_controler">
	    	<div id="productList">
	    		<ul>
	    			<li id="li1" class=productList_li>
	    				<a  href="getGoods?SId=104"><font class="productList_li_font">iphone1&nbsp;&nbsp;&emsp;></font></a>
	    			</li>
	    			<li id="li2" class=productList_li>
	    				<a  href="getGoods?SId=104"><font class="productList_li_font">iphone2&nbsp;&nbsp;&emsp;></font></a>
	    			</li>
	    			<li id="li3" class=productList_li>
	    				<a  href="getGoods?SId=104"><font class="productList_li_font">iphone3&nbsp;&nbsp;&emsp;></font></a>
	    			</li>
	    			<li id="li4" class=productList_li>
	    				<a  href="getGoods?SId=104"><font class="productList_li_font">iphone4&nbsp;&nbsp;&emsp;></font></a>
	    			</li>
	    			<li id="li5" class=productList_li>
	    				<a  href="getGoods?SId=104"><font class="productList_li_font">iphone5&nbsp;&nbsp;&emsp;></font></a>
	    			</li>
	    			<li id="li6" class=productList_li>
	    				<a  href="getGoods?SId=104"><font class="productList_li_font">iphone6&nbsp;&nbsp;&emsp;></font></a>
	    			</li>
	    			<li id="li7" class=productList_li>
	    				<a  href="getGoods?SId=104"><font class="productList_li_font">iphone7&nbsp;&nbsp;&emsp;></font></a>
	    			</li>
	    			<li id="li8" class=productList_li>
	    				<a  href="getGoods?SId=104"><font class="productList_li_font">iphone8&nbsp;&nbsp;&emsp;></font></a>
	    			</li>
	    			<li id="li9" class=productList_li>
	    				<a  href="getGoods?SId=104"><font class="productList_li_font">iphone9&nbsp;&nbsp;&emsp;></font></a>
	    			</li>
	    			<li id="li10" class=productList_li>
	    				<a  href="getGoods?SId=104"><font class="productList_li_font">iphone10&nbsp;&nbsp;&emsp;></font></a>
	    			</li>
	    			<li id="li11" class=productList_li>
	    				<a  href="getGoods?SId=104"><font class="productList_li_font">iphone11&nbsp;&nbsp;&emsp;></font></a>
	    			</li>
	    		</ul>
	    	</div>
	    	
	    	<div id="productPicSlide">
	    		<div class="dot" id="dot1"></div>
	    		<div class="dot" id="dot2"></div>
	    		<div class="dot" id="dot3"></div>
	    		<div class="dot" id="dot4"></div>
	    		
	    		<div class="PicSlideControler" id="PicSlideControlerLeft">
	    			<div id="PicSlideLast">
	    			</div>
	    		</div>
	    		<div class="PicSlideControler" id="PicSlideControlerRight">
	    			<div id="PicSlideNext">
	    			</div>
	    		</div>
	    		
	    		<a class="productPicSlide_aTag" id="productPicSlide_aTag1" href="getGoods?SId=104">
	    			<img class="picSlide_img" id="img1" style="display: block;" src="digoMainPage_pic/iphoneX.jpg" alt="iPhoneX | hello，未来。" title="iPhoneX | hello，未来。">
	    		</a>
	    		<a class="productPicSlide_aTag" id="productPicSlide_aTag2" href="getGoods?SId=104">	
	    			<img class="picSlide_img" id="img2" style="display: block;" src="digoMainPage_pic/iphoneSe.jpg" alt="小米MIX2s|艺术特别版|向所有伟大的科技与艺术致敬" title="小米MIX2s|艺术特别版|向所有伟大的科技与艺术致敬">
	    		</a>
	    		<a class="productPicSlide_aTag" id="productPicSlide_aTag3" href="getGoods?SId=104">
	    			<img class="picSlide_img" id="img3" style="display: block;" src="digoMainPage_pic/iphone6&plus.jpg" alt="小米MIX2|全面屏|一面科技一面艺术|2599元起" title="小米MIX2|全面屏|一面科技一面艺术|2599元起">
	    		</a>
	    		<a class="productPicSlide_aTag" id="productPicSlide_aTag4" href="getGoods?SId=104">	
	    			<img class="picSlide_img" id="img4" style="display: block;" src="digoMainPage_pic/iphone5.jpg" alt="小米6X|前后两千万，拍人更美|前置2000万 “治愈系”自拍|后置2000万AI双摄|1599元起" title="小米6X|前后两千万，拍人更美|前置2000万 “治愈系”自拍|后置2000万AI双摄|1599元起">
	    		</a>
	    	</div>
    	</div>
    </div>
    
    
    
    <div id="footBackground">
	    <div id="foot">
			<div id="foot-top">
				<ul>
					<li><img  src="img/ico1.png"><span>&nbsp预约维修服务</span></li>
					<li><img  src="img/ico2.png"><span>&nbsp7天无理由退货</span></li>
					<li><img  src="img/ico3.png"><span>&nbsp15天免费换货</span></li>
					<li><img  src="img/ico4.png"><span>&nbsp满150元包邮</span></li>
					<li style="border-right: 1px solid white;"><img  src="img/ico5.png"><span>&nbsp0家售后网点</span></li>
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
	</div> 
  </body>
</html>
