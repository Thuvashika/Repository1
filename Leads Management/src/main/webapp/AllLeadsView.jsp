<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="learn.model.*"%>
<%@page import="learn.control.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All leads</title>
<link rel="stylesheet" href="/Leads_Management/css/view.css">
<script src="jquery/jquery-3.6.3.js"></script>
<script src="js/AllLeadsView.js"> </script>
</head>
<body>
<div id="body">
<div class="myDiv">
    <h1 style="color:White;font-family:verdana;">ALL LEADS</h1>
    </div>
	<br>
	<h2 style="font-family:courier;font-size:200%;text-align:center;">List of all leads</h2>
	<hr style="width:50%;margin-right: auto;  
margin-left: auto;  ;size:8;width=90%">
                <%
				if(session.getAttribute("Id")==null){
					request.setAttribute("error","Don't have permission to view this page");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
				%>
				<div>
			<form action="logout" method="post">
			<input style="float:right" class=button type="submit" value="Log out">
			</form>
			<button class="button" onclick="window.location.href='/Leads_Management/LeadsView.jsp'" >My Leads</button>
			<div class="center">
			<label for="no"><b>Leads per page</b></label>
   			<input style="text-align:center" type="text" pattern="[0-9]{2}" value=5 onkeyup="pagination()" name="no" id="no" required>
   			</div>
			<br>
			<br>
			<select name="search" id="select">
  			<option value="name">Search for names:</option>
  			<option value="userid">Search for user Id:</option>
  			<option value="id">Search for id:</option>
    		<option value="email">Search for Email</option>
   			<option value="region">Search for Region</option>
    		<option value="contact">Search for Contact</option>
  			</select>
			<input type="text" id="myInput" onkeyup="searchFunction()" placeholder="Search..." title="Type in ">
			</div>
			<div class="fixTableHead">
			<table id="myTable">
				<thead>
					<tr>
						<th>USER ID</th>
						<th>ID</th>
						<th>Name</th>
						<th>Email</th>
						<th>Region</th>
						<th>Contact</th>
					</tr>
				</thead>
				<tbody id="tableBody"></tbody>
			</tbody>
			</table> 
			</div>
			<div class="center">
			<input type=button id="page1" style="align-items: center" class="button" onclick="previous()" value="<<">
			<input type=button id="page2" style="align-items: center" class="button" type="button" onclick="next()" value=">>">
			</div>
			</div>
			<div id="box" class = "alert">
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