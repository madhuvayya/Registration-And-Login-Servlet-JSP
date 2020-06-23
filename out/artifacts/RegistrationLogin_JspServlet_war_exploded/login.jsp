<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 6/22/2020
  Time: 9:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <style>
        form{
            text-size:10px;
            background-color: #FFA500;
            text-align:center;
            width: 300px;
            padding: 50px;
            margin: 20px;
            display: inline-block;
            position: absolute;
            left: 50%;
            top:30%;
            transform: translate(-50%, -50%);
        }
    </style>
</head>
<body>
<br>
<h2 align="center">Login</h2>
<div class="form">
    <form method="post" action="login">
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="email" placeholder="Email" required></td><br>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" name="password" placeholder="Password" required></td><br/>
            </tr>
        </table>
        <br>
        <input type="submit" value="Login" />
    </form>
</div>
</body>
</html>
