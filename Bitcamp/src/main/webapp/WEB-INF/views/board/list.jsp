<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<h1 style="text-align: center"><mark>게시판</mark></h1>
	<div class="board_type1_wrap">
		<table class="board_list_type1">
			<thead>
				<tr>
					<th></th>
					<th class="active_type">번호</th>
					<th>제목</th>
					<th class="active_type">작성자</th>
					<th class="active_type">작성날짜</th>
				</tr>
			</thead>
			<c:forEach items="${list}" step="1" var="article" varStatus="">
				<tbody>
					<tr>
						<td><input type="checkbox" /></td>
						<td class="active_type">${article.bbsSeq}</td>
						<td class="left">
						<a href="#" onclick="app.boardDetail/${article.bbsSeq};return false;">
						${article.title}
						</a>
						</td>
						<td class="active_type">${article.nickName}</td>
						<td class="active_type">${article.regdate}</td>
					</tr>
				</tbody>
			</c:forEach>
		</table>
		<nav style="text-align:center;">
  <ul class="pagination">
  	<c:if test="${page.prevBlock}">
  		<li>
	      	<a href="#" aria-label="Previous" onclick="app.boardList(${page.pageEnd-page.pageSize});return false;">
	        	<span aria-hidden="true">&laquo;</span>
	      	</a>
    	</li>
  	</c:if>
  	
	<c:forEach begin="${page.pageStart}" end="${page.pageEnd}"  step="1"  varStatus="i">
 
        <c:choose>
              <c:when test="${i.index eq page.pageNum}">
               	<li>
           			<a style="color: red" href="${path.context}/board/list?pageNum=${i.index}">${i.index}</a>
               	</li>
               </c:when>
               
               <c:otherwise>
               	<li>
           			<a href="${path.context}/board/list?pageNum=${i.index}">${i.index}</a>
               	</li>
               </c:otherwise>
         </c:choose>
      </c:forEach>
  	
  	<c:if test="${page.nextBlock}">
	  	<li>
	      <a href="#" aria-label="Next" onclick="app.boardList(${page.pageStart+page.pageSize});return false;">
	        <span aria-hidden="true">&raquo;</span>
	      </a>
	    </li>
  	</c:if>
  </ul>
</nav>
		<div>
			총 게시글 수 : ${page.totalCount} 개
		</div>
		<div>
	<button id="btn-write" style="margin-left: 80%; width: 200px; height: 50px">글쓰기</button>
	</div>
	</div>
<script>
$('#btn-write').click(function(){
		app.move("board/write");
});	
</script>