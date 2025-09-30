<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h3>Student List</h3>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>GPA</th>
    </tr>
    
    <c:forEach items="${studentList}" var="student">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.gpa}</td>
        </tr>
    </c:forEach>
</table>
<br>
<a href="index.jsp">Back to Add Student</a>