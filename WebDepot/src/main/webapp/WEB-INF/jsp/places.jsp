<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="header.jsp" %>

<html>
<head>
  <title>Places</title>
</head>

<body bgcolor="#d3d3d3">

<c:forEach items="${places}" var="p">
  ${p.placeName} - ${p.price} USD <br/>
</c:forEach>

<a href="/free_places">Free places</a>
</body>
</html>
