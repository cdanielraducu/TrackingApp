<%--
  Created by IntelliJ IDEA.
  User: Andrei
  Date: 06-May-20
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration for users</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<section class="b1">
    <h1 style="color:white">Registration for users here</h1>

    <form:form modelAttribute="user" cssStyle="color:white">
        <table>
            <tr>
                <td>
                    <spring:message code="firstname" />:
                </td>
                <td>
                    <form:input path="firstname"/>
                </td>
            </tr>
            <tr>
                <td>
                    <spring:message code = "lastname" />:
                </td>
                <td>
                    <form:input path="lastname"/>
                </td>
            </tr>
            <tr>
                <td>
                    <spring:message code = "cnp" />:
                </td>
                <td>
                    <form:input path="cnp"/>
                </td>
            </tr>
            <tr>
                <td>
                    <spring:message code = "email" />:
                </td>
                <td>
                    <form:input path="email"/>
                </td>
            </tr>
            <tr>
                <td>
                    <spring:message code = "password" />:
                </td>
                <td>
                    <form:input path="password"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" >
                    <input type="submit" value="Add User">
                </td>
            </tr>
        </table>
    </form:form>
</section>

</body>
</html>
