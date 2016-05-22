<%@include file="/WEB-INF/jspf/header.jspf" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <title>Welcome to Airbnb Home Page</title>
    <link rel="stylesheet" href="${cssUrl}" type="text/css">
</head>

<body>
    <center><h3>Welcome to MyAirbnb Home Page</h3></center>

    <p align="right"></p> <li><a href="admin.jsp">Admin</a>
    <p align="right"> <li><a href="cabinet.jsp">Personal Cabinet</a>
    <p align="center"> <li><a href="login.jsp">Login</a>
    <align="center" <li><a href="registration.jsp">Register</a>

    <ul class="navbar">
        <li type="disc"><a href="index">MyAirbnb Home page</a>
        <li><a href="registration">Register</a>
        <li><a href="login">Login</a>
        <%--<li><form method="get" action="CitiesController"><a href="cities.jsp"></form>Show Available Cities</a>--%>
        <li><a href="search">Search</a>
        <li><a href="reservations">Reservations</a>
        <li><a href="contacts">Contacts</a>
    </ul>
<br>
</body>
</html>