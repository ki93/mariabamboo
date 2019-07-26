<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<style>
table {
	text-align: center;
}

/* Bootstrap 수정 */
.table>thead {
	background-color: #CEF279;
}

.table>thead>tr>th {
	text-align: center;
}

.table-hover>tbody>tr:hover {
	background-color: #FFFF6C;
}

.table>tbody>tr>td {
	text-align: center;
}

.table>tbody>tr>#title {
	text-align: left;
}

div>#paging {
	text-align: center;
}
</style>

<table class="table table-hover">
	<thead>
		<tr>
			<th width="100px">글번호</th>
			<th width="300px">제목</th>
			<th width="100px">작성자</th>
			<th width="200px">작성일</th>
			<th width="100px">조회수</th>
		</tr>
	</thead>
	<c:forEach var="b" items="${blist }">
		<tr>
			<td>${b.at_id }</td>
			<td><a href="bboarddetail.go?id=${b.at_id }"> ${b.at_title }</a></td>
			<td>${b.u_id }</td>
			<td>${b.at_date }</td>
			<td>${b.at_hits }</td>
		</tr>
	</c:forEach>
</table>
<div class="contatiner">
	<div class="row">
		<div class="col-sm-10"></div>
		<div class="col-sm-auto">
			<input class="btn btn-outline-success" type="button" value="글쓰기"
				onclick="location.href='bboardwrite.go'">
		</div>
	</div>
</div>