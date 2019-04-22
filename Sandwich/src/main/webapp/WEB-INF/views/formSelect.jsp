
<%--
  Created by IntelliJ IDEA.
  User: tranchung
  Date: 22/04/2019
  Time: 22:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Form Select</title>
</head>
<body>
<form method="post">
    <h1>Sandwih Condiments</h1>
    <input type="checkbox" name="condiment" value="Lettuce"> I have Lettuce<br>
    <input type="checkbox" name="condiment" value="Tomato"> I have Tomato<br>
    <input type="checkbox" name="condiment" value="Mustard"> I have Mustard<br>
    <input type="checkbox" name="condiment" value="Sprouts"> I have Sprouts<br>
    <input type="submit" value="Save">
</form>
</body>
</html>
