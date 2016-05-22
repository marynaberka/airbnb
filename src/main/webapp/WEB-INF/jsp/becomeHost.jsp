<%@include file="/WEB-INF/jspf/header.jspf" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <title>Become Host</title>
    <link rel="stylesheet" href="${cssUrl}" type="text/css">
</head>

<body>
Hello, <c:out value="${param.userName}"></c:out>
<c:out value="${param.userSurname}"></c:out>!
<br>
<form method="get" action="BecomeHostController">
    Do you want to become a Host User?<br>
    <input type="radio" name="answer" value="YES" /> YES
    <input type="radio" name="answer" value="NO" /> NO
    <input type="Submit" value="Submit">
</form>
</body>
</html>
