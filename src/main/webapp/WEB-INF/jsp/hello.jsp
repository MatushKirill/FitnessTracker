<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <title>Spring 4 MVC Hello World Example with Maven Eclipse</title>
</head>
<body>
<h2>Welcome to Fitness Tracker <sec:authentication property="name"/></h2>
<br>
<a href="addGoal">
    AddGoal >>
</a>
<br>
<a href="addMinutes">
    Add Minutes >>
</a>
<br>
<sec:authorize access="hasRole('ROLE_ADMIN')">
    <a href="addGoal">
        Edit Goal >>
    </a>
</sec:authorize>
<br>
<a href="j_spring_security_logout">
    Logout
</a>





</body>
</html>