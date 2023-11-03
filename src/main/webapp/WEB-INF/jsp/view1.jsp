<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: irina
  Date: 04.12.2020
  Time: 23:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>view1</title>
</head>
<body>
<form:form id="form" method="post" modelAttribute="userMessage">
    <p>Hello ${userName}</p>
    <c:if test="true">
        <form:input path="messageFromUser"/>
    </c:if>
    <c:if test="false">
        <form:input path="messageFromUser" readonly="true"/>
    </c:if>
    <form:errors path="messageFromUser" cssClass="errorMessage" element="div"/>

    <p>Provided message: ${message}</p>

    <button type="submit" class="btn">Submit</button>

</form:form>

</body>
</html>
