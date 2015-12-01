<%@ taglib prefix="s" uri="/struts-tags" %>  <!--taglib для Struts2-->

<html>
<head>
    <title>Login</title>
</head>
<body>
<s:head />
<s:form action="LoginAction">
    <s:textfield name="username" label="User Name"/>  <!--указываются имена прямо из класса private String username;-->
    <s:textfield name="password" label="Password"/>
    <s:submit/>
</s:form>

</body>
</html>
