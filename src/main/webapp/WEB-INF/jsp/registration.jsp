<%@include file="/WEB-INF/jspf/header.jspf" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <title>MyAirbnb Registration</title>
    <link rel="stylesheet" href="${cssUrl}" type="text/css">
</head>

<body>

    <form name="registerForm" method="post" action="RegistrationController" action="becomeHost.jsp">
        Name:<br>
        <input name="userName">
        <br>
        Surname:<br>
        <input name="userSurname">
        <br>
        Email:<br>
        <input name="email">
        <br>
        City:<br>
        <input name="userCity">
        <br>
        <input type="submit" value="Register on Airbnb" formaction="becomeHost.jsp">
    </form>
</body>
</html>