<%--
  Created by IntelliJ IDEA.
  User: Andrei
  Date: 13-May-20
  Time: 13:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>Edit Employee</h1>
<form:form method="POST" action="/companyV2_war/editSave">
    <table >
        <tr>
            <td></td>
            <td><form:hidden  path="id" name = "id"/></td>
        </tr>
        <tr>
            <td>CNP : </td>
            <td><form:input path="cnp"  name ="cnp" /></td>
        </tr>
        <tr>
            <td>First Name : </td>
            <td><form:input path="firstname"  name ="firstname" /></td>
        </tr>
        <tr>
            <td>Last Name :</td>
            <td><form:input path="lastname"  name = "lastname"/></td>
        </tr>
        <tr>
            <td>Email :</td>
            <td><form:input path="email"  name = "email"/></td>
        </tr>
        <tr>
            <td></td>
            <td><form:hidden  path="password"  name = "password"/></td>
        </tr>

        <tr>
            <td> </td>
            <td><input type="submit" value="Save Changes" /></td>
        </tr>
    </table>
</form:form>

</body>
</html>

