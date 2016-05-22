<%@include file="/WEB-INF/jspf/header.jspf" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <title>Available Cities</title>
    <link rel="stylesheet" href="${cssUrl}"" type="text/css">
</head>

<body>
     <form method="get" action="CitiesController">
     <input type="Submit" value="Get Available Cities">
     </form>
            <c:forEach var="city" items="${allCities}">
            <c:out value="${city}"></c:out><br>
            </c:forEach>
</body>
</html>