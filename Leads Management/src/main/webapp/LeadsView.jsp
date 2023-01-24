<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="learn.model.*"%>
<%@page import="learn.control.*"%>
<%@page import="java.util.*"%>
<html>
<head>
<title>LEADS</title>

 <link rel="stylesheet" href="/Leads_Management/css/view.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
 <script src="js/leadsView.js"> </script>
</head>
<body>
	<div class="myDiv">
    <h1 style="color:White;font-family:verdana;">LEADS</h1>
    </div>
	<br>
	<h2 style="font-family:courier;font-size:200%;text-align:center;">List of leads</h2>
	<hr style="width:50%;margin-right: auto;  
margin-left: auto;  ;size:8;width=90%">
	<br>
			<div>
			<form action="logout" method="post">
			<input style="float:right" class=button type="submit" value="Log out">
			</form>
			<button class="button" onclick="openForm()" >Add New Lead</button>
			<button class="button" onclick="window.location.href ='/Leads_Management/AllLeadsView.jsp'" >All leads</button>
			<br>
			<br>
			<input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for names.." title="Type in a name">
			<input type="button" onclick="previous()" value="<<">
			<input type="button" onclick="next()" value=">>">
			<div class="form-popup" id="myForm">
			<form action="ViewControl" class="form-container">
    		<h1>Add new Lead</h1>
    		<label for="name"><b>Name</b></label>
   			<input type="text" 
   			pattern="[A-Za-z]{2,15}"  
   			placeholder="Enter Name" 
   			name="name" required
   			oninvalid="this.setCustomValidity('Only words with 2 to 15 alphabets are allowed')"
   			onchange="try{setCustomValidity('')}catch(e){}">
    		<label for="email"><b>Email</b></label>
   			<input type="email" placeholder="Enter Email" name="email" required>
    		<label for="region"><b>Region</b></label>
    		<input type="text" pattern="[A-Za-z]{2,15}" placeholder="Enter region" name="region" required
    		oninvalid="this.setCustomValidity('Only words with 2 to 15 alphabets are allowed')"
   			onchange="try{setCustomValidity('')}catch(e){}">
    		<label for="contact"><b>contact</b></label>
   			<input type="tel" pattern="[0-9]{10}" placeholder="Enter Phone no" name="contact" required
   			oninvalid="this.setCustomValidity('Enter correct phone number')"
   			onchange="try{setCustomValidity('')}catch(e){}">
    		<button type="submit" class="btn">Add lead</button>
    		<button type="button" class="btn cancel" onclick="closeForm()">Close</button>
    		</form>
    		</div>
			</div>
			<%
					 User UserObj=(User)session.getAttribute("obj");
					if(UserObj==null){
						session.setAttribute("error","Don't have permission to view this page");
						response.sendRedirect("login.jsp");
					}
					%>
			<div style="background: white;">
			<table id="myTable">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Email</th>
						<th>Region</th>
						<th>Contact</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
				<%
				LeadsControl obj=new LeadsControl();
				LinkedList<Lead> listOfLeads=obj.selectAllLeads();
				for(Lead ele:listOfLeads){
						%>
					<tr>
					<td><%=ele.getId()%></td>
        			<td> <%=ele.getName()%></td>
        			<td><%=ele.getEmail()%> </td>
       				<td> <%=ele.getRegion()%></td>
       			 	<td><%=ele.getContact()%> </td>
       			 	<td><button class="button" onclick= "openEditForm(this)" >Edit</button>
       			 	<button class="button" onclick= "deleteRow(this)" >Delete</button><div class="form-popup" id="deleteForm">
       			 		<form action="DeleteControl" class="form-container" method= "delete" >
       			 		<h1 style="text-align: center">Delete Lead</h1>
       			 		<h2>Lead Id:</h2>
       			 		<input class=button type="text" value=""  name="id" id=deleteRowId readonly>
       			 		<button type="submit" class="btn">Delete</button>
    					<button type="button" class="btn cancel" onclick="closeDeleteForm()">Close</button>
						</form>
						</div>
       			 		<div class="form-popup" id="newForm">
						<form action="EditControl" onclick="toggle()"  class="form-container">
    					<h1>Update Lead</h1>
    					<label for="id"><b>ID</b></label>
   						<input type="text" value=" " name="id" required id="ID">
    					<label for="name"><b>Name</b></label>
   						<input type="text" pattern="[A-Za-z]{2,15}" value="" name="name" required id="Name"
   						oninvalid="this.setCustomValidity('Only words with 2 to 15 alphabets are allowed')"
   			onchange="try{setCustomValidity('')}catch(e){}">
    					<label for="email"><b>Email</b></label>
   						<input type="email" name="email" required id="Email">
    					<label for="region"><b>Region</b></label>
    					<input type="text" pattern="[A-Za-z]{2,15}" name="region" required id="Region"
    					oninvalid="this.setCustomValidity('Only words with 2 to 15 alphabets are allowed')"
   			onchange="try{setCustomValidity('')}catch(e){}">
    					<label for="contact"><b>contact</b></label>
   						<input type="tel" pattern="[0-9]{10}" name="contact" required id="Contact"
   						oninvalid="this.setCustomValidity('Enter correct phone number')"
   			onchange="try{setCustomValidity('')}catch(e){}">
    					<button type="submit" class="btn">Update</button>
    					<button type="button" class="btn cancel" onclick="closeEditForm()">Close</button>
						</form>
    					</div></td>
    					<%       
	  	 				}
 				%>
      			 	</tr>
			</tbody>
			</table> 
			</div>
			<script>
	let len="<%= listOfLeads.size()%>";
	 var mat = new Array(len);
	 for (var i = 0; i < len; i++) {
	    mat[i] = new Array(5);
	 }   
	<%int len=listOfLeads.size();
	for (int i=0; i<len; i++) { %>
    mat[<%= i %>][0] = "<%= listOfLeads.get(i).getId() %>";
    mat[<%= i %>][1] = "<%= listOfLeads.get(i).getName() %>";
    mat[<%= i %>][2] = "<%= listOfLeads.get(i).getEmail() %>";
    mat[<%= i %>][3] = "<%= listOfLeads.get(i).getRegion() %>";
    mat[<%= i %>][4] = "<%= listOfLeads.get(i).getContact() %>";
<% } %>
$(document).ready(function(){
	const xhttp = new XMLHttpRequest();
	xhttp.onload = function() {
	  displayCD(start);
	}
});
let start=0;
let page=Math.floor(len/5)+1;
function displayCD(start) {
	let table="<tr><th>ID</th><th>Name</th><th>Email</th><th>Region</th><th>Contact</th></tr>";
	let newi=(start)*5;
	let end=newi+5;
	console.log(newi)
	if(end>len){
		end=len
		//console.log(end);
	}
	for (let i=newi; i < end; i++) { 
	    table += "<tr><td>" +
	    mat[i][0]+"</td><td>" +
	    mat[i][1]+
	    "</td><td>" +
	    mat[i][2]+
	    "</td><td>" +
	    mat[i][3]+
	    "</td><td>" +
	    mat[i][4]+
	    "</td><td>" ;
	  }
	document.getElementById("myTable").innerHTML = table;
}

function next() {
  if (start < page) {
	  start++;
      displayCD(start);
  }
}

function previous() {
  if (start >0) {
	  start--;
      displayCD(start);
  }
}
</script>
			
</body>
</html>