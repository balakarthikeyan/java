<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sales Management</title>
<!-- let's add tag srping:url -->
<spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
</head>
<body>
<div class="container">
	<div class="row">
		<nav class="navbar navbar-default">
		    <div class="container-fluid">
		    	<div class="navbar-header"> <a class="navbar-brand" href="#">Logo</a> </div>
		        <ul class="nav navbar-nav">
		        	<li><a href="<c:url value="/" />">Home</a></li>
		            <li class="active"><a href="<c:url value="/dashboard.do" />">Dashboard</a></li>
		            <li><a href="<c:url value="/addCustomer.do" />">Add Customer</a></li>
		        </ul>
		    </div>
		</nav>
		<div class="container">
			<div class="row">
				<div class="col-md-9">
				    <h3> <b>Dashboard: ${userName}</b> </h3>
				    <form:form class="form-horizontal" role="form" action="dashboard.do" modelAttribute="customerObject">
				        <div class="form-group">
				            <h2>Welcome to Sales management system</h2>
				        </div>
				    </form:form>
				</div>
				<div class="col-md-3">
					<div class="jumbotron">
						<h2>Menu</h2>
						<p>
							<a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a>
						</p>
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