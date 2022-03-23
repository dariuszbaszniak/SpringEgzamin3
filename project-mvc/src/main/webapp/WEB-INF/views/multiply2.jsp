<%--
  Created by IntelliJ IDEA.
  User: basznid
  Date: 2022-03-20
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
<%--${sizeA}--%>
<%--    ${sizeB}--%>
<c:forEach begin="1" end="${sizeA}" var="sample1">
    <tr>
    <c:forEach begin="1" end="${sizeB}" var="sample2">
        <td>
        ${sample1 * sample2}
        </td>
    </c:forEach>
    </tr>
</c:forEach>
</table>
</body>
</html>
