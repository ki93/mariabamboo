<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
 
<div id="carouselExampleIndicators" class="carousel slide my-4"
	data-ride="carousel">
		<div class="carousel-inner" role="listbox">
			<div class="carousel-item active">
				<img class="d-block img-fluid" id="img01"
					src="/multiboard/img/forest.jpg" alt="First slide">
			</div>
		</div>
</div>
 
	<section>
		<c:choose>
			<c:when test="${content == null}">
				<jsp:include page="list.jsp"></jsp:include>
			</c:when>
			<c:otherwise>
				<jsp:include page="${content}.jsp"></jsp:include>
			</c:otherwise>
		</c:choose>
	</section>
<!-- /.row -->
<!-- /.container -->
		