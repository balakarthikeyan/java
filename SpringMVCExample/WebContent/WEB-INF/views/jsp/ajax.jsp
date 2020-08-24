<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<head>
<spring:url value="/resources/css/style.css" var="crunchifyCSS" />
<spring:url value="/resources/js/jquery.min.js" var="jqueryJs" />
<spring:url value="/resources/js/index.js" var="crunchifyJS" />
<link href="${crunchifyCSS}" rel="stylesheet" />
<script src="${jqueryJs}"></script>
<script src="${crunchifyJS}"></script>
<title>Spring MVC Tutorial by Crunchify - Spring MVC Example with AJAX call</title>
<style type="text/css">
body {
	background-image: url(${pageContext.request.contextPath}/resources/img/ui-bg_flat_white.png);
}
</style>
<script type="text/javascript">
    var intervalId = 0;
    intervalId = setInterval(crunchifyAjax, 3000);
</script>
</head>
 
<body>
    <div align="center">
        <br> <br> ${message} <br> <br>
        <div id="result"></div>
		<div class="footer"> Spring MCV Tutorial by <a href="https://crunchify.com">Crunchify</a>.<div>
	</div>
</body>
</html>