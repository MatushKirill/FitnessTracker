<%--
  Created by IntelliJ IDEA.
  User: kirill
  Date: 30/09/16
  Time: 12:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Second page</h1>
<form:form commandName="exercise">
    <table>
        <tr>
            <td>Minutes exercise for today:</td>
            <td><form:input path="minutes"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" aria-live="enter exercise">
            </td>

        </tr>
    </table>

</form:form>
</body>
</html>
