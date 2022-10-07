<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Instructor_Home</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
	<table class="table">
		<thead class="table-dark">
		<tr >
			<th>Name</th>
			<th>Experience</th>
			<th>Address</th>
			</tr>
		</thead>
		<tbody>
			
			<c:forEach var="trainer" items="${trainers}">
			<tr>
				<td>${trainer.trainerName}</td>
				<td>${trainer.trainerExperience}</td>
				<td>${trainer.trainerAddress}</td>
			</tr>
				<br />
			</c:forEach>
		</tbody>
	</table>
</body>
</html>