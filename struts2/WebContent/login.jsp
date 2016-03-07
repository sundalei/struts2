<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<s:fielderror/>

<form action="login.action">

username:<input type="text" name="username"><br>
password:<input type="password" name="password"><br>
age:<input type="text" name="age"><br>
date:<input type="text" name="date"><br>
<input type="submit" value="submit"><br>

</form>

</body>
</html>