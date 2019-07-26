<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Shop Homepage - Start Bootstrap Template</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<!-- Bootstrap core CSS -->
<link href="/multiboard/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/multiboard/css/shop-homepage.css" rel="stylesheet">
<!-- 
<style>
footer {
	position: absolute;
	left: 0;
	bottom: 0;
	width: 100%;
	padding-top: 1rem !important;
}
</style>
-->
<style>
footer {
	margin-top: 50px;
}

a{
	text-decoration: none;
}

</style>

</head>

<body>

	<!-- Navigation -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
		<div class="container">
			<a class="navbar-brand" href="#">Multi Bamboo</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarResponsive" aria-controls="navbarResponsive"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<c:choose>
						<c:when test="${loginuser != null }">
							<li class="nav-item active"><a class="nav-link"
								href="bhome.go">Board <span class="sr-only">(current)</span>
							</a></li>
							<li class="nav-item"><a class="nav-link" href="logout.go">Log
									Out</a></li>
							<li class="nav-item"><a class="nav-link" href="mpage.go">My
									Page</a></li>
							<li class="nav-item"><a class="nav-link" href="about.go">About
									Us</a></li>
						</c:when>
						<c:otherwise>
							<li class="nav-item active"><a class="nav-link"
								href="bhome.go">Board <span class="sr-only">(current)</span>
							</a></li>
							<li class="nav-item"><a class="nav-link" href="mpage.go">My
									Page</a></li>
							<li class="nav-item"><a class="nav-link" href="about.go">About
									Us</a></li>
						</c:otherwise>
					</c:choose>
				</ul>
			</div>
		</div>
	</nav>

	<!-- Page Content -->
	<div class="container">
		<section>
			<c:choose>
				<c:when test="${entire == null}">
					<jsp:include page="entire.jsp"></jsp:include>
				</c:when>
				<c:otherwise>
					<jsp:include page="${entire}.jsp"></jsp:include>
				</c:otherwise>
			</c:choose>
		</section>
	</div>
	<!-- /.container -->

	<!-- Footer -->
	<footer class="py-5 bg-dark">
		<div class="container">
			<p class="m-0 text-center text-white">Copyright &copy; Your
				Website 2019</p>
		</div>
	</footer>
	<!-- /.container -->

	<!-- Bootstrap core JavaScript -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
	<script src="/multiboard/vendor/jquery/jquery.min.js"></script>
	<script src="/multiboard/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>
