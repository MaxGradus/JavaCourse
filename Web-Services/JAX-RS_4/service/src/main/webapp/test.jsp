<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Region + JAX-RS TEST</title>
</head>
<body>
<form action="/rest/rest/regions/add" method="post">
  <p>
    Name : <input type="text" name="name" />
  </p>
  <input type="submit" value="Add Region" />
</form>
</body>
</html>


<!--URL чтобы обратиться к этой jsp странице:
http://localhost:8080/rest/test.jsp
-->