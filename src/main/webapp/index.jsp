<%--
  Created by IntelliJ IDEA.
  User: jihee
  Date: 2023/05/04
  Time: 1:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h2>JSP 응용 프로그램 작성</h2>
<h3>- 아래를 클릭하면 'Connection Pool을 사용하는 항공편 정보(Flight.jsp) 페이지'로 넘어갑니다.</h3>
    <form method="get" action="/passenger">
      <button type="submit">승객 목록</button>
    </form>
<h2>Paging 처리</h2>
<h3>- 아래를 클릭하면 'Module12 데이터베이스(트랜잭션 실습한 데이터베이스)의 Member 테이블의 데이터를 한 페이지에 20개씩 보여주는 페이지'로 넘어갑니다.</h3>
    <form method="get" action="/member">
      <input type="hidden" name="nextPage" value=0 />
      <button type="submit">Members</button>
    </form>
</body>
</html>
