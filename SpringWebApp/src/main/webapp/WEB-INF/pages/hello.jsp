<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/jquery.1.10.2.min.js" />"></script>
<spring:url value="/resources/js/main.js" var="mainJs" />
<script src="${mainJs}"></script>
</head>
<body>
	<h1>1. Test CSS</h1>
	<h2>2. Test JS</h2>
	<div id="msg"></div>
</body>
</html>