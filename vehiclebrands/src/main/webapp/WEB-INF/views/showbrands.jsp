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
<form action="/total" method="post">
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
			<button type="submit" class="btn btn-primary">submit</button>
			</form>
			

</body>
</html>