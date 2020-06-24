<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 6/22/2020
  Time: 9:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <style>
    form{
        text-size:10px;
        background-color: #ffa500;
        text-align:center;
        width: 300px;
        padding: 30px;
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
    <div>
        <br>
        <h2 align="center">Register</h2>
        <div class="form">
            <form method="post" action="register">
                <table>
                    <tr>
                        <td>First Name:</td>
                        <td><input type="text" name="firstname" placeholder="Firstname" required></td>
                    </tr>
                    <tr>
                        <td>Last Name:</td>
                        <td><input type="text" name="lastname" placeholder="Lastname" required></td>
                    </tr>
                    <tr>
                        <td>Phone No:</td>
                        <td><input type="text" name="phonenumber" placeholder="Phonenumber" required></td>
                    </tr>
                    <tr>
                        <td>Email ID:</td>
                        <td><input type="text" name="email" placeholder="Email" required></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type="password" name="password" placeholder="Password" required></td>
                    </tr>
                </table>
                <br>
                <input type="submit" value="Register" />
            </form>
        </div>
    </div>
</body>
</html>
