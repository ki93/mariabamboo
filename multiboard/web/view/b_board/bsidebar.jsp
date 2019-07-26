<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div class="row">
	<div class="col-lg-3">
		<h1 class="my-4">
			<img style="max-width: 100%; height: auto;"
				src="img/final_version_logo.png">
		</h1>
		<!-- 
		<div class="list-group">

 -->
		<div class="accordion" id="accordionExample">
			<div class="card">
				<div class="card-header" id="headingOne">
					<h2 class="mb-0">
						<button class="btn btn-link" type="button" data-toggle="collapse"
							data-target="#collapseOne" aria-expanded="true"
							aria-controls="collapseOne"
							onclick="location.href='bboardlist.go';">�����Խ���</button>
					</h2>
				</div>
				<div id="collapseOne" class="collapse show"
					aria-labelledby="headingOne" data-parent="#accordionExample">
				</div>
			</div>
			<div class="card">
				<div class="card-header" id="headingTwo">
					<h2 class="mb-0">
						<button class="btn btn-link collapsed" type="button"
							data-toggle="collapse" data-target="#collapseTwo"
							aria-expanded="false" aria-controls="collapseTwo"
							onclick="location.href='bboardlist.go';">��������</button>
					</h2>
				</div>
				<div id="collapseTwo" class="collapse" aria-labelledby="headingTwo"
					data-parent="#accordionExample"></div>
			</div>
			<div class="card">
				<div class="card-header" id="headingThree">
					<h2 class="mb-0">
						<button class="btn btn-link collapsed" type="button"
							data-toggle="collapse" data-target="#collapseThree"
							aria-expanded="false" aria-controls="collapseThree">�����Խ���
						</button>
					</h2>
				</div>
				<div id="collapseThree" class="collapse"
					aria-labelledby="headingThree" data-parent="#accordionExample">
					<div class="card-body">
						<a href="restaurantMap.go">ã�Ҵ� ����!</a> 
						<a href="restaurantReply.go">�� �����¿�!?</a>
					</div>
				</div>
			</div>
		</div>
		<!-- 
				<a href="bboardlist.go" class="list-group-item">���� �Խ���</a> <a
					href="#" class="list-group-item">�������� �Խ���</a> <a href="#"
					class="list-group-item">���� ����</a>
					 -->
		<!-- 
		</div>
		 -->
		<!-- /.col-lg-3 -->
		<!-- Page Content -->
	</div>
	<div class="col-lg-9">
		<section>
			<c:choose>
				<c:when test="${center == null}">
					<jsp:include page="centerbamboo.jsp"></jsp:include>
				</c:when>
				<c:otherwise>
					<jsp:include page="${center}.jsp"></jsp:include>
				</c:otherwise>
			</c:choose>
		</section>
	</div>
</div>
