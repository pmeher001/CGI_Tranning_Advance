<%@page import="java.util.Iterator"%>
<%@page import="com.pms.bean.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>All Product details in JSP</h2>
<table border="1">
<tr>
	<th>PId</th>
	<th>PName</th>
	<th>Price</th>
</tr>
<%
Object obj = request.getAttribute("listOfProducts");
List<Product> listOfProduct = (List<Product>)obj;
Iterator<Product> li = listOfProduct.iterator();
while(li.hasNext()){
	Product p = li.next();
	%>
		<tr>
			<td><%=p.getPid()%></td>
			<td><%=p.getPname()%></td>
			<td><%=p.getPrice()%></td>
		</tr>
	<% 
}
%>
<a href="index.jsp">Back</a>
</table>
</body>
</html>