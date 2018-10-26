
function f(){
	 var table = document.getElementById("t1");//获取第一个表格  
	 var u=document.getElementById("u1");
	     u.value=0;
	 
	
     for(var i=1;i<table.rows.length;i++){
    	 
           var child = table.getElementsByTagName("tr")[i];//获取行的第一个单元格 
           var count=child.getElementsByTagName("span")[0].innerHTML;
           var money=child.getElementsByTagName("span")[1].innerHTML;
           child.getElementsByTagName("span")[2].innerHTML=money*count;
           child.getElementsByTagName("span")[5].innerHTML=child.getElementsByTagName("span")[1].innerHTML;
           
           
           }
	
	 
     
}
	
	
	
function plus(s){	
	
	
	var checklist = document.getElementsByName ("selected"); 
	var table = document.getElementById("t1");//获取第一个表格  
	var c1=table.getElementsByTagName("tr")[table.rows.length-1];
	var span1=c1.getElementsByTagName("span")[0].innerHTML;
    var s1=0;
	var sum1=parseInt(s1);
	var txtcuan1=document.getElementById("cuan1");
	var tr=document.getElementById(s);
	var tdchild1=tr.getElementsByTagName("td")[3];
	var money=tdchild1.getElementsByTagName("span")[0].innerHTML;

	var tdchild2=tr.getElementsByTagName("td")[4];
	var count=tdchild2.getElementsByTagName("span")[0].innerHTML;
	var tdchild3=tr.getElementsByTagName("td")[5];
	var sum=tdchild3.getElementsByTagName("span")[0].innerHTML;
	 var sst="";
	 var txtcuan2=document.getElementById("cuan2");
    if(parseInt(count)<5){
    	
    	tdchild2.getElementsByTagName("span")[0].innerHTML=parseInt(count)+1;
    	
    	tdchild3.getElementsByTagName("span")[0].innerHTML=tdchild2.getElementsByTagName("span")[0].innerHTML*parseInt(money);
    	
    	for(var i=1;i<table.rows.length;i++){
       	 
            var child = table.getElementsByTagName("tr")[i];//获取行的第一个单元格 
            var count=child.getElementsByTagName("span")[0].innerHTML;
            var money=child.getElementsByTagName("span")[1].innerHTML;
            
            
            child.getElementsByTagName("span")[2].innerHTML=money*count;
            var total=child.getElementsByTagName("span")[2].innerHTML;
            child.getElementsByTagName("span")[5].innerHTML=child.getElementsByTagName("span")[1].innerHTML;
            sst=sst+" "+child.getElementsByTagName("span")[5].innerHTML;
            txtcuan2.value=sst;
            
            if(checklist[i-1].checked==1){
          	  sum1=parseInt(sum1)+parseInt(total); 
          	  
            }
            
            c1.getElementsByTagName("span")[0].innerHTML=sum1;
            
            }
    	
    }
    
    
    
    
    
    

	

}
function minus(s){
	var checklist = document.getElementsByName ("selected"); 
	var table = document.getElementById("t1");//获取第一个表格  
	var c1=table.getElementsByTagName("tr")[table.rows.length-1];
	var span1=c1.getElementsByTagName("span")[0].innerHTML;
	var s1=0;
	var sum1=parseInt(s1);
	var txtcuan1=document.getElementById("cuan1");
	var txtcuan2=document.getElementById("cuan2");
	var tr=document.getElementById(s);
	var tdchild1=tr.getElementsByTagName("td")[3];
	var money=tdchild1.getElementsByTagName("span")[0].innerHTML;
	var tdchild2=tr.getElementsByTagName("td")[4];
	var count=tdchild2.getElementsByTagName("span")[0].innerHTML;
	var tdchild3=tr.getElementsByTagName("td")[5];
	var sum=tdchild3.getElementsByTagName("span")[0].innerHTML;
	var sum=tdchild3.getElementsByTagName("span")[0].innerHTML;
	 var sst="";
	if(parseInt(count)!=1){
		tdchild2.getElementsByTagName("span")[0].innerHTML=parseInt(count)-1;
		tdchild3.getElementsByTagName("span")[0].innerHTML=tdchild2.getElementsByTagName("span")[0].innerHTML*parseInt(money);
		for(var i=1;i<table.rows.length;i++){
	       	 
            var child = table.getElementsByTagName("tr")[i];//获取行的第一个单元格 
            var count=child.getElementsByTagName("span")[0].innerHTML;
            var money=child.getElementsByTagName("span")[1].innerHTML;
            
            
            var total=child.getElementsByTagName("span")[2].innerHTML=money*count;
            child.getElementsByTagName("span")[5].innerHTML=child.getElementsByTagName("span")[1].innerHTML;
            sst=sst+" "+child.getElementsByTagName("span")[5].innerHTML;
            txtcuan2.value=sst;
            
            if(checklist[i-1].checked==1){
          	  sum1=parseInt(sum1)+parseInt(total); 
          	
            }
            
            c1.getElementsByTagName("span")[0].innerHTML=sum1;
            
            }	
	}
}

function selectAll(){  
 var checklist = document.getElementsByName ("selected"); 
 var table = document.getElementById("t1");//获取第一个表格  
 var c1=table.getElementsByTagName("tr")[table.rows.length-1];
 var span1=c1.getElementsByTagName("span")[0].innerHTML;
 var txtcuan1=document.getElementById("cuan1");
 var txtcuan2=document.getElementById("cuan2");
 var u=document.getElementById("u1");
 var st="";
 var sst="";
 var s=0;
 sum=parseInt(s);
   if(document.getElementById("controlAll").checked)  
   {  
   for(var i=0;i<checklist.length;i++)  
   {  
      checklist[i].checked = 1;  
        var child = table.getElementsByTagName("tr")[i+1];//获取行的第一个单元格 
        var count=child.getElementsByTagName("span")[0].innerHTML;
        var money=child.getElementsByTagName("span")[1].innerHTML;
        var total=child.getElementsByTagName("span")[2].innerHTML=money*count;
        sum=sum+total; 
        
        c1.getElementsByTagName("span")[0].innerHTML=sum;
        st=st+child.getElementsByTagName("span")[3].innerHTML;
        c1.getElementsByTagName("span")[1].innerHTML=st;
        txtcuan1.value=c1.getElementsByTagName("span")[1].innerHTML;
        sst=sst+" "+child.getElementsByTagName("span")[5].innerHTML;
        txtcuan2.value=sst;
        u.value=child.getElementsByTagName("span")[4].innerHTML;
   } 
   
 }else{  
  for(var j=0;j<checklist.length;j++)  
  {  
     checklist[j].checked = 0; 
     c1.getElementsByTagName("span")[0].innerHTML=0;
     u.value=0;
     txtcuan1.value="";
  }  
 }
}






function selecta(){

	var checklist = document.getElementsByName ("selected"); 
	var table = document.getElementById("t1");//获取第一个表格  
	var c1=table.getElementsByTagName("tr")[table.rows.length-1];
	var span1=c1.getElementsByTagName("span")[0].innerHTML;
	var txtcuan1=document.getElementById("cuan1");
	var txtcuan2=document.getElementById("cuan2");
	var s=0;
	var u=document.getElementById("u1");
	sum=parseInt(s);
	var st="";
	 var sst="";
	
for(var x=0;x<checklist.length;x++){
 
	 if(checklist[x].checked==0){
	   document.getElementById("controlAll").checked=0;
	 break;
	 }
	 else{
	 if(x==checklist.length-1){
		 
	     document.getElementById("controlAll").checked=1;  
	 }
	 
	 }

}  


   
     
     for(var i=1;i<table.rows.length;i++){
    	
         var child = table.getElementsByTagName("tr")[i];//获取行的第一个单元格 
         var count=child.getElementsByTagName("span")[0].innerHTML;
         var money=child.getElementsByTagName("span")[1].innerHTML;
         
         
         var total=child.getElementsByTagName("span")[2].innerHTML=money*count;
       
        
        
         var tt=child.getElementsByTagName("span")[3].innerHTML;
         
         
         if(checklist[i-1].checked==1){
       	  sum=sum+total; 
       	 
       	  st=st+child.getElementsByTagName("span")[3].innerHTML;
       	 sst=sst+" "+child.getElementsByTagName("span")[5].innerHTML;
         }
         c1.getElementsByTagName("span")[0].innerHTML=sum;
         c1.getElementsByTagName("span")[1].innerHTML=st;
        txtcuan1.value=st;
        txtcuan2.value=sst;
      
         u.value=child.getElementsByTagName("span")[4].innerHTML;
         
         for(var y=1;y<table.rows.length;y++){
        		
        	 if(checklist[y-1].checked==0){
        		
        		  if(checklist[table.rows.length-3].checked==0)
        			  {

        			  u.value=0;
        			  }
        	 }else{
         
        		break;
        	 }
        }

         }
    
     
  


}
