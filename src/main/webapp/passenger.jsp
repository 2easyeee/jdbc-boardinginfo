<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Passenger</title>
</head>
<body>
<table>
    <thead>
    <th>PassengerNo</th>
    <th>PassengerName</th>
    <th>Grade</th>
    <th>Age</th>
    </thead>
    <tbody>
    <c:forEach var="item" items="${passengerList}">
        <tr>
            <td>${item.passengerNo}</td>
            <td>${item.passengerName}</td>
            <td>${item.grade}</td>
            <td>${item.age}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>