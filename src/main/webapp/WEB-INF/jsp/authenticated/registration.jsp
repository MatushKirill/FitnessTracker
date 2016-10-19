<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add goal</title>

    <style>
        .text{
           color: #b3b3b3;
        }
        .login-page {
            width: 500px;
            padding: 8% 0 0;
            margin: auto;
        }
        .form {
            position: relative;
            z-index: 1;
            background: #FFFFFF;
            max-width: 360px;
            margin: 0 auto 100px;
            padding: 45px;
            text-align: center;
            box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
        }
        .form select{
            font-family: "Roboto", sans-serif;
            outline: 0;
            background: #f2f2f2;
            width: 100%;
            border: 0;
            margin: 0 0 15px;
            padding: 15px;
            box-sizing: border-box;
            font-size: 14px;
        }
        .form input {
            font-family: "Roboto", sans-serif;
            outline: 0;
            background: #f2f2f2;
            width: 100%;
            border: 0;
            margin: 0 0 15px;
            padding: 15px;
            box-sizing: border-box;
            font-size: 14px;
        }
        .form button {
            font-family: "Roboto", sans-serif;
            text-transform: uppercase;
            outline: 0;
            background: #4CAF50;
            width: 100%;
            border: 0;
            padding: 15px;
            color: #FFFFFF;
            font-size: 14px;
            -webkit-transition: all 0.3 ease;
            transition: all 0.3 ease;
            cursor: pointer;
        }
        .form button:hover,.form button:active,.form button:focus {
            background: #43A047;
        }
        .form .message {
            margin: 15px 0 0;
            color: #b3b3b3;
            font-size: 12px;
        }
        .form .message a {
            color: #4CAF50;
            text-decoration: none;
        }
        .form .register-form {
            display: none;
        }
        .container {
            position: relative;
            z-index: 1;
            max-width: 300px;
            margin: 0 auto;
        }
        .container:before, .container:after {
            content: "";
            display: block;
            clear: both;
        }
        .container .info {
            margin: 50px auto;
            text-align: center;
        }
        .container .info h1 {
            margin: 0 0 15px;
            padding: 0;
            font-size: 36px;
            font-weight: 300;
            color: #1a1a1a;
        }
        .container .info span {
            color: #4d4d4d;
            font-size: 12px;
        }
        .container .info span a {
            color: #000000;
            text-decoration: none;
        }
        .container .info span .fa {
            color: #EF3B3A;
        }
        body {
            background: #76b852; /* fallback for old browsers */
            background: -webkit-linear-gradient(right, #76b852, #8DC26F);
            background: -moz-linear-gradient(right, #76b852, #8DC26F);
            background: -o-linear-gradient(right, #76b852, #8DC26F);
            background: linear-gradient(to left, #76b852, #8DC26F);
            font-family: "Roboto", sans-serif;
            -webkit-font-smoothing: antialiased;
            -moz-osx-font-smoothing: grayscale;
        }
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
<form:form commandName="user">
    <form:errors  path="*" cssClass="errorBlock" element="div"/>
    <div class="login-page">
        <div class="form">
            <form class="register-form">
                <table>
                    <tr>
                        <td>
                            <from:input path="userName" placeholder="name" cssErrorClass="error"/></td>
                        <td><form:password path="userPass" placeholder="password" cssErrorClass="error"/></td>
                    </tr>
                    <tr>
                        <td class="message">Your sex</td>
                        <td class="message">Your activity</td>
                    </tr>
                    <tr>
                        <td >
                            <form:select disabled="Choose" path="sex"  cssErrorClass="error">
                                <form:option value="male"/>
                                <form:option value="female"/>
                            </form:select>
                        </td>
                        <td >
                            <form:select path="activity"  cssErrorClass="error">
                                <form:option disabled="true" value="0">Choose</form:option>
                                <form:option value="1.2">Passive lifestyle</form:option>
                                <form:option value="1.375">1-3 times a week</form:option>
                                <form:option value="1.55">3-5 times a week</form:option>
                                <form:option  value="1.725">6-7 times a week</form:option>
                            </form:select>
                        </td>
                    </tr>

                    <table>
                         <tr>
                             <td class="message">Your rise</td>
                             <td class="message">Your weight</td>
                             <td class="message">Your age</td>
                         </tr>
                         <tr>
                             <td><form:input path="rise" placeholder="your rise" cssErrorClass="error"/></td>
                             <td><form:input path="weight" placeholder="your weight" cssErrorClass="error"/></td>
                             <td><form:input path="age" placeholder="your age" cssErrorClass="error"/></td>

                         </tr>
                    </table>
                    <tr>
                        <td><form:input path="email" placeholder="email" cssErrorClass="error"/></td>
                    </tr>
                </table>
                <button type="submit">create</button>
                <p class="message">Already registered? <a href="login">Sign In</a></p>
            </form>
        </div>
    </div>

</form:form>
</body>
</html>
