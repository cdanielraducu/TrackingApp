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
<h1>Registration here</h1>

    <form:form modelAttribute="registration">
        <table>
            <tr>
                <td>
                    <spring:message code="name" />:
                </td>
                <td>
                    <form:input path="name"/>
                </td>
            </tr>
            <tr>
                <td>
                    <spring:message code = "cui" />:
                </td>
                <td>
                    <form:input path="cui"/>
                </td>
            </tr>

            <tr>
                <td colspan="2" >
                    <input type="submit" value="Add Registration">
                </td>
            </tr>
        </table>
    </form:form>
</section>

</body>
</html>