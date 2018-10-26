<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>welcome to DIGO!</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/digo_mainPageCSS.css">
	<script src="js/digo_mainPageJS.js"></script>
  </head>
  
  <body onload="picChange()">
    <div id="headBar">
    	<ul id="headBar_left">
    		<li id="headBar_left_area" style="color: #8B8B8B;">中国大陆</li>
    		<li id="headBar_left_log" >
    			<div>
    				<div>
    					<div id="login">
    					<a id="headBar_left_log_login" href="digo_Login.jsp">请登陆</a>
    					&nbsp;<font style=" font-size: 12px;">或</font>&nbsp;
    					<a id="headBar_left_log_logup" href="digo_Logup.jsp" >免费注册</a>
    					</div>
    					<span id="Wellcome" style="display:none;" title="<%= session.getAttribute("userName")%>" >欢迎!<%= session.getAttribute("userName")%></span>
    				</div>
    			</div>
    		</li>
    	</ul>
    	<ul id="headbar_right">
    		<li id="headbar_right_digoCenter">
				<div>
					<a id="headbar_right_digoCenter_aTag" href="<s:url action="personaction"/>">我的digo中心</a>
				</div>
			</li>
    		<li id="headbar_right_shoppingCar">
    			<div>
					<a id="headbar_right_shoppingCar_aTag" href="<s:url action="caraction"/>">购物车</a>
				</div>
    		</li>
    		<li id="headbar_right_markPackage">
    			<div>
					<a id="headbar_right_markPackage_aTag" href="<s:url action="collectionaction"/>">收藏夹</a>
				</div>
    		</li>
    	</ul>
    </div>
  				<s:form action="search">
		    		<input id="searchText" type="text" name="SName">
		  			<s:submit id="searchTextBtn" value="搜索" method="searchgoods" theme = "simple"></s:submit>
		  		</s:form>
  	<hr style="margin-top: 100px;">
  	<div>
  		<ul id="brandBar" style="list-style-type: none;">
  			<li id="brandBar_iphone">
  				<a id="brandBar_iphone_aTag" href="digo_iphonePage.jsp">苹果</a>
  			</li>
  			<li id="brandBar_sumsung">
  				<a id="brandBar_sumsung_aTag" href="digo_sumsungPage.jsp">三星</a>
  			</li>
  			<li id="brandBar_xiaomi">
  				<a id="brandBar_xiaomi_aTag" href="digo_xiaomiPage.jsp">小米</a>
  			</li>
  			<li id="brandBar_huawei">
  				<a id="brandBar_huawei_aTag" href="digo_huaweiPage.jsp">华为</a>
  			</li>
  			<li id="brandBar_meizu">
  				<a id="brandBar_meizu_aTag" href="digo_meizuPage.jsp">魅族</a>
  			</li>
  		</ul>
  	</div>
  	<hr style="margin-top: 57px;">
  	<div id="iphonePic" style="display:block;"><a href="digo_iphonePage.jsp"><img id="iphonePic_img" src="pic_phone/iphone.jpg"></a></div>
  	<div id="sumsungPic" style="display:none;"><a href="digo_sumsungPage.jsp"><img id="sumsungPic_img" src="pic_phone/sumsung.jpg"></a></div>
  	<div id="xiaomiPic" style="display:none;"><a href="digo_xiaomiPage.jsp"><img id="xiaomiPic_img" src="pic_phone/xiaomi.jpg"></a></div>
  	<div id="huaweiPic" style="display:none;"><a href="digo_huaweiPage.jsp"><img id="huaweiPic_img" src="pic_phone/huawei.jpg"></a></div>
  	<div id="meizuPic" style="display:none;"><a href="digo_meizuPage.jsp"><img id="meizuPic_img" src="pic_phone/meizu.jpg"></a></div>
 	
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
