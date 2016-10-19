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

    <style>
        .error{
            color: #ff0000;
        }
        .errorblock{
            color: #000;
            background-color:#ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body>

<form:form commandName="goal">
    <form:errors path="*" cssClass="errorblock" element="div"/>
    <table>
        <tr>
            <td>Enter minutes</td>
            <td><form:input path="minutes" cssErrorClass="error"/></td>
            <td><form:errors path="minutes" cssClass="error"/></td>
        </tr>
        <tr>
            <td colspan="3">
                <input type="submit" value="Enter goal minutes">
            </td>
        </tr>

    </table>
</form:form>


</body>
</html>
