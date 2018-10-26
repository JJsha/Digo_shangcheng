<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>My JSP 'payment.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/payment.css">
  	<script src="js/jquery-2.1.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/distpicker.data.js"></script>
    <script src="js/distpicker.js"></script>
    <script src="js/main.js"></script>

	<script type="text/javascript">
		function ol(){
			var count=document.getElementsByClassName("count");
			var sum=document.getElementsByClassName("sum");
			var summ=0;
			var sumc=0;
			var wellcome=document.getElementById("Wellcome");
			var login=document.getElementById("headBar_right1_log");
			
	  		if(wellcome.title!="null"){
	  			login.style.display="none";
	  			wellcome.style.display="block";
	  			
	  		}
			for(var i=0;i<count.length;i++)
			{
				summ=summ+parseInt(sum[i].innerHTML);
				sumc=sumc+parseInt(count[i].innerHTML);
			}
			document.getElementById("count").innerHTML=sumc;
			document.getElementById("money").innerHTML=summ;
		
		}
		
		$(function(){
			$("#confirm").click(function(){
				    var province1=document.getElementById("province1").value;
					var city1=document.getElementById("city1").value;
					var district1=document.getElementById("district1").value;
					var detailad=document.getElementById("detailad").value;
					var address=document.getElementById("address");
					address.value=province1+city1+district1+detailad;
				});
				$("#addpeople").click(function(){
				   $("#add").hide();
				   $("#newpeople").show();
				   
				});
					$("#confirm").click(function(){
				  		var shname= document.getElementById("shName").value;
				  		var address= document.getElementById("address").value;
				   		var phone= document.getElementById("phone").value;
				   		 var myreg=/^[1][3,4,5,6,7,8,9][0-9]{9}$/;      
				   		if(shname.length==0)
				   		{
				   			alert("收货人不能为空");
				   		}
				   		else if(shname.length>10){
				   				alert("收货人信息过长,不能大于10个字");
				   		}
				   		else if(address.length==0){
				   			alert("地址不能为空");
				   		}
				   		else if(phone.length==0){
				   			alert("联系电话不能为空");
				   		}
				   		else if (!myreg.test(phone)) {  
					          alert("请输入正确的联系电话")
					          } 
				   		else{
				   			$("form").submit();
				   		}
				   		
				});
				
			}); 
	</script>
  </head>
  
  <body onload="ol();">
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
    			<a class="headBar_right2_aTag" href="personaction">我的DIGO</a>
    			<span>|</span>
    			<a class="headBar_right2_aTag" href="caraction" >购物车</a>
    		</div>
    	</div>
    </div>
    <div id="main">
    <s:form action="payment">
    	<div id="people" >
    		<div id="add">
    		<input id="addpeople"type="button" value="新建收货人" >
    		</div>
    		<div id="newpeople" >
    			
    				收货人:<input id="shName" name="shName" type="text"><br>
    				 <div data-toggle="distpicker"> 地址:
                         <select class="form-control" id="province1"></select>
                         <select class="form-control" id="city1"></select>
                         <select class="form-control" id="district1"></select><br>
                         <input id="detailad" type="text" style="width:400px;">
               		  </div>
               		 联系电话:<input type="text" id="phone" name="phone">
               		<input type="hidden" id="address" name="address">
               		<br>
    			
    		</div>
    	</div>
    	<div id="goods">
    		<table id="goodstb">
    			<tr >
    				<th class="name">商品名</th>
    				<th>单价</th>
    				<th>数量</th>
    				<th>小计</th>
    			</tr>
    			<s:iterator  value="goods" > 
    			<input type="hidden" id="DId" name="DId" value="<s:property value="DId"/>">
    				<tr>
    				<td><div class="msg"><a href="getGoods?SId=<s:property value="SId"/>"><img  src="<s:property value="img"/>"></a>
    				<span><s:property value="SName" /></span></div></td>
    				<td><s:property value="SMoney" /></td>
    				<td class="count"><s:property value="count" /></td>
    				<td class="sum"><s:property value="Sum" /></td>
    				</tr>
    			</s:iterator>
    		</table>
    	</div>
    	<div id="sum">
    	<span>共</span>
    	<span id="count"></span>
    	<span>件商品</span>
    	
    	<span>合计:</span>
    	<span id="money"></span>
    	<span>元</span>
    	</div>
    	<div>
    	<div id="btn">
    	 <a href="" class="btn btn-line-gray J_goBack"  >返回购物车</a>
		 <input type="button"  class="btn btn-primary" id="confirm" value="确认订单">
    	 </div>
    	 </div>
    	 </s:form>
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
