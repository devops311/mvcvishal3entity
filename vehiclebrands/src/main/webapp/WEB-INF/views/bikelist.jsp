<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="form" >
<form action="/" method="get">
<table>
<tr>
<th>bikeId</th>
<th>bikeName</th>
<th>bikePrice</th>
</tr>
<c:forEach var="b" items="${bike}">
<tr>
<td>${b.bikeId}</td>
<td>${b.bikeName}</td>
<td>${b.bikePrice}</td>
</tr>
</c:forEach>
</table>
</form>
</div>

</body>
</html>