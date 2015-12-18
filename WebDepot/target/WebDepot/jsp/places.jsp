<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

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
