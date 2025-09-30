<%-- 
    Document   : showResult
    Created on : Sep 30, 2025, 1:15:46 PM
    Author     : Phongkiatr
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
    <p>
        Id: ${requestScope.student.id}<br>
        Name: ${requestScope.student.name}<br>
        Gpa: ${requestScope.student.gpa}<br>
        <b>is added</b>
    </p>
    <hr>
    <jsp:include page="studentList.jsp" />
</body>
</html>