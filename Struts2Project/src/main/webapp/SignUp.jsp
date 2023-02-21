<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign up</title>
<link rel="stylesheet" href="/Struts2App/css/entry.css">
</head>
<body>
<div class="center">
	<h1>Sign in</h1>
		<s:form action="SignUpAction" theme="simple">
			<div class="txt_field">
       			<s:textfield key="name"/>
      			<label>Name</label>
      		</div>
      		<div class="txt_field">
       			<s:textfield key="email"/>
      			<label>Email Id</label>
      		</div>
      		<div class="txt_field">
      			<s:textfield key="password"/>
      			<label>Password</label>
      		</div>
      		<s:submit value="Create New Account"/>
      	</s:form>
        <div class="signup_link"> Existing user: <a href="Login.jsp">Login</a></div>
    </div>
</body>
</html>