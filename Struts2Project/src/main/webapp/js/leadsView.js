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
			url : 'records',
			data : {
				start: start,
                no : end1
			},
			success : function(responseText) {
				var table='';
				$.each(responseText.list, function() {
				});
				var products = responseText.list;
				var len=products.length;
				if(len==0){
					page--;
					if(page<0){
						page=0;
					}
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

 function myFunction() {
	setTimeout(function() {
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
				$("#pagin :input").prop("disabled", true);
				$("#page1").attr("disabled", true);
				$("#page2").attr("disabled", true);
				var table="";
				var products = responseText.list;
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
			$("#pagin :input").prop("disabled", false);
			$("#page1").attr("disabled", false);
			$("#page2").attr("disabled", false);
			records();
		}
		}, 1000);
}			
function openForm() {
	$("#body :input").prop("disabled", true);
	$(':button').prop('disabled', true);
	$("#myForm :input").prop("disabled", false);
	$("#close1").attr("disabled", false);
	$("#add").attr("disabled", false);
  document.getElementById("myForm").style.display = "block";
}
function closeForm() {
	$("#body :input").prop("disabled", false);
	$(':button').prop('disabled', false);
  document.getElementById("myForm").style.display = "none";
}  
function openEditForm(td) {
	$("#body :input").prop("disabled", true);
	$(':button').prop('disabled', true);
	$("#newForm :input").prop("disabled", false);
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
	$("#body :input").prop("disabled", false);
	$(':button').prop('disabled', false);
  document.getElementById("newForm").style.display = "none";
}
function deleteRow(td) {
	$("#body :input").prop("disabled", true);
	$(':button').prop('disabled', true);
	$("#delete").attr("disabled", false);
	$("#close3").attr("disabled", false);
	let selectedRow=td.parentElement.parentElement;
	document.getElementById("deleteRowId").value=selectedRow.cells[0].innerHTML;
	document.getElementById("deleteForm").style.display = "block";
}
function closeDeleteForm() {
	$("#body :input").prop("disabled", false);
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
			url : 'add',
			data : {
				name:name,
				email:email,
				region:region,
				contact:contact
			},
			success : function() {
				closeForm();
				records();
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
			url : 'edit',
			data : {
				id:id,
				name:name,
				email:email,
				region:region,
				contact:contact
			},
			success : function() {
				closeEditForm();
				records();
			}
	});
}
function deleteLead(){
	var id=parseInt($('#deleteRowId').val());
	$.ajax({
			type:'POST',
			url : 'delete',
			data : {
				id:id,
			},
			success : function() {
				closeDeleteForm();
				records();
			}
	});
}
	