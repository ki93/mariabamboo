<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<style>
table{
margin:0 auto;

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

#marg{
 height: 100px;
}

</style>
<<<<<<< HEAD
<div id="marg"></div>

	<form action="bboardupdateimpl.go" method="POST" enctype="multipart/form-data">
		
	  <table>	  	  	  	  
	  <tr><td><h4>게시판 글 수정</h4></td></tr>
	     <tr><td>게시판</td>
	         <td>
	           <select>
	             <option name="b_type" value="0">기본게시판</option>
  				 <option name="b_type" value="1">맛집리뷰게시판</option>
			   </select>  
			 </td>
	     </tr>
	     <tr><td>제목</td><td><input type="text" id="b_title" name="at_title"></td></tr>
	     <tr><td>파일</td><td><input type="file" id="b_file" name="mf"></td></tr>
	     <tr><td colspan="2" ><input type="text" id="b_content" name="at_detail"></td></tr>
	     <tr>
	     <td><input type="submit" value="확인"></td>
	     <td><input type="button" onclick="location.href='bboardlist.go'" value="목록"></td>
	     </tr>
	  </table>
	  
	  <input type="hidden" name="at_id" value="${boardupdate.at_id }">
	  <input type="hidden" name="u_id" value="${boardupdate.u_id }">
	  <input type="hidden" name="at_hits" value="${boardupdate.at_hits }">
	  <input type="hidden" name="rt_id" value="${boardupdate.rt_id }">
   	</form>

