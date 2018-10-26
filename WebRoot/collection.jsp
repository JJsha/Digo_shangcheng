<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
  <head>
  
<title>搜藏夹</title>
<style type="text/css">
@import url("css/favorites.css");
@import url("css/foot.css");
</style>
 <script type="text/javascript"  language="javascript" src="js/car.js"></script>
 <script language="javascript"> 
function delcfm() { 
   if (!confirm("确认要删除？")) { 
      window.event.returnValue = false;
       }
        } 
</script> 
  </head>
  
  <body>
  
  
  
  
  
  
  
<div id="head" >
<ul id="ul1">
<li id="li1" class="li-head">我的收藏夹</li>
<li id="li3" class="li-head"><a  href="<s:url action="personaction"/>" class="a1">个人信息</a></li>
<li class="li-head"><a href="<s:url action="caraction"/>" class="a1" >购物车</a></li>
<li class="li-head"><a href="<s:url action="collectionaction"/>" class="a1" >收藏夹</a></li>
<li class="li-head"><a href="digo_mainPage.jsp" class="a1">返回主页</a></li>
</ul>
</div>








<hr id="h1"/>
<div id="main">
<div>
 <div class="LMR" id="left"></div>
 <div class="LMR" id="middle">

 <ul>
 
  
  <s:iterator value="list" >
 <s:form action="deletecollectionaction" theme="simple">
 <li class="li2">
   <div class="img-controller-box">
        <div class="img-controller-img-box">
		  <a class="img-controller-img-link" title="title" href="">
		    <img src="<s:property value="img"/>" class="img-controller-img" />
		  </a>
		</div>
   </div>
   <div class="img-item-title">
     <a class="img-item-title-link"><s:property value="SName" /></a>
   </div>
   <div class="price-container">
     <div class="price">
	    <span class="span-price">¥</span>
		<strong class="span-strong"><s:property value="SMoney" /></strong>
		
		<s:submit value="删除" onclick="delcfm()" method="deletecollection" theme="simple" />
		 <input type="text" name="SId" value="<s:property value="SId" />" style="display:none"  ></input>
         <input type="text" name="UId" value="<s:property value="UId" />" style="display:none"  ></input>
 
	 </div>
   </div>
 </li>
 </s:form>
 </s:iterator>

 
 </ul>
 
 </div>

 
<div class="LMR" id="right"></div>
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
