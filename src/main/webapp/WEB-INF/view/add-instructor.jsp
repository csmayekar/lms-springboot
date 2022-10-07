<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Instructor</title>
</head>
<body>
	<form:form method="POST" action="submit-instructor" modelAttribute="trainer">
		<label for="trainerName">Trainer Name</label>
		<form:input path="trainerName"/>
		
		<label for="trainerExperience">Trainer Experience</label>
		<form:input path="trainerExperience"/>

		<label for="trainerAddress">Trainer Address</label>
		<form:input path="trainerAddress"/>
		
		<input type="submit" value="submit">
	</form:form>
</body>
</html>