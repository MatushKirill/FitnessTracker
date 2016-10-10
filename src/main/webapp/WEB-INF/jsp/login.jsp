<%--
  Created by IntelliJ IDEA.
  User: kirill
  Date: 07/10/16
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Fitness tracker custom login</title>
    <style>
        .error{
            color:#ff0000;
        }
        .errorBlock{
            color: #000;
            background-color:#ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body onload='document.f.j_username.focus();'>
    <h3>Fitness tracker custom login page</h3>
    <c:if test="${not empty error}">
        <div class="errorBlock">
            Your login was unsuccessful.<br>
            Caused:${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
        </div>
    </c:if>

    <form action="j_spring_security_check" name="f" method="post">
        <table>
            <tr>
                <td>User:</td>
                <td><input type="text" name="j_username" value=""></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" name="j_password"></td>
            </tr>
            <tr>
                <td><input type="submit" name="Submit" value="Enter"></td>
            </tr>
            <tr>
                <td><a href="registration">registration</a></td>
            </tr>


        </table>
        <input type="hidden" name="${_csrf.parameterName}"
               value="${_csrf.token}" />

    </form>

</body>
</html>
