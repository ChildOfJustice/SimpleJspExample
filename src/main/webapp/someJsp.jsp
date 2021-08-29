<%--
  Created by IntelliJ IDEA.
  User: sardor
  Date: 04.06.2021
  Time: 18:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String name = request.getParameter("name");
    %>
    here I am, <%= name%>


</body>
</html>
