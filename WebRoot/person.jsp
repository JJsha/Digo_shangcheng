<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
  <head>
   
<title>个人信息</title>
<style type="text/css">
@import url("css/person.css");
@import url("css/foot.css");
</style>

 <script type="text/javascript">
        function CheckText()
        {
           var psw1=document.getElementById("password");
           var psw2=document.getElementById("repassword");
           if(psw1.value==psw2.value){
           
           return true;
           }else{
           alert("两次输入的密码必须一样");
           psw1.value="";
           psw2.value="";
           return false;
           }
        }
    </script>

  </head>
  <body>
    
    
    
    
<div id="head" >
<ul id="ul1" class="li-head">
<li id="li1" class="li-head">个人的信息</li>
<li id="li3" class="li-head"><a href="<s:url action="personaction"/>" class="a1">个人信息</a></li>
<li class="li-head"><a href="<s:url action="caraction"/>" class="a1">购物车</a></li>
<li class="li-head"><a href="<s:url action="collectionaction"/>" class="a1">收藏夹</a></li>
<li class="li-head"><a href="digo_mainPage.jsp" class="a1">返回主页</a></li>

</ul>
</div>








<hr id="h1"/>
<div id="main">
<div>
 <div class="LMR" id="left"></div>
 <div class="LMR" id="middle">
 <table id="t1">

 <s:iterator value="list" >
  <s:form theme="simple">
    <font size="5">用户名：</font><br>
	<input type="text" value="<s:property value="UName" />" disabled /><br>
	<font size="5">性别：</font><br>
	<input type="text" value="<s:property value="sex" />" disabled /><br>
	<font size="5">邮箱：</font><br>
	<input type="text" value="<s:property value="email" />" disabled /><br>
	<font size="5">电话：</font><br>
	<input type="text" value="<s:property value="phone" />" disabled /><br>
	  </s:form>
	 </s:iterator>
	
	  <br/>
	 <s:form action="personupdateaction" theme="simple" >
    <font size="5">修改密码：</font><br>
	输&nbsp;入&nbsp;新&nbsp;密&nbsp;码：
	<input type="password" id="password" name="password"   ></input>
 <br/>
	再次输入新密码：
	<input type="password" id="repassword" name="repassword"   ></input>
	<br/>
	<s:submit  style="width:50px;height:40px;left:20%" value="修改" onclick="return CheckText()" method="update" />
   </s:form>
 
 </table>
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
