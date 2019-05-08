<%--
  Created by IntelliJ IDEA.
  User: chenxu
  Date: 2019-05-07
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Hello SpringMVC!</h2>
<a href="<c:url value="/login" />">login</a>
<a href="<c:url value="/register"/>">register</a>
</body>
</html>
