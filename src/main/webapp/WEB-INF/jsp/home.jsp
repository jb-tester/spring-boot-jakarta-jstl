<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<fmt:setLocale value="en_US"/>
<c:set var="prTitle" value="${home_attr1}"/>
<c:set var="stylePath" value="${pageContext.request.contextPath}/styles" />
<html>
<head>
    <title>${prTitle}</title>
    <link href="${mypath}/style.css" rel="stylesheet" type="text/css">
</head>
<body>

<!-- c:url tests: -->
<c:url value="/mapping1" var="v1"/>
<a href="${v1}">view1</a>
<p><a href="<c:url value="/mapping2"/>"/>view2</a></p>


</body>
</html>
