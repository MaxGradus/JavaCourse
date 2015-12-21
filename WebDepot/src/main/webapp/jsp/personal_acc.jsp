<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="header.jsp" %>

<html>
<head>
  <title>Personal Account</title>
</head>
<body bgcolor="#d3d3d3">
<c:forEach items="${places}" var="p">
  ${p.placeName}  <br/>
</c:forEach>
</body>
</html>
