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
			<input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for names.." title="Type in a name">
			<br>
			<div style="background: white;">
			<table id="myTable">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Email</th>
						<th>Region</th>
						<th>Contact</th>
					</tr>
				</thead>
				<tbody>
				<%
					 User UserObj=(User)session.getAttribute("obj");
					if(UserObj==null){
						session.setAttribute("error","Don't have permission to view this page");
						response.sendRedirect("login.jsp");
					}
					else{
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
      			 		<%       
	  	 				}
					}
 				%>
			</tbody>
			</table> 
			</div>
</body>
</html>