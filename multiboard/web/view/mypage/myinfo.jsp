<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<form id="changeInfo" action="updateuser.go" method="POST" class="col-md-9">
	<div class="form-group">
		<label for="idField">ID</label>
		<p id="idField"><strong>${ loginuser.u_id }</strong></p>
	</div>
	<div class="form-group">
		<label for="unameField">닉네임</label>
		<p id="unameField"><strong>${ loginuser.u_name }</strong></p>
		<input class="form-control" type="text" name="newUsername">
		<a class="btn btn-secondary" id="checker">중복확인</a>
	</div>
	<div class="form-group">
		<label for="pwdField">비밀번호</label>
		<input class="form-control" id="pwdField" type="password" name="newPwd">
	</div>
	<div class="form-group">
		<label for="pwdConfirmField">비밀번호 확인</label>
		<input class="form-control" id="pwdConfirmField" type="password" name="newPwdCheck">
	</div>
		
	<button type="submit" class="btn btn-primary">변경하기</button>
</form>

<script>
	var unameChecked = false;
	var pwChecked = false;

	$("input[name='newPwdCheck']").keyup(function(){
		var inputPwd = $("input[name='newPwd']").val()

		console.log(inputPwd);
		console.log($(this).val());
		

		if($(this).val() == inputPwd){
			pwChecked = true;
		}
		else{
			pwChecked = false;
		}
	})

    $('#checker').click(function(){
        $.ajax({
			url:'unamecheck.go',
			data : {
				newUsername : $("input[name='newUsername']").val()
			},
			method: "POST",
            success:function(result){
                if(result == "ok"){
					alert("사용 가능한 닉네임입니다 ^0^");
					unameChecked = true;
				}
				else{
					alert("다른 분이 이용중인 닉네임입니다 ㅠㅠ");
					unameChecked = true;
				}
            }
        })
    })

	$("#changeInfo").submit(function(){
		if (unameChecked && pwChecked) {
			return true;
		}
		else{
			alert("비밀번호 확인 및 닉네임 중복을 확인해주세요.");
			return false;
		}
	})
</script>
