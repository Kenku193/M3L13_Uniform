<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.Date"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<p>
    2 + 2 = <%= 2 + 2 %>
</p>

<p>
    3 > 2 = <%= 3 > 2 %>
</p>

<p>
    3 > 2 = <%= "java".toUpperCase() %>
</p>

<p>
    Дата: <%= new Date() %>
</p>

<%--Scriptlet--%>

<p>
<%
    String[] cartoons = {"Tom", "Jerry"};
%>

<%= cartoons[0] %>

</p>

<%--JSP Declaration--%>

<%!
    int sum(int a, int b){
        return a+b;
    }
%>

<p>
    <%= sum(5,10) %>
</p>

</body>
</html>
