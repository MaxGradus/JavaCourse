<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="header.jsp" %>

<html>
<head>
  <title>Current Place</title>
</head>
<body bgcolor="#d3d3d3">

<form method="POST" action="/places/buy">
  <input type="hidden" name="placeId" value="${place.placeId}">

  <table>

    <tr>
      <td>Name</td>
      <td>${place.placeName}</td>
    </tr>

  </table>
  <input type="submit" value="BUY">
</form>


</body>
</html>

<%--<form action="/buy_place" method="post">--%>

<%--<select name="select">--%>
<%--<option>one month</option>--%>
<%--<option>two month</option>--%>
<%--<option>three month</option>--%>
<%--</select>--%>
<%--<input type="submit" value="BUY"/>--%>
<%--</form>--%>
