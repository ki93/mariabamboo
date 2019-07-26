<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<form action="breplyupdateimpl.go?r_id=${rep.r_id }&at_id=${rep.at_id}"
	method="POST">
	<div class="input-group">
		<input type="text" id="r_cont" name="r_cont" placeholder="내용을 입력하세요.">
		<span class="input-group-btn"> <input type="submit" value="수정">
		</span>
	</div>
</form>