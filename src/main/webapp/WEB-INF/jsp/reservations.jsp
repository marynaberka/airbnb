<%@include file="/WEB-INF/jspf/header.jspf" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <title>Make Reservation</title>
    <link rel="stylesheet" href="${cssUrl}" type="text/css">
</head>
<body>
    Hello, <c:out value="${param.userName}"></c:out>
    <c:out value="${param.userSurname}"></c:out>!
    See available apartments to reserve:
         <form method="get" action="AvailableAptsController">
         <input type="Submit" value="See available apartments">
         </form>
                <c:forEach var="apartment" items="${allApts1}">
                <c:out value="${apartment}"></c:out><br>
                </c:forEach>
</body>
</html>