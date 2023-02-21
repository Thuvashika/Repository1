<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix = "s" uri = "/struts-tags"%>
<html>
<head>
<meta charset="UTF-8">
<title>Log in</title>
<link href="<s:url value ="/css/entry.css"/>" rel="stylesheet">
</head>
<body>
<div class="center">
      <h1>Login</h1>
      <s:form action="LoginAction" theme="simple">
      <div style="color:Green">
      <s:actionmessage/>
      </div>
      <div class="txt_field">
      <s:textfield key="email"/>
      <label>Email Id</label>
      </div>
       <div style="color:red">
      <s:actionerror/>
      </div>
      <div class="txt_field">
      <s:textfield key="password"/>
      <label>Password</label>
      </div>
      <s:submit value="Login"/>
      </s:form>
        <div class="signup_link">
          New User: <a href="SignUp.jsp"target="_self">Signup</a>
        </div>
    </div>
</body>
</html>