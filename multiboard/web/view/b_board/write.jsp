<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<style>
table{
margin-top:5em;

}
#b_title{
 width: 440px; 
}
#b_file{
 width: 500px; 
}
#b_content{
 width: 550px; 
 height: 500px;
}


</style>

	<form enctype="multipart/form-data" action="bboardwriteimpl.go" method="POST">
		
	  <table>
	  <tr><td><h4>게시판 글쓰기</h4></td></tr>
	     <tr><td>게시판</td>
	         <td>
	           <select>
	             <option name="b_type" value="1">기본게시판</option>
  				 <option name="b_type" value="2">맛집리뷰게시판</option>
			   </select>  
			 </td>
	     </tr>
	     <tr><td>제목</td><td><input type="text" id="b_title" name="at_title"></td></tr>
	     <tr><td>파일</td><td><input type="file" id="b_file" name="mf"></td></tr>
	     <tr><td colspan="2"><input type="text" id="b_content" name="at_detail"></td></tr>
	  </table>
	  <div class="contatiner">
	<div class="row">
		<div class="col-sm-7"></div>
		<div class="col-sm-auto">
			<input class="btn btn-outline-info" type="submit" name="write" value="등록">
		</div>
	</div>
</div>
	</form>
