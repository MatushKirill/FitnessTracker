<%--
  Created by IntelliJ IDEA.
  User: kirill
  Date: 30/09/16
  Time: 17:51
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add goal</title>
</head>
<body>

<form:form commandName="goal">
    <table>
        <tr>
            <td>Enter minutes</td>
            <td><form:input path="minutes"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Enter goal minutes">
            </td>
        </tr>

    </table>
</form:form>


</body>
</html>
