<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp test</title>
</head>
<body>
<%
	int num1 = 10;
	int num2 = 20;
	int sum = num1 + num2 ;
%>
<h1>JSP에서 자바 사용하기</h1>
    <%= num1 %> + <%= num2 %> = <%= sum %>
</body>
</html>