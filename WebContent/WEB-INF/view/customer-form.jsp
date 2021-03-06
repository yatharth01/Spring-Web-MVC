
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>

<html>

<style>
.error{color:red}
</style>

<head>
<meta charset="ISO-8859-1">
<title>Customer Registration Form</title>
</head>
<body>
<form:form action="processform" modelAttribute="customer">
First Name: <form:input path="firstName"/>
<br><br>
Last Name(*): <form:input path="lastName"/>
              <form:errors path="lastName" cssClass="error"/>
<br><br>
Free Passes: <form:input path="freepasses"/>
             <form:errors path="freepasses" cssClass="error"></form:errors>

<br><br>

Postal Code: <form:input path="postalCode"/>
             <form:errors path="postalCode" cssClass="error"></form:errors>

<br><br>

Course Code: <form:input path="courseCode"/>
             <form:errors path="courseCode" cssClass="error"></form:errors>
<br><br>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>