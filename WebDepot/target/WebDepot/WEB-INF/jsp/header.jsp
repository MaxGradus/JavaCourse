<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<table width="100%">
  <tr>
    <sec:authorize access="hasRole('ROLE_ADMIN')">
      <td align="center"><h2><a href="<c:url value="/admin" />" > Administration</a></h2></td>
    </sec:authorize>
    <td align="center"><h2><a href="/users">Personal Account</a></h2> </td>
    <td align="center"><h2><a href="/places">Buy Placement</a></h2> </td>
    <td align="center"><h2><a href="/history">History</a></h2> </td>
    <td align="center"><h2><a href="/contacts">Contacts</a></h2> </td>
    <td align="center"><h2><a href="<c:url value="/j_spring_security_logout" />" > Logout</a></h2></td>

  </tr>
</table>
<br/>
