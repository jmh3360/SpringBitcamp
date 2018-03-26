<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<div class="board_type1_wrap">
		<div class="board_type1_write_wrap">
			<table class="board_write_type1">
				<tr>
					<td class="left" >
						<div class="column_name">글제목</div>
						<div class="column_desc"><input type="text" name="title" class="text_type1"/></div>
					</td>
				</tr>
				<tr>
					<td class="left">
						<ul class="split_three">
							<li>
								<div class="column_name">닉네임</div>
								<div class="column_desc"><input type="text" name="nickName" class="text_type1"/></div>
							</li>
							<li>
								<div class="column_name">옵션</div>
								<div class="column_desc">
									<div>
									<table><tr>
										<td><a class="popup-with-form" href="#test-form"><span class="glyphicon glyphicon-cloud-upload" aria-hidden="true"> 파일업로드</span></a></td>
										<td style="width: 100px; height: 100px"><div style="float: left; width: 100px; height: 100px"><img style="width: 50px; height: 50px" src="${path.img}/${uploadImage}" alt="" /></div></td>
									</tr></table>
											<form id="test-form" class="mfp-hide white-popup-block" method="post" enctype="multipart/form-data" action="${path.context}/board/fileupload">
												<fieldset style="border:5px solid blue; height: 500px; width: 500px; background-color: white; margin-left: 550px;">
														<div style="text-align: center; color: black">
															<h1>FILE UPLOAD</h1>
														</div>
														<div style="text-align: center">
															<input type="file" size="30" name="file" style="display:inline-block; margin-top: 150px;"><br /><br /><br />
															<input style="margin-top: 100px" type="submit" value="업로드" class="btn btn-primary btn-lg"/>
															<input style="margin-top: 100px" type="reset" value="취 소" class="btn btn-default btn-lg"/>
														</div>
												</fieldset>
											</form>
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
							<textarea name="content" rows="" cols="" class="textarea_type1"></textarea>&nbsp;
						</div>
					</td>
				</tr>	
			</table>
		</div>
		<!-- ok -->
		<div class="button_margin"></div>
		<div class="board_type1_write_button_wrap">
			<div>
				<input type="submit" value="확 인"/>
				<input type="reset" value="취 소"/>
			</div>	
		</div>
	</div>
<script>
$(document).ready(function(){
	$('.popup-with-form').magnificPopup({
		type: 'inline',
		preloader: false,
		focus: '#name',

		// When elemened is focused, some mobile browsers in some cases zoom in
		// It looks not nice, so we disable it:
		callbacks: {
			beforeOpen: function() {
				if($(window).width() < 700) {
					this.st.focus = false;
				} else {
					this.st.focus = '#name';
				}
			}
		}
	});
});
$('#submit-btn').on('click',function(){
	$('#form-board-write')
	.attr('action','${path.context}/board/list')
	.attr('method','post').submit();
});

$('#file-upload').on('click',function(){
	app.move("board/fileupload");
});
</script>


