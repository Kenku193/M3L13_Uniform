<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--1--%>



<c:forEach var="user" items="${requestScope.users}">

    Edit user: <a href="/user-servlet?id=${user.id}">${user.login}</a><br>

</c:forEach>

</body>
</html>
