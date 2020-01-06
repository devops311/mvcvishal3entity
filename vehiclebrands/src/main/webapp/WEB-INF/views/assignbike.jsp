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
<form action="/assignbikes" method="post">
<div class="form-group">
			<table>
				<tr align="center">
					<td>Bike</td>
					<td><select name="bikeName">
							<c:forEach var="b" items="${bike}">
								<option value="${b.bikeName}">${b.bikeName}</option>
							</c:forEach>
				</select>
				</td>
				</tr>
			</table>
			</div>
			<div class="form-group">
			<table>
				<tr align="center">
					<td>BRANDS</td>
					<td><select name="brandName">
							<c:forEach var="brand" items="${brand}">
								<option value="${brand.brandName}">${brand.brandName}</option>
							</c:forEach>
				</select>
				</td>
				</tr>
			</table>
			</div>
		
			<button type="submit" class="btn btn-primary">ASSIGN</button>
			</form>

</body>
</html>