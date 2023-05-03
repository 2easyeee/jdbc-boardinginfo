<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jihee
  Date: 2023/05/03
  Time: 8:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>flight-info</title>
</head>
<body>
    <h1>Flight Information</h1>
    <table>
        <th>PassengerName</th>
        <th>ReservedDate</th>
        <th>Departures</th>
        <th>Arrival</th>
        <th>FlightDate</th>
        <th>Airline</th>

        <c:forEach var="item" items="${flightList}">
            <tr>
                <td>${item.passengerName}</td>
                <td>${item.reservedDate}</td>
                <td>${item.departures}</td>
                <td>${item.arrival}</td>
                <td>${item.flightDate}</td>
                <td>${item.airline}</td>
            </tr>
        </c:forEach>
    </table>
    <form method="get" action="/">
        <button type="submit">목록으로 되돌아가기</button>
    </form>
</body>
</html>

