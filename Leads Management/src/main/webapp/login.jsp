<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Log in</title>
<link rel="stylesheet" href="/Leads_Management/css/entry.css">
</head>
<body>
<div class="center">
      <h1>Login</h1>
      <form action= "login" method="post">
        <div class="txt_field">
          <input type="email" required name="email">
          <span></span>
          <label>Email Id</label>
        </div>
        <div class="txt_field">
          <input type="password" required name="password">
          <span></span>
          <label>Password</label>
        </div>
        <%String error= (String)request.getAttribute("error");
      if(request.getAttribute("error")!=null){
    	 %>
    	 <div id='error' style="color:red;text-align: center;">
    	 <%= error %>
    	 </div>
    	<%  
      }
      %> 
        <input type="submit" value="Login">
        <div class="signup_link">
          New User: <a href="signup.html"target="_self">Signup</a>
        </div>
        </form>
    </div>
</body>
</html>