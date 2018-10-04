<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processStudent" modelAttribute="student">
First Name: <form:input path="firstName"/>
<br><br>
Last Name:  <form:input path="lastName"/>
<br><br>
Country:    <form:select path="country">
            <form:options items= "${student.countryOptions}"/>
            </form:select>

<input type="submit" value="submit">
</form:form>
</body>
</html>