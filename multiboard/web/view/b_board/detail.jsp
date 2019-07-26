<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<style>

#pic{
 width:300px;
 height:300px; 
}

#repl{
 margin-top:100px;
}
.table-hover>tbody>tr:hover {
	background-color: white;
}

#con{
 margin-top:70px;
}


.table>tbody>tr>#title {
	text-align: left;
}



</style>
<div style="height:100px;">

</div>
<table class="table table-hover">
	<tr>
		<td colspan="2"><h3>${bboarddetail.at_title }</h3></td>
	</tr>
	<tr>
		<td >${bboarddetail.u_id }</td>
		<td style="width: 200px;">${bboarddetail.at_date }</td>
	</tr>

	<tr>
		<td colspan="2"><img id=pic src="img/${bf.f_name }"></td>
	</tr>
	
	<tr>
		<td colspan="3"
			style="width: 500px; height: 400px;vertical-align: top;">${bboarddetail.at_detail }</td>
	</tr>
	</table>
	
	
	  <div class="contatiner">
	<div class="row">
		<div class="col-sm-7"></div>
		<div class="col-sm-auto">
<!-- 	<div id="dv_bt"> -->
       <input type="button" class="btn btn-outline-success"
			onclick="location.href='bboarddelete.go?id=${bboarddetail.at_id }'"
			value="삭제">
	   <input type="button" class="btn btn-outline-success"
			onclick="location.href='bboardupdate.go?id=${bboarddetail.at_id }'"
			value="수정">
	   <input type="button" class="btn btn-outline-success" onclick="location.href='bboardlist.go'"
			value="목록">
     <!-- </div> -->
</div>
</div>
</div>

<layoutTag:layout>

	<!-- private int r_id; --시퀀스 사용
	private int at_id; -- (정해줌)
	private int r_cont; -- 내용 (인풋받음)
	private String u_id; -- 정해줌
	private Date r_date; sql에서 해줌 -->
	<!--                     추가                         -->
	<!--  댓글  -->
	<div class="container" id="con">
		<label for="content"><h4>Comment</h4></label>
		<!-- 댓글 리스트로 보여줘야 함 리스트 뷰를 끌어올 것  -->
		<!-- 댓글 등록  -->

		<c:forEach var="r" items="${rlist }">
			<div class="input-group">
				<input type="text" readonly="readonly" id="r_cont" name="r_cont"
					value="${r.r_cont} "> <span class="input-group-btn">
					<input type="button"
					onclick="location.href='breplyupdate.go?id=${r.r_id }'" class="btn btn-outline-success" value="수정">
					<input type="button"
					onclick="location.href='breplydelete.go?id=${r.r_id }'" class="btn btn-outline-success" value="삭제">
				</span>
			</div>
		</c:forEach>

      <div id="repl">
		<form action="breplywriteimpl.go?id=${bboarddetail.at_id }"
			method="POST">
			<div class="input-group">
				<input type="text" style="width:400px;" id="r_cont" name="r_cont"
					placeholder="내용을 입력하세요.">  <div class="contatiner">
	<div class="row">
		<div class="col-sm-7"></div>
		<div class="col-sm-auto"> <span class="input-group-btn">
					<input type="submit" value="등록">
					
				</span>
			</div>
		 </form>
		</div>
	</div>

	<div class="container">
		<div class="commentList"></div>
	</div>

</layoutTag:layout>

