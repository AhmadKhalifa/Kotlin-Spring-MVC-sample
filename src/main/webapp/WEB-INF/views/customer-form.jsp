<%--
  Created by IntelliJ IDEA.
  User: TKNZ8661
  Date: 23-Feb-20
  Time: 6:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer form</title>
</head>
<body>

<form:form action="process-form" modelAttribute="customer">
    First name*: <form:input path="firstName"/>
    <br>
    <br>
    Last name*: <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error"/>
    <br>
    <br>
    Course code*: <form:input path="courseCode"/>
    <form:errors path="courseCode" cssClass="error"/>
    <br>
    <br>
    <input type="submit">
</form:form>

</body>
</html>
