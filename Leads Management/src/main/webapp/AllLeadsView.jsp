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
<script src="js/leadsView.js"> </script>
</head>
<body>
<div class="myDiv">
    <h1 style="color:White;font-family:verdana;">ALL LEADS</h1>
    </div>
	<br>
	<h2 style="font-family:courier;font-size:200%;text-align:center;">List of all leads</h2>
	<hr style="width:50%;margin-right: auto;  
margin-left: auto;  ;size:8;width=90%">
			<form action="logout" method="post">
			<input style="float:right" class=button type="submit" value="Log out">
			</form>
			<button class="button" onclick="window.location.href='/Leads_Management/LeadsView.jsp'" >My Leads</button>
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
			<br>
			<div style="background: white;">
			<table id="myTable">
				<thead style="background:#2691d9;">
					<tr style="color:White">
						<th>USER ID</th>
						<th>ID</th>
						<th>Name</th>
						<th>Email</th>
						<th>Region</th>
						<th>Contact</th>
					</tr>
				</thead>
				<tbody id="tableBody"></tbody>
				<%
				if(session.getAttribute("Id")==null){
					request.setAttribute("error","Don't have permission to view this page");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
				%>
			</tbody>
			</table> 
			</div>
</body>
<script>
window.onload=function(){
	defaultPage();
}
</script>
</html>