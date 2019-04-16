<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE type>
<html>
<head>
	<title>Student Registration form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	First Name :<form:input path="firstName"/>
	<br>
	<br>
	Last Name :<form:input path="lastName"/>
	<br>
	<br>
	Country :
	<%-- <form:select path="country">
		        <form:option value="Brazil" label="Brazil"></form:option>
				<form:option value="France" label="France"></form:option>
				<form:option value="Germany" label="Germany"></form:option>
				<form:option value="India" label="India"></form:option>
		
	</form:select> --%>
	
	<form:select path="country">
		        <form:options items="${student.countryOptions }"></form:options>
				
		
	</form:select>
	
	<br>
	<br>
	Favorite Language :
			Java<form:radiobutton path="favoriteLanguage" value="Java"/>
			C#<form:radiobutton path="favoriteLanguage" value="C#"/>
			PHP<form:radiobutton path="favoriteLanguage" value="PHP"/>
			Ruby<form:radiobutton path="favoriteLanguage" value="Ruby"/>
		
		<br>
		<br>
		
		
	Operating System : 	
	
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		Mac Os <form:checkbox path="operatingSystems" value="Mac Os"/>
		MS Window <form:checkbox path="operatingSystems" value="MS Window"/>
	<br>
	<br>
		
	<input type="submit" value="Submit"/  >
	
	</form:form>
</body>
</html>