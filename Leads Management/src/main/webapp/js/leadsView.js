/**
 * 
 */
 function myFunction() {
				var input, filter, table, tr, td, i, txtValue;
				input = document.getElementById("myInput");
				filter = input.value.toUpperCase();
				table = document.getElementById("myTable");
				tr = table.getElementsByTagName("tr");
				for (i = 0; i < tr.length; i++) {
					td = tr[i].getElementsByTagName("td")[1];
				    if (td) {
				    	txtValue = td.textContent || td.innerText;
				      	if (txtValue.toUpperCase().indexOf(filter) > -1) {
				        	tr[i].style.display = "";
				      	} 
				      	else {
				        	tr[i].style.display = "none";
			      		}
			    	}       
			  	}
			}

						
function openForm() {
  document.getElementById("myForm").style.display = "block";
}
function myFunction() {
	var input, filter, table, tr, td, i, txtValue;
	input = document.getElementById("myInput");
	filter = input.value.toUpperCase();
	table = document.getElementById("myTable");
	tr = table.getElementsByTagName("tr");
	for (i = 0; i < tr.length; i++) {
		td = tr[i].getElementsByTagName("td")[1];
	    if (td) {
	    	txtValue = td.textContent || td.innerText;
	      	if (txtValue.toUpperCase().indexOf(filter) > -1) {
	        	tr[i].style.display = "";
	      	} 
	      	else {
	        	tr[i].style.display = "none";
      		}
    	}       
  	}
}
function closeForm() {
  document.getElementById("myForm").style.display = "none";
}  
function openEditForm(td) {
	selectedRow=td.parentElement.parentElement;
	document.getElementById("ID").value=selectedRow.cells[0].innerHTML;
	document.getElementById("Name").value=selectedRow.cells[1].innerHTML;
	document.getElementById("Email").value=selectedRow.cells[2].innerHTML;
	document.getElementById("Region").value=selectedRow.cells[3].innerHTML;
	document.getElementById("Contact").value=selectedRow.cells[4].innerHTML;
	document.getElementById("newForm").style.display = "block";
}
function deleteRow(td) {
	selectedRow=td.parentElement.parentElement;
	document.getElementById("deleteRowId").value=selectedRow.cells[0].innerHTML;
	document.getElementById("deleteForm").style.display = "block";
}
function closeEditForm() {
  document.getElementById("newForm").style.display = "none";
}
function closeDeleteForm() {
	  document.getElementById("deleteForm").style.display = "none";
}
let start=0;
let len;
let cd;
function displayCD(end) {
  for (let i = start; i < end; i++) { 
    table += "<tr><td>" +
    cd[i].getElementsByTagName("")[0].childNodes[0].nodeValue +
    "</td><td>" +
    cd[i].getElementsByTagName("TITLE")[0].childNodes[0].nodeValue +
    "</td></tr>";
  }
  document.getElementById("myTable").innerHTML = table;
}

function next() {
  if (i < len-1) {
    i++;
    displayCD(i);
  }
}

function previous() {
  if (i > 0) {
    i--;
    displayCD(i);
  }
}
