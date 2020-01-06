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
<form action="/assigndealerTobrand" method="post">
<div class="form-group">
			<table>
				<tr align="center">
					<td>DEALER</td>
					<td><select name="dealerName">
							<c:forEach var="deal" items="${dealer}">
								<option value="${deal.dealerName}">${deal.dealerName}</option>
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