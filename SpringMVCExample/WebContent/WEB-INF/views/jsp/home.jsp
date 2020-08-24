<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Home</title>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" >
</head>
<body>
<div class="container">
	<div class="row">
		<nav class="navbar navbar-inverse">
		    <div class="container-fluid">
		        <div class="navbar-header"> <a class="navbar-brand" href="/">Logo</a> </div>
		        <ul class="nav navbar-nav">
		        	<li class="active"><a href="<c:url value="/" />">Home</a></li>
		            <li><a href="<c:url value="/dashboard.do" />">Dashboard</a></li>
		            <li><a href="<c:url value="/addCustomer.do" />">Add Customer</a></li>
		            <li><a href="<c:url value="/welcome.do" />">Model Map</a></li>
		            <li><a href="<c:url value="/ajax.do" />">Ajax</a></li>
		        </ul>
		    </div>
		</nav>
		<div class="container">
			<div class="row">
				<div class="col-md-9">
					<h1>Hello world!</h1>
					<p>The time on the server is ${serverTime}.</p>
					<p>
						<a class="btn btn-primary btn-lg" href="<c:url value="/dashboard.do" />" role="button">Learn more</a>
					</p>
				</div>
				<div class="col-md-3">
					<div class="jumbotron">
						<h2>Test Form</h2>
						<form action="user" method="post">
							<input type="text" name="userName" placeholder="Enter name"><br><br>
							<input class="btn btn-default" type="submit" value="Login">
						</form>
					</div>
				</div>
			</div>
		</div>
		<hr>
		<footer>
			<p>&copy; 2020</p>
		</footer>
	</div>
</div>					    
<spring:url value="/resources/js/jquery.min.js" var="jqueryJs" />
<spring:url value="/resources/js/bootstrap.min.js" var="bootstrapJs" />
<script src="${jqueryJs}"></script>
<script src="${bootstrapJs}"></script>
</body>
</html>