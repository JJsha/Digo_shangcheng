
function picChange(){  	
	
	var iphone=document.getElementById("iphonePic");
	var sumsung=document.getElementById("sumsungPic");
	var xiaomi=document.getElementById("xiaomiPic");
	var huawei=document.getElementById("huaweiPic");
	var meizu=document.getElementById("meizuPic");
	var wellcome=document.getElementById("Wellcome");
	var login=document.getElementById("login");
	
	  		if(wellcome.title!="null"){
	  			login.style.display="none";
	  			wellcome.style.display="block";
	  			
	  		}
  		document.getElementById("brandBar_iphone").onmouseover=function(){
  			document.getElementById("brandBar_iphone").style.backgroundColor="#F38256";
  			iphone.style.display="block";
  			sumsung.style.display="none";
  			xiaomi.style.display="none";
  			huawei.style.display="none";
  			meizu.style.display="none";
  		}
  		document.getElementById("brandBar_iphone").onmouseout=function(){
  			document.getElementById("brandBar_iphone").style.backgroundColor="";
  		}
  		document.getElementById("brandBar_sumsung").onmouseover=function(){
  			document.getElementById("brandBar_sumsung").style.backgroundColor="#F38256";
  			iphone.style.display="none";
  			sumsung.style.display="block";
  			xiaomi.style.display="none";
  			huawei.style.display="none";
  			meizu.style.display="none";
  		}
  		document.getElementById("brandBar_sumsung").onmouseout=function(){
  			document.getElementById("brandBar_sumsung").style.backgroundColor="";
  		}
  		document.getElementById("brandBar_xiaomi").onmouseover=function(){
  			document.getElementById("brandBar_xiaomi").style.backgroundColor="#F38256";
  			iphone.style.display="none";
  			sumsung.style.display="none";
  			xiaomi.style.display="block";
  			huawei.style.display="none";
  			meizu.style.display="none";
  		}
  		document.getElementById("brandBar_xiaomi").onmouseout=function(){
  			document.getElementById("brandBar_xiaomi").style.backgroundColor="";
  		}
  		document.getElementById("brandBar_huawei").onmouseover=function(){
  			document.getElementById("brandBar_huawei").style.backgroundColor="#F38256";
  			iphone.style.display="none";
  			sumsung.style.display="none";
  			xiaomi.style.display="none";
  			huawei.style.display="block";
  			meizu.style.display="none";
  		}
  		document.getElementById("brandBar_huawei").onmouseout=function(){
  			document.getElementById("brandBar_huawei").style.backgroundColor="";
  		}
  		document.getElementById("brandBar_meizu").onmouseover=function(){
  			document.getElementById("brandBar_meizu").style.backgroundColor="#F38256";
  			iphone.style.display="none";
  			sumsung.style.display="none";
  			xiaomi.style.display="none";
  			huawei.style.display="none";
  			meizu.style.display="block";
  		}
  		document.getElementById("brandBar_meizu").onmouseout=function(){
  			document.getElementById("brandBar_meizu").style.backgroundColor="";
  		}
  		
  		
}