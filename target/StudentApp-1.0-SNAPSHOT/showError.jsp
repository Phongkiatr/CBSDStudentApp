<%-- 
    Document   : showError
    Created on : Sep 30, 2025, 1:15:20 PM
    Author     : Phongkiatr
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
</head>
<body>
    <p style="color:red;">${requestScope.error}</p>
    <hr>
    <jsp:include page="studentList.jsp" />
</body>
</html>