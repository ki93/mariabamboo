<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

	
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="r" items="${rlist }">
		<div class="input-group">
			<input type="text" readonly="readonly" id="r_cont" name="r_cont" value="${r.r_cont} ">
			<span class="input-group-btn"> 
			  <input type="button" onclick="location.href='breplyupdate.go?id=${r.r_id }'" value="수정">			
			  <input type="button" onclick="location.href='breplydelete.go?id=${r.r_id }'" value="삭제">
		   </span>
		</div>
	</c:forEach>


</body>
</html>