<%--
  Created by IntelliJ IDEA.
  User: basznid
  Date: 2022-03-21
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
addcard
<form action="/dziendobry/form1" method="post">
    paramName:
    <input type="text" name="paramName"/>
    paramDate:
    <input type="text"
           name="paramDate"/>
    <input type="submit" value="Wyślij"/>
</form>
</body>
</html>
