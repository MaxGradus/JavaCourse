<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="header.jsp" %>

<html>
<head>
  <title>Personal Account</title>
</head>
<body bgcolor="#d3d3d3">

<c:set var="val" value="${size}"/>
<c:choose>
  <c:when test="${val == '0'}">
    You have not places yet
  </c:when>
  <c:otherwise>
    <c:forEach items="${places}" var="p">
      ${p.placeName}  <br/>
    </c:forEach>
  </c:otherwise>
</c:choose>
<br/>
<a href="/places">Buy Place</a>
</body>
</html>
