<%@ page import="java.util.ArrayList" %>
<%@ page import="edu.web.Product" %><%--
  Created by IntelliJ IDEA.
  User: kburakf
  Date: 2019-11-21
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>


<p>Printing all products associated with User ${requestScope.username} </p>

<c:forEach items="${requestScope.productList}" var="item">
    <p> <a href="home?id=${item.id}">${item.name}</a></p>
</c:forEach>



</body>
</html>
