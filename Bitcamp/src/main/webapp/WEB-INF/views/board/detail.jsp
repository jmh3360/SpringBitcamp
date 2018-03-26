<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<form action="" id="form-board-write">
	<div class="board_type1_wrap">
		<div class="board_type1_write_wrap">
			<table class="board_write_type1">
				<tr>
					<td class="left" >
						<div class="column_name">글제목</div>
						<div class="column_desc"><input type="text" name="title" class="text_type1" value="${detail.title}"/></div>
					</td>
				</tr>
				<tr>
					<td class="left">
						<ul class="split_three">
							<li>
								<div class="column_name">닉네임</div>
								<div class="column_desc"><input type="text" name="nickName" class="text_type1" value="${detail.nickName}"/></div>
							</li>
							<li>
								<div class="column_name">비밀번호</div>
								<div class="column_desc"><input type="text" name="" class="text_type1"/></div>
							</li>
							<li>
								<div class="column_name">옵션</div>
								<div class="column_desc">
									<div class="checkwrap_type1">
										<input type="checkbox" id="main_exposure" value="main" class="check_type1" /><label for="main_exposure">메인노출</label>
									</div>
									<div class="checkwrap_type1">
										<input type="checkbox" id="notice" value="notice" class="check_type1" /><label for="notice">공지여부</label>
									</div>
								</div>
							</li>	
						</ul>
					</td>
				</tr>
				<tr>
					<td class="left" >
						<div class="column_name">내용</div>
						<div class="column_desc">
							<textarea name="content" rows="" cols="" class="textarea_type1">${detail.content}</textarea>
						</div>
					</td>
				</tr>	
			</table>
		</div>
		<div class="button_margin"></div>
		<div class="board_type1_write_button_wrap">
			<div class="write_button_right">
				<button id="submit-btn" type="button" class="button button_type1">수정하기</button>
			</div>
			<div class="write_button_left">
				<button type="button" class="button button_type2">목록가기</button>
			</div>
		</div>
	</div>
	<div class="margin"></div>
</form>
<script>
$('#submit-btn').on('click',function(){
	$('#form-board-write')
	.attr('action','${path.context}/board/list')
	.attr('method','post').submit();
});
</script>


