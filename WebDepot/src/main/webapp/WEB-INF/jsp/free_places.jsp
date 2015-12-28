<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="header.jsp" %>

<html>
<head>

  <title>Places</title>
</head>

<body bgcolor="#d3d3d3">

<form action="/buy_place" method="post">

<c:forEach items="${places}" var="p">
  ${p.placeName}

  <select name="select">
  <option>one month</option>
  <option>two month</option>
  <option>three month</option>
</select>
  <input type="submit" value="BUY"/>
<br/>
</c:forEach>
</form>

<sec:authorize access="hasRole('ROLE_USER')">
  <td align="center"><a href="/places">All places</a></td>
</sec:authorize>

</body>
</html>