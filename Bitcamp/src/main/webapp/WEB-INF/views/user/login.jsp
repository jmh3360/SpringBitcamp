<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<section>
		<script src="${js}/jquery-3.3.1.min.js"></script>
<article>
	<table id="login-inner-table">
		<tr>
		<td><input id="login-userid-input" name="userid"
							type="text" value="skyfor1004" placeholder="ID" tabindex="1" />
		</td>
		<td rowspan="2">
			<button id="login-btn">LOGIN</button>
		</td>
		</tr>
		<tr>
			<td><input id="login-password-input" name="password"
				type="password" value="1" placeholder="PASSWORD" tabindex="2" />
				<input type="hidden" name="cmd" value="login" />
				<input type="hidden" name="page" value="mypage" />
			</td>
		</tr>
	</table> 
 <a id="login-admin-link" href="#"> 관리자 </a>
<a id="login-join-link" href="#"> 회원가입 </a>
</article>
</section>
<script>
$('#login-btn').on('click',function(){
	var userid = $('#login-userid-input').val();
	var password = $('#login-password-input').val();
	location.href = "${path.context}/login/"+userid+"/"+password;
});
</script>











