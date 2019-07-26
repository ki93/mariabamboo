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

	<form action="makeMarkerimpl.go" method="POST">
		
	  <table>
	  <tr><td><h4>맛집 등록</h4></td></tr>
	     <tr><td>RT_NAME</td><td><input type="text" id="rtName" name="rt_name"></td></tr>
	     <tr><td>ADDR</td><td><input type="text" id="rtAddr" name="addr"></td></tr>
	     <!-- RT_CATE CATE_NUM -->
	     <tr><td>CATE_NUM</td><td><input type="number" id="rtCatenum" name="cate_num"></td></tr>
	     <tr><td>LAT</td><td><input type="number" id="rtlat" name="lat" step="any"></td></tr>
	     <tr><td>LON</td><td><input type="number" id="rtlon" name="lon" step="any"></td></tr>
	     <tr><td>TEL</td><td><input type="text" id="rtCall" name="tel"></td></tr>
	     <tr><td>CATE_DET</td><td><input type="text" id="rtCatedet" name="cate_det"></td></tr>
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
