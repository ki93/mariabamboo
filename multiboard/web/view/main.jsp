<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Shop Homepage - Start Bootstrap Template</title>

  <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="css/shop-homepage.css" rel="stylesheet">
  <style>
  	footer{
  		margin-top:50px;
  	}
  </style>
</head>

<body>

  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="#">Start Bootstrap</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
		<c:choose>
			<c:when test="${loginuser != null }">
				<li class="nav-item active">
				  <a class="nav-link" href="/index.html">Home
				    <span class="sr-only">(current)</span>
				  </a>
				</li>
				<li class="nav-item">
				  <a class="nav-link" href="logout.go">Logout</a>
				</li>
			</c:when>
			<c:otherwise>
				<li class="nav-item active">
				  <a class="nav-link" href="/index.html">Home
				    <span class="sr-only">(current)</span>
				  </a>
				</li>
				<li class="nav-item">
				  <a class="nav-link" href="sign.go">Login</a>
				</li>
				<li class="nav-item">
				  <a class="nav-link" href="registerpage.go">Register</a>
				</li>
			</c:otherwise>
		</c:choose>
        </ul>
      </div>
    </div>
  </nav>

  <!-- Page Content -->
  <div class="container">

    <div class="row">

      <div class="col-lg-3">
        <h1 class="my-4">멀티캠퍼스<br> 대나무숲</h1>
        <div class="list-group">
          <a href="#" class="list-group-item">자유 게시판</a>
          <a href="#" class="list-group-item">공지사항 게시판</a>
          <a href="#" class="list-group-item">맛집 지도</a>
        </div>
      </div>
      <!-- /.col-lg-3 -->

      <div class="col-lg-9">
        <div id="carouselExampleIndicators" class="carousel slide my-4" data-ride="carousel">
          <ol class="carousel-indicators">
            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
          </ol>
          <div class="carousel-inner" role="listbox">
            <div class="carousel-item active" >
              <img class="d-block img-fluid" id="img01" src="img/bamboo.jpg"  alt="First slide">
            </div>
            
          </div>
          <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
          </a>
          <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
          </a>
        </div>

        <div class="row">
			<section>
				<c:choose>
					<c:when test="${center == null}">
						<jsp:include page="center.jsp"></jsp:include>
					</c:when>
					<c:otherwise>
						<jsp:include page="${center}.jsp"></jsp:include>
					</c:otherwise>
				</c:choose>
			</section>
    	</div>
    <!-- /.row -->
	</div>
  </div>
  <!-- /.container -->

  <!-- Footer -->
  <footer class="py-5 bg-dark">
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; Your Website 2019</p>
    </div>
    <!-- /.container -->
  </footer>

  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

</html>
