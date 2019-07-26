<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


	<div id="carouselExampleIndicators" class="carousel slide my-4" data-ride="carousel">
		<section>
            <c:choose>
               <c:when test="${centerpic == null}">
                  <jsp:include page="centerpic.jsp"></jsp:include>
               </c:when>
               <c:otherwise>
                  <jsp:include page="${centerpic}.jsp"></jsp:include>
               </c:otherwise>
            </c:choose>
         </section>

	</div>
	<div class="row">
         <section>
            <c:choose>
               <c:when test="${content == null}">
                  <jsp:include page="content.jsp"></jsp:include>
               </c:when>
               <c:otherwise>
                  <jsp:include page="${content}.jsp"></jsp:include>
               </c:otherwise>
            </c:choose>
         </section>
       </div>
    <!-- /.row -->
<!-- /.container -->
