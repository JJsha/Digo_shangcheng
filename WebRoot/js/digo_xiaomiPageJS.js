var i=0;
$(function(){
	opacity0_5Controler("#PicSlideControlerLeft","#PicSlideLast");
	opacity0_5Controler("#PicSlideControlerRight","#PicSlideNext");
	var wellcome=document.getElementById("Wellcome");
	var login=document.getElementById("headBar_right1_log");
			
	  		if(wellcome.title!="null"){
	  			login.style.display="none";
	  			wellcome.style.display="block";
	  			
	  		}
	var t;
	t=setInterval(picSlide, 4000);
	$("#PicSlideLast").click(function(){
		clearInterval(t);
		picHideControler();
		if(i===0){
			$(".picSlide_img").eq(i).fadeOut(500);
			i=3;
			$(".picSlide_img").eq(3).fadeIn(500);
			t=setInterval(picSlide, 4000);
		}else{
			$(".picSlide_img").eq(i).fadeOut(500);
			i=i-1;
			$(".picSlide_img").eq(i).fadeIn(500);
			t=setInterval(picSlide, 4000);
		}
	});
	$("#PicSlideNext").click(function(){
		clearInterval(t);
		picHideControler();
		if(i===3){
			$(".picSlide_img").eq(i).fadeOut(500);
			i=0;
			$(".picSlide_img").eq(0).fadeIn(500);
			t=setInterval(picSlide, 4000);
		}else{
			$(".picSlide_img").eq(i).fadeOut(500);
			i=i+1;
			$(".picSlide_img").eq(i).fadeIn(500);
			t=setInterval(picSlide, 4000);
		}
	});
	$("#dot1").click(function(){
		clearInterval(t);
		if(i===0){
			t=setInterval(picSlide, 4000);
		}else{
			$(".picSlide_img").eq(i).fadeOut(500);
			i=0;
			$(".picSlide_img").eq(0).fadeIn(500);
			t=setInterval(picSlide, 4000);
		}
	});
	$("#dot2").click(function(){
		clearInterval(t);
		if(i===1){
			t=setInterval(picSlide, 4000);
		}else{
			$(".picSlide_img").eq(i).fadeOut(500);
			i=1;
			$(".picSlide_img").eq(1).fadeIn(500);
			t=setInterval(picSlide, 4000);
		}
	});
	$("#dot3").click(function(){
		clearInterval(t);
		if(i===2){
			t=setInterval(picSlide, 4000);
		}else{
			$(".picSlide_img").eq(i).fadeOut(500);
			i=2;
			$(".picSlide_img").eq(2).fadeIn(500);
			t=setInterval(picSlide, 4000);
		}
	});
	$("#dot4").click(function(){
		clearInterval(t);
		if(i===3){
			t=setInterval(picSlide, 4000);
		}else{
			$(".picSlide_img").eq(i).fadeOut(500);
			i=3;
			$(".picSlide_img").eq(3).fadeIn(500);
			t=setInterval(picSlide, 4000);
		}
	});
});
function picHideControler(){
	if(i===0){
		$(".picSlide_img").eq(3).fadeOut(1);
		$(".picSlide_img").eq(2).fadeOut(1);
		$(".picSlide_img").eq(1).fadeOut(1);
	}else if(i===1){
		$(".picSlide_img").eq(0).fadeOut(1);
		$(".picSlide_img").eq(3).fadeOut(1);
		$(".picSlide_img").eq(2).fadeOut(1);
	}else if(i===2){
		$(".picSlide_img").eq(0).fadeOut(1);
		$(".picSlide_img").eq(3).fadeOut(1);
		$(".picSlide_img").eq(1).fadeOut(1);
	}else if(i===3){
		$(".picSlide_img").eq(0).fadeOut(1);
		$(".picSlide_img").eq(2).fadeOut(1);
		$(".picSlide_img").eq(1).fadeOut(1);
	}
}
function picSlide(){
	if(i===3){
		$(".picSlide_img").eq(0).css("z-index","99");
		$(".picSlide_img").eq(i).fadeOut(500);
		i=0;
		$(".picSlide_img").eq(0).fadeIn(700);
		$(".picSlide_img").eq(3).fadeIn(701);
		$(".picSlide_img").eq(2).fadeIn(701);
		$(".picSlide_img").eq(1).fadeIn(701);
	}else{
		$(".picSlide_img").eq(i).fadeOut(500);
		$(".picSlide_img").eq(i+1).fadeIn(500);
		if(i===2){
			$(".picSlide_img").eq(0).css("z-index","-99");
			$(".picSlide_img").eq(0).fadeIn(1);
		}
		i++;
	}	
}
function opacity0_5Controler (ID1,ID2){
	$(ID1).mouseover(function(){
		$(ID2).animate({
			opacity: 0.5
			},400);
	});$(ID1).mouseout(function(){
		$(ID2).animate({ 
			opacity: 0
			},400);
	});
}