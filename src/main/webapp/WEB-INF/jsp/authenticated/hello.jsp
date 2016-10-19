<%@ page import="kirill.dto.UserDetails" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
<head>
    <style>
        ul {
            list-style-type: none;
            width: 100%;
            margin: 0;
            padding: 0;
            overflow: hidden;
            background: #76b852; /* fallback for old browsers */
            background: -webkit-linear-gradient(right, #76b852, #8DC26F);
            background: -moz-linear-gradient(right, #76b852, #8DC26F);
            background: -o-linear-gradient(right, #76b852, #8DC26F);
            background: linear-gradient(to left, #76b852, #8DC26F);
            font-family: "Roboto", sans-serif;
            -webkit-font-smoothing: antialiased;
            -moz-osx-font-smoothing: grayscale;
        }

        li {
            float: left;
        }

        li a {
            display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }

        li a:hover:not(.active) {
            background-color: #4d4d4d;
        }

        .active {
            background-color: #4d4d4d;
        }

        img{
            height: 150px;
            width: 140px;
            /*padding: 10px;*/
            /*margin:10px;*/
        }
        body{
            background-color: #f2f2f2;
        }
        #panel, #flip {
            padding: 5px;
            width: 130px;
            text-align: left;
            background-color: #8DC26F;
            /*border: solid 1px #c3c3c3;*/
        }

        #panel {

            display: none;
        }
        body{
            background: #FFFFFF; /* fallback for old browsers */

            font-family: "Roboto", sans-serif;
            -webkit-font-smoothing: antialiased;
            -moz-osx-font-smoothing: grayscale;
        }
    </style>
    <script type="text/javascript" src="/jquery/jquery-3.1.1.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#imgChang").click(function () {
                document.getElementById("newavatar").src = document.getElementById("input-file").value;
            })
        });
        $(document).ready(function(){
            $("#flip").click(function(){
                $("#panel").slideToggle("slow");
            });
        });
    </script>
</head>
<body>

<div class="top">
<ul>
    <li><a href="hello">Home</a></li>
    <li><a href="addMinutes">Exercise</a></li>
    <li><a href="#contact">Contacts</a></li>
    <li><a href="#news">About</a></li>
    <li class="active" style="float:right"><a href="j_spring_security_logout">
        Logout
    </a></li>
    <li style="float: right"><a><sec:authentication property="name"/></a></li>

</ul>
</div>


<h2>Welcome to Fitness Tracker <sec:authentication property="name"/></h2>
<br>
<img class="already-avatar" id="newavatar"
     src="https://www.hearingtracker.com/assets/avatar_unknown-3809f4251f011bc6f801ea7c0d667f48552457edfa92dde7d20ea822e37bd068.jpg"
     width="136px"    height="136px"/>
<br>
<div id="flip">Change photo</div>
<div id="panel">
    <input id="input-file" class="upload-image"  type="file"    name="avatar" >
    <br>
    <button id="imgChang" onchange="changeImage()">Change</button>
    <br>
</div>
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






</body>
</html>