<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
<spring:url value="/resources/css/style.css" var="crunchifyCSS" />
<spring:url value="/resources/js/jquery.min.js" var="jqueryJs" />
<link href="${crunchifyCSS}" rel="stylesheet" />
<script src="${jqueryJs}"></script>
<title>Spring MVC Tutorial by Crunchify - Hello World Spring MVC Example</title>
<style type="text/css">
body {
	background-image: url(${pageContext.request.contextPath}/resources/img/ui-bg_flat_white.png);
}
</style>
</head>
<body>
	<h1>${heading}</h1>
	<p>${result1}</p>
	<p>${result2}</p>
	<div class="footer">${credit}<div>
</body>
</html>