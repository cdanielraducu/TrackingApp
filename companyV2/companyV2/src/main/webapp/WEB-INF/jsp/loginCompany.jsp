<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<section class="b1">
    <h1 style="color:white">Registration here</h1>

    <form:form modelAttribute="loginCompany" cssStyle="color:white">
        <table>
            <tr>
                <td>
                    <spring:message code="email" />:
                </td>
                <td>
                    <form:input path="email"/>
                </td>
            </tr>
            <tr>
                <td>
                    <spring:message code="password" />:
                </td>
                <td>
                    <form:password path="password"/>
                </td>
            </tr>
        </table>
    </form:form>
</section>

</body>
</html>