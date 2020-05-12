<%--
  Created by IntelliJ IDEA.
  User: Andrei
  Date: 12-May-20
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang = "en">

<head>
    <meta charset="UTF-8">
    <title>All the users</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<section class="b1">
    <h1>Users List</h1>
    <table border="2" width="70%" cellpadding="2">
        <tr><th>Id</th><th>First name</th><th>Last name</th><th>Email</th><th>Edit</th><th>Delete</th></tr>
        <c:forEach var="user" items="${list}">
            <tr>
                <td>${user.id}</td>
                <td>${user.firstname}</td>
                <td>${user.lastname}</td>
                <td>${user.email}</td>
                <td><a href="editemp/${user.id}">Edit</a></td>
                <td><a href="deleteemp/${user.id}">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="user">Add New Employee</a>
</section>
</body>
</html>
