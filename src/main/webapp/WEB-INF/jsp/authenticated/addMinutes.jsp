<%@ page import="kirill.model.Goal" %><%--
  Created by IntelliJ IDEA.
  UserDetails: kirill
  Date: 30/09/16
  Time: 12:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>

    <title>Title</title>
    <script type="text/javascript" src="/jquery/jquery-3.1.1.js"></script>
    <script type="text/javascript">
        $(document).ready(
            function  () {
                $.getJSON('<spring:url value="activities"/>',{
                    ajax: 'true'
                },function(data){
                    var html ='<option value ="">--Please select one--</option>';
                    var len =data.length;
                    for (var i=0;i<len;i++){
                        html+='<option value="'+data[i].desc+'">'+data[i].desc+'</option>';
                    }
                    html+='</option>';
                    $('#activities').html(html);
                });

        });
    </script>
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
<body>
<h1>Second page</h1>
Language:   <a href="?language=en"> English</a> | <a href="?language=es">Spanish</a>

<form:form commandName="exercise">

    <form:errors path="*" cssClass="errorBlock" element="div"/>
    <table>
        <tr>
            <td><spring:message code="Exercise.text"/> </td>
            <td><form:input path="minutes"/></td>
            <td><form:select id="activities" path="activity" /></td>
            <td><form:errors path="activity" cssClass="error"/> </td>
        </tr>
        <tr>
            <td colspan="4">
                <input type="submit" value= "enter exercise">
            </td>

        </tr>
    </table>

</form:form>
</body>
</html>
