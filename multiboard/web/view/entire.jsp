<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    
<div class="row">   
<div class="col-lg-3">
		<section>
			<c:choose>
				<c:when test="${sidebar == null}">
					<jsp:include page="sidebar.jsp"></jsp:include>
				</c:when>
				<c:otherwise>

					<jsp:include page="${sidebar}.jsp"></jsp:include>
				</c:otherwise>
			</c:choose>
		</section>
</div>
<div class="col-lg-9">
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
</div>