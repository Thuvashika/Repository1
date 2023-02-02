<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="learn.model.*"%>
<%@page import="learn.control.*"%>
<%@page import="java.util.*"%>
<html>
<head>
<title>LEADS</title>

 <link rel="stylesheet" href="/Leads_Management/css/view.css">
 <script src="jquery/jquery-3.6.3.js"></script>
 <script src="js/leadsView.js"> </script>
</head>
<body>
<div id=body>
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
			<div class="center">
			<label for="no"><b>Leads per page</b></label>
   			<input style="text-align:center" type="text" pattern="[0-9]{2}" value=5 onkeyup="pagination()" name="no" id="no" required>
   			</div>
			<br>
			<br>
  			<select name="search" id="select">
  			<option value="name">Search for names:</option>
  			<option value="id">Search for id:</option>
    		<option value="email">Search for Email</option>
   			<option value="region">Search for Region</option>
    		<option value="contact">Search for Contact</option>
  			</select>
			<input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search..." title="Type in ">
			
			<div class="form-popup" id="myForm">
			<form action="javascript:addLead()" class="form-container">
    		<h1>Add new Lead</h1>
    		<label for="name"><b>Name</b></label>
   			<input id="addName" type="text" 
   			pattern="[A-Za-z]{2,15}"  
   			placeholder="Enter Name" 
   			name="name" required
   			oninvalid="this.setCustomValidity('Only words with 2 to 15 alphabets are allowed')"
   			onchange="try{setCustomValidity('')}catch(e){}">
    		<label for="email"><b>Email</b></label>
   			<input id="addEmail" type="email" placeholder="Enter Email" name="email" required>
    		<label for="region"><b>Region</b></label>
    		<input id="addRegion" type="text" pattern="[A-Za-z]{2,15}" placeholder="Enter region" name="region" required
    		oninvalid="this.setCustomValidity('Only words with 2 to 15 alphabets are allowed')"
   			onchange="try{setCustomValidity('')}catch(e){}">
    		<label for="contact"><b>contact</b></label>
   			<input id="addContact" type="tel" pattern="[0-9]{10}" placeholder="Enter Phone no" name="contact" required
   			oninvalid="this.setCustomValidity('Enter correct phone number')"
   			onchange="try{setCustomValidity('')}catch(e){}">
    		<button id="add" type="submit" class="btn">Add lead</button>
    		<button id="close1" type="button" class="btn cancel" onclick="closeForm()">Close</button>
    		</form>
    		</div>
    		</div>
			<%
					if(session.getAttribute("Id")==null){
						request.setAttribute("error","Don't have permission to view this page");
						request.getRequestDispatcher("login.jsp").forward(request, response);
					}
			%>
			<div class="fixTableHead">
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
				<tbody id="tableBody"></tbody>
			</table> 
			</div>
			<div class="center">
			<input type=button id="page1" style="align-items: center" class="button" onclick="previous()" value="<<">
			<input type=button id="page2" style="align-items: center" class="button" type="button" onclick="next()" value=">>">
			</div>
			<div class="form-popup" id="deleteForm">
			<form action="javascript:deleteLead()" class="form-container" method= "delete" >
       			 		<h1 style="text-align: center">Delete Lead</h1>
       			 		<h2>Lead Id:</h2>
       			 		<input  class=button type="text" value=""  name="id" id=deleteRowId readonly>
       			 		<button id="delete" type="submit" class="btn">Delete</button>
    					<button id="close3" type="button" class="btn cancel" onclick="closeDeleteForm()">Close</button>
						</form>
						</div>
       			 		<div class="form-popup" id="newForm">
						<form action="javascript:editLead()" class="form-container">
    					<h1>Update Lead</h1>
    					<label for="id"><b>ID</b></label>
   						<input type="text" value=" " name="id" required id="ID" readonly>
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
    					<button id="update" type="submit" class="btn">Update</button>
    					<button id="close2" type="button" class="btn cancel" onclick="closeEditForm()">Close</button>
						</form>  
						</div>
						<div id = "box" class="alert">
                        Leads per page must be less than 16
                        <center><button id = "close" class="button">OK</button></center>
                        </div>
						</div>
			<script>			
window.onload=function(){
	pagination();

}
</script>
			
</body>
</html>