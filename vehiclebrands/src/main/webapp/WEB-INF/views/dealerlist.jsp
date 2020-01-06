<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <%@ page errorPage="error.jsp" %>  
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/showallbikes" method="post">
<div class="form-group" align="center">
				<label style="color: orangered" for="">dealer name</label> <input
					type="text" class="form-control" id="dealerName" name="dealerName"
					placeholder="Enter tech dealer name">
			</div>
			<button type="submit" class="btn btn-primary">submit</button>
			</form>

</body>
</html>
