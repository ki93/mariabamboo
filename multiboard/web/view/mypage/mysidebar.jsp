<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div class="row">

	<div class="col-lg-3">
		<h1 class="my-4">
			My page
		</h1>
		<div class="list-group">
			<a href="mypage.go" class="list-group-item">정보 변경</a> 
			<a href="#"	class="list-group-item">내 댓글</a> 
			<a href="myarticles.go"	class="list-group-item">내 게시글</a>
			<a href="#"	class="list-group-item">내 후기</a>
		</div>
	</div>
	<!-- /.col-lg-3 -->
	<div class="col-lg-9" style="margin-top:50px;">
		<section>
			<c:choose>
				<c:when test="${center == null}">
					<jsp:include page="mypageDefault.jsp"></jsp:include>
				</c:when>
				<c:otherwise>
					<jsp:include page="${center}.jsp"></jsp:include>
				</c:otherwise>
			</c:choose>
		</section>
	</div>
</div>


