<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="header.jsp" %>

<html>
<head>

  <title>Places</title>
</head>

<body bgcolor="#d3d3d3">


<c:forEach items="${places}" var="p">
  ${p.placeName} <a href="/places/${p.placeId}.html">Choose</a> <br/>
<br/>
</c:forEach>

<sec:authorize access="hasRole('ROLE_USER')">
  <td align="center"><a href="/places">All places</a></td>
</sec:authorize>

</body>
</html>