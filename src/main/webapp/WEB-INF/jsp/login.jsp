<%@include file="/WEB-INF/jspf/header.jspf" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>MyAirbnb Login</title>
<link rel="stylesheet" href="${cssUrl}" type="text/css">
</head>

<body>

<form method="post" action="LoginController">
    Name:<br>
    <input name="userName">
    <br>
    Surname:<br>
    <input name="userSurname">
    <br>
    <input type="submit" value="Login">
</form>
</body>
</html>