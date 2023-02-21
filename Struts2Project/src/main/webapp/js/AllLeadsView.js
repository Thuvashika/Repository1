/**
 * 
 */
let page=0;
 function records(){
	var end1 = parseInt($('#no').val());
	if(isNaN(end1)){
		page=0;
		end1=5;
	}
	if(end1>15){
		end1=15;
		$("#body :input").prop("disabled", true);
	    $(':button').prop('disabled', true);
	    $("#close").attr("disabled", false);
		var box = $("#box");
		box.show();
        $("#close").click(function() { 
         box.hide();
         document.getElementById("no").value=end1;
         $("#body :input").prop("disabled", false);
	    $(':button').prop('disabled', false);
      });
	}
	var start=page*end1;
		$.ajax({
			type:'GET',
			url : 'allLeads',
			data : {
				start: start,
                no : end1
			},
			success : function(responseText) {
				
				var table="";
				var products = responseText.list;
				var len=products.length;
				if(len==0){
					page--;
				}
				else{
					for(var i = 0; i < len; i++) {
					table += "<tr><td>" +
					products[i].userId+"</td><td>" +
					products[i].id+"</td><td>" +
					products[i].name+
		    		"</td><td>" +
		    		products[i].email+
		    		"</td><td>" +
		    		products[i].region+
		    		"</td><td>" +
		    		products[i].contact+
		    		"</td></tr>";
				}
					document.getElementById("tableBody").innerHTML = table;
				}
		}	
	});
}
function next() {
	  page++;
	  records();
	}

	function previous() {
		if(page>0){
			 page--;
			 records();
		}
}
function searchFunction() {
	var col = $('#select').val();
	var str= $('#myInput').val();
	if(!str==""){
	$.ajax({
			type:'GET',
			url : 'searchAll',
			data : {
				word:str,
				column:col
			},
			success : function(responseText) {
				$("#pagin :input").prop("disabled", true);
				$("#page1").attr("disabled", true);
				$("#page2").attr("disabled", true);
				var table="";
				var products = responseText.list;
				var len=products.length;
				for(var i = 0; i <len; i++) {
					table += "<tr><td>" +
					products[i].userId+"</td><td>" +
					products[i].id+"</td><td>" +
					products[i].name+
			    	"</td><td>" +
			    	products[i].email+
			    	"</td><td>" +
			    	products[i].region+
			    	"</td><td>" +
			    	products[i].contact+
			    	"</td><td>";
				}
				document.getElementById("tableBody").innerHTML = table;
			}
		})
	}
	else{
		$("#pagin :input").prop("disabled", false);
		$("#page1").attr("disabled", false);
			$("#page2").attr("disabled", false);
			records();
	}
}