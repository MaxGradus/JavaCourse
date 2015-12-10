<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<body>
    <h3>Message : ${message}</h3>
    <h3>Username : ${username}</h3>

    <a href="<c:url value="/j_spring_security_logout" />" > Logout</a> <!--в спринг-секьюрити описанно <logout logout-success-url="/logout" /> поэтому меня при нажатии кинет на контроллер в метод public String logout(Model model) -->
</body>
</html>