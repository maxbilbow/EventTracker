<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Attendee Page</title>
  <style type="text/css" src="css/main.css" />

</head>
<body>

<a href="?language=en">
  English
</a>
<a href="?language=es">
  Spanish
</a>
<a href="?language=pi">
  Pirate
</a>

<form:form commandName="candidate">
  <form:errors path="*" cssClass="errorblock" element="div"/>
  <label for="textinput1"><spring:message code="candidate.name" />:</label>
  <form:input path="name" cssErrorClass="error"/>
  <form:errors path="name" cssClass="error" />
  <br>
  <label for="textinput2"><spring:message code="candidate.party"/>:</label>
  <form:input path="party" cssErrorClass="error"/>
  <form:errors path="party" cssClass="error" />
  <br>
  <input type="submit" class="btn" value="Enter Candidate" />
</form:form>
</body>
</html>