<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<table class="table">
	<thead>
		<th>#</th>
		<th>제목</th>
		<th></th>
		<th></th>
	</thead>
	<tbody>
		<c:forEach var="board" items="${boardlist}">
			<tr>
				<td>${ board.at_id }</td>
				<td>${ board.at_title }</td>
				<td><a href="bboarddelete.go?id=${ board.at_id }">삭제</a></td>
				<td><a href="bboardupdate.go?id=${ board.at_id }">수정</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>