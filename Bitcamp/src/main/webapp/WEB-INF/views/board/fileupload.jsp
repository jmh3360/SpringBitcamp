<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<title>파일 업로드</title>
<div style="text-align: center">
<h1>FILE UPLOAD</h1>
</div>
<div style="text-align: center">
<form action="fileuploadAction.jsp" method="POST" enctype="multipart/form-data">
<input type="file" size="30" name="test_file" style="display:inline-block;"><br /><br /><br />
<button type="submit" class="btn btn-primary btn-lg">확 인</button>
<button type="button" class="btn btn-default btn-lg">취 소</button>
</form>
</div>

