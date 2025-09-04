<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>JSP Scripting tags</h2>
<%!int a=10,b=20,sum; %>
<%
//int a;
//int b;
sum = a+b;
out.println("sum of two number is "+sum);
out.println("<br/><font color=red> Sum of two number is "+sum+"</font>");
%>
<p>Sum of two number is <%=100+200 %></p>
<p>Sum of two number is <%=sum %></p>
<p><font color="green">Sum of <%=a %> and <%=b %> is <%=sum %></font></p>
</body>
</html>