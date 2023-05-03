<%--
  Created by IntelliJ IDEA.
  User: jihee
  Date: 2023/05/04
  Time: 12:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Paging - member</title>
</head>
<body>
<h1>Members</h1>
<table>
    <thead>
    <th>Id</th>
    <th>Name</th>
    <th>City</th>
    </thead>
    <tbody>
    <c:forEach var="item" items="${memberList}">
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>${item.city}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
    <form method="get" action="/member">
        <input type="hidden" name="nextPage" value="${param.nextPage + 20}"/>
    <button type="submit">다음 페이지</button>
    </form>
</body>
</html>
