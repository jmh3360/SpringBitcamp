<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<table style="margin: 0 auto;height: 400px;border: 2px">
	<tr>
	<td style="width: 150px">아이디</td>
	<td>
		<input id="join_id" name="join_id" style="margin-right: 88px" type="text" />
		<button id="check_dupl_btn" name="check_dupl_btn">중복확인</button>
	</td>
	</tr>
	
	<tr>
	<td>이름</td>
	<td><input id="join_name" name="name"  style="margin-right: 150px"  type="text" /></td>
	</tr>
	
	<tr>
	<td>암호</td>
	<td><input id="join_pass" name="pass"   style="margin-right: 150px" type="password" /></td>
	</tr>
	
	<tr>
	<td>암호확인</td>
	<td><input name="confirm_pass"   style="margin-right: 150px" type="password" /></td>
	</tr>
	
	<tr>
	<td>이메일</td>
	<td><input name="email" style="margin-right: 41px" type="email" />@<select>
	<option>naver.com</option>
	<option>daum.com</option>
	<option>google.com</option>
	</select>
	</td>
	</tr>
	<tr>
	<td>가입일</td>
	<td><input name="join_date" type="date" /></td>
	</tr>
	<tr>
	<td>주민번호</td>
	<td><input name="ssn" type="text" />-<input type="number" placeholder="" min="1" max="9"/></td>
	</tr>
	
	<tr>
	<td>핸드폰번호</td>
	<td>
	<input type="radio" name="phone" checked="checked"/>SKT
	<input type="radio" name="phone" />KT
	<input type="radio" name="phone" />LG
	<br />
	<select>
	<option>010</option>
	</select>
	<input pattern="[0-9]{4}" type="text" />
	<input pattern="[0-9]{4}" type="text" />
	</td>
	</tr>
	
	<tr>
	<td>주소</td>
	<td>
	<input name="addr" type="button" value="주소검색"/>
	<input type="text" />
	<input type="hidden" name="cmd" value="insert" />
	<input type="hidden" name="dir" value="user" />
	<input type="hidden" name="page" value="login" />
	</td>
	</tr>
	<tr>
		<td colspan="2" style="text-align: center;">
			<button id="join_confirm_btn" style="width: 160px; height: 30px">확 인</button> 
			<button style="width: 160px; height: 30px">취 소</button>
		</td>
	</tr>
	</table>
<script>
$('#join_confirm_btn').on('click',function(){
	var id = $('#join_id').val();
	var pass = $('#join_pass').val();
	var name = $('#join_name').val();
	location.href = "${path.context}/join/"+id+"/"+pass+"/"+name;
});
</script>








