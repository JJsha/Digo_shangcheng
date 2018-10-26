<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
  <head>
  
<style type="text/css">
@import url("css/car.css");
@import url("css/foot.css");
</style>
 <script type="text/javascript" language="javascript" src="js/car.js"></script>
<script language="javascript"> 
function delcfm() { 
   if (!confirm("确认要删除？")) { 
      window.event.returnValue = false;
       }
        } 
</script> 

  </head>
  
  <body onload="f();" >
  
  
  
  
  
  
  
<div id="head" >
<ul id="ul1" class="li-head">
<li id="li1" class="li-head">我的购物车</li>
<li id="li3" class="li-head"><a href="<s:url action="personaction"/>" class="a1">个人信息</a></li>
<li class="li-head"><a href="<s:url action="caraction"/>" class="a1"  >购物车</a></li>
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
  
 
 
 <tr>
 <td style="width:2%"><input onclick="selectAll()" type="checkbox"   name="controlAll" style="controlAll" id="controlAll"/></td>
 <td style="width:8%">全选</td>
 <td style="width:35%">商品信息</td>
 <td style="width:10%">单价</td>
 <td style="width:15%">数量</td>
 <td style="width:10%">金额</td>
 <td style="width:10%">操作</td>
 <td></td>
 </tr>
  <s:iterator value="list" >
  <s:form theme="simple" action="deletecaraction">
 <tr id="<s:property value="UId" /><s:property value="SId" />" >
 <td><input onclick="selecta()" type="checkbox" name="selected" /></td>
 <td><img src="<s:property value="img" />" /></td>
 <td><s:property value="SDetails" /></td>
 <td>
  <%-- <input style="display:none" type="text" style="width:60px;" value="<s:property value="SMoney" />" style="border:none;" id="<s:property value="UId" /><s:property value="UId" />"  readonly />元 
   --%>
  <span><s:property value="SMoney" /></span>
  </td>
 
 <td>
 
 
 
 
 
 
 
 
 
 <input type="button" value="+" name="btn1" onclick="plus(<s:property value="UId" /><s:property value="SId" />)" />








<span ><s:property value="CCount"/></span>









<input type="button" value="-" name="btn2" onclick="minus(<s:property value="UId" /><s:property value="SId" />)" />







</td>
<td>

 <span></span>
 </td>

<td><s:submit value="删除" onclick="delcfm()" method="deletecar" theme="simple" /></td>
<td>

 <input type="text" name="SId" value="<s:property value="SId" />" style="display:none"  ></input>
 
 <span style="display:none"> <s:property value="SId" /></span>
 
 <span style="display:none"> <s:property value="UId" /></span>
 <span style="display:none"></span>
 </td>

 </tr>

 
 </s:form>
 
 </s:iterator>

 <s:form theme="simple" action="buyaction">
   <tr>
 <td colspan="4"></td>
 <td style="font-size:25px;">总价：</td>
 <td style="font-size:25px;">
 <span >0</span>
 <span style="display:none"></span>
 <input type="text" id="cuan1" name="cuan" value="" style="display:none"    ></input>
 <input type="text"  id="u1" name="u" value="" style="display:none"  ></input>
  <input type="text"  id="cuan2" name="cuan2" value="" style="display:none"   ></input>
 </td>
 
 <td style="font-size:25px;">
 <s:submit style="width:100%;height:150%;" value="立即购买" method="buy" theme="simple" />
 </td>
 </tr>
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
