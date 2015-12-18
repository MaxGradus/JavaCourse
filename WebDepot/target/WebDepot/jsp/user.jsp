<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="header.jsp" %>

<html>
<head>
  <title>Current User</title>
</head>
<body bgcolor="#d3d3d3">

<form method="POST" action="/users/delete">
  <input type="hidden" name="userId" value="${user.userId}">

  <table>
    <tr>
      <td>ID</td>
      <td>${user.userId}</td>
    </tr>
    <tr>
      <td>Login</td>
      <td>${user.login}</td>
    </tr>
    <tr>
      <td>Password</td>
      <td>${user.password}</td>
    </tr>
    <tr>
      <td>Email</td>
      <td>${user.email}</td>
    </tr>
  </table>
  <input type="submit" value="DELETE">
</form>


</body>
</html>