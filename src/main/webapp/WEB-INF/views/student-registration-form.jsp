<%--
  Created by IntelliJ IDEA.
  User: TKNZ8661
  Date: 23-Feb-20
  Time: 1:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Hello world form</title>
</head>
<body>
<form:form action="registration-succeeded" modelAttribute="student" method="get">
    First name: <form:input path="firstName"/>
    <br><br>
    Last name: <form:input path="lastName"/>
    <br><br>
    Country:
    <form:select path="country">
<%--        <form:options items="${student.countries}"/>--%>
        <form:option value="Brazil" label="brazil"/>
        <form:option value="Egypt" label="egypt"/>
        <form:option value="Somalia" label="somalia"/>
    </form:select>
    <br><br>
    <tr>
        <td><form:label path="gender">gender :</form:label></td>
        <td>
            <form:radiobutton path="gender" value="male" label="Male"/>
            <form:radiobutton path="gender" value="female" label="Female"/>
        </td>
    </tr>
    <br><br>
    <tr>
        <td>Language:</td>
        <td>
            <form:radiobutton path="language" value="Arabic" label="Arabic"/>
            <form:radiobutton path="language" value="English" label="English"/>
            <form:radiobutton path="language" value="French" label="French"/>
            <form:radiobutton path="language" value="German" label="German"/>
        </td>
    </tr>
    <br><br>
    <tr>
        <td>Programming language:</td>
        <td>
            <form:checkbox path="programmingLanguage" value="Java" label="Java"/>
            <form:checkbox path="programmingLanguage" value="C++" label="C++"/>
            <form:checkbox path="programmingLanguage" value="Kotlin" label="Kotlin"/>
            <form:checkbox path="programmingLanguage" value="Ruby" label="Ruby"/>
        </td>
    </tr>
    <br><br>
    <input type="submit">
</form:form>
</body>
</html>
