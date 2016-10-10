<%--
  Created by IntelliJ IDEA.
  User: kirill
  Date: 10/10/16
  Time: 13:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <title>403</title>
</head>
<body>
<h1><sec:authentication property="name"/> you are not authority
</h1>
</body>
</html>
