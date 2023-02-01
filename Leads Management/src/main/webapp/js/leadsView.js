/**
 * 
 */
 let page=0;
 function pagination(){
	var end1 = parseInt($('#no').val());
	if(isNaN(end1)){
		page=0;
		end1=5;
	}
	if(end1>15){
		end1=15;
	}
	var start=page*end1;
		$.ajax({
			type:'GET',
			url : 'pagination',
			data : {
				start: start,
                end : end1
			},
			success : function(responseText) {
				
				var table='<table>';
				var products = $.parseJSON(responseText);
				var len=products.length;
				if(len==0){
					page--;
				}
				else{
					for(var i = 0; i < len; i++) {
						table += "<tr><td>" +
						products[i].id+"</td><td>" +
						products[i].name+
			    		"</td><td>" +
			    		products[i].email+
			    		"</td><td>" +
			    		products[i].region+
			    		"</td><td>" +
			    		products[i].contact+
			    		"</td><td><button class="+"'button'"+"onclick="+"'openEditForm(this)'"+">Edit</button> "+
			    		" <button id="+"'del'"+"class="+"'button'"+"onclick="+"'deleteRow(this)'"+">Delete</button></td></tr>";
					}
					table+='</table>';
					document.getElementById("tableBody").innerHTML = table;
				}
		}	
	});
}
function next() {
	  page++;
	  pagination();
	}

	function previous() {
		if(page>0){
			 page--;
			 pagination();
		}
}

 function myFunction() {
	var col = $('#select').val();
	var str= $('#myInput').val();
	if(!str==""){
	$.ajax({
			type:'GET',
			url : 'search',
			data : {
				word:str,
				column:col
			},
			success : function(responseText) {
				$("#page1").attr("disabled", true);
				$("#page2").attr("disabled", true);
				var table="";
				var products = $.parseJSON(responseText);
				var len=products.length;
				for(var i = 0; i < len; i++) {
					table += "<tr><td>" +
					products[i].id+"</td><td>" +
					products[i].name+
			    	"</td><td>" +
			    	products[i].email+
			    	"</td><td>" +
			    	products[i].region+
			    	"</td><td>" +
			    	products[i].contact+
			    	"</td><td><button class="+"'button'"+"onclick="+"'openEditForm(this)'"+">Edit</button> "+
			    	" <button class="+"'button'"+"onclick="+"'deleteRow(this)'"+">Delete</button></td></tr>";
				}
				document.getElementById("tableBody").innerHTML = table;
			}
		})
		}
		else{
			$("#page1").attr("disabled", false);
			$("#page2").attr("disabled", false);
			pagination();
		}
}			
function searchFunction() {
	var col = $('#select').val();
	var str= $('#myInput').val();
	if(!str==""){
	$.ajax({
			type:'GET',
			url : 'searchFromAll',
			data : {
				word:str,
				column:col
			},
			success : function(responseText) {
				var table="";
				var products = $.parseJSON(responseText);
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
		defaultPage();
	}
}
function defaultPage(){
	$.ajax({
		type:'GET',
		url :'allLeads',
		success : function(responseText) {
			
			var table="";
			var products = $.parseJSON(responseText);
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
function openForm() {
	$(':button').prop('disabled', true);
	$("#add").attr("disabled", false);
	$("#close1").attr("disabled", false);
  document.getElementById("myForm").style.display = "block";
}
function closeForm() {
	$(':button').prop('disabled', false);
  document.getElementById("myForm").style.display = "none";
}  
function openEditForm(td) {
	$(':button').prop('disabled', true);
	$("#update").attr("disabled", false);
	$("#close2").attr("disabled", false);
	let selectedRow=td.parentElement.parentElement;
	document.getElementById("ID").value=selectedRow.cells[0].innerHTML;
	document.getElementById("Name").value=selectedRow.cells[1].innerHTML;
	document.getElementById("Email").value=selectedRow.cells[2].innerHTML;
	document.getElementById("Region").value=selectedRow.cells[3].innerHTML;
	document.getElementById("Contact").value=selectedRow.cells[4].innerHTML;
	document.getElementById("newForm").style.display = "block";
}
function closeEditForm() {
	$(':button').prop('disabled', false);
  document.getElementById("newForm").style.display = "none";
}
function deleteRow(td) {
	$(':button').prop('disabled', true);
	$("#delete").attr("disabled", false);
	$("#close3").attr("disabled", false);
	let selectedRow=td.parentElement.parentElement;
	document.getElementById("deleteRowId").value=selectedRow.cells[0].innerHTML;
	document.getElementById("deleteForm").style.display = "block";
}
function closeDeleteForm() {
	$(':button').prop('disabled', false);
	  document.getElementById("deleteForm").style.display = "none";
}
function addLead(){
	var name=$('#addName').val();
	$('#addName').val('');
	var email=$('#addEmail').val();
	$('#addEmail').val('');
	var region=$('#addRegion').val();
	$('#addRegion').val('');
	var contact=$('#addContact').val();
	$('#addContact').val('');
	$.ajax({
			type:'POST',
			url : 'ViewControl',
			data : {
				name:name,
				email:email,
				region:region,
				contact:contact
			},
			success : function() {
				closeForm();
				pagination();
			}
	});
}
function editLead(){
	var id=parseInt($('#ID').val());
	var name=$('#Name').val();
	$('#editName').val('');
	var email=$('#Email').val();
	$('#editEmail').val('');
	var region=$('#Region').val();
	$('#editRegion').val('');
	var contact=$('#Contact').val();
	$('#editContact').val('');
	$.ajax({
			type:'POST',
			url : 'EditControl',
			data : {
				id:id,
				name:name,
				email:email,
				region:region,
				contact:contact
			},
			success : function() {
				closeEditForm();
				pagination();
			}
	});
}
	