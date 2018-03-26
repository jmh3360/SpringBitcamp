<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style>
    .navbar-brand {
        padding-top: 0px;
    }
</style>
    <nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">
		<img style="height: 130%" src="${path.img}/common/logo.jpg" alt="" />
	  </a>
    </div>
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li id="a-home" class="active"><a href="#">
        	<span class="glyphicon glyphicon-home" aria-hidden="true"> HOME</span></a></li>
        <li><a id="a-about" href="#">
        	<span class="glyphicon glyphicon-map-marker" aria-hidden="true"> about</span>
        </a></li>
        <li><a id="span-board" href="#">
        	<span class="glyphicon glyphicon-map-marker" aria-hidden="true"> 게시판</span>
        </a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"  aria-expanded="false"> 선택 <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a id="a-burgerking" href="#"> 버거킹 </a></li>
            <li><a id="a-kakao" href="#"> 카카오뱅크 </a></li>
            <li><a id="a-bitcamp" href="#"> 비트캠프 </a></li>
            <li><a id="a-mobile" href="#"> 모바일 </a></li>
            <li><a id="a-lotto" href="#"> 로또 </a></li>
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-left" role="search">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">검 색</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">
          	<span class="glyphicon glyphicon-user" aria-hidden="true"></span>
          <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a id="a-mypage" href="#"> 
            	<span class="glyphicon glyphicon-user" aria-hidden="true"> 마이페이지 </span>
                </a></li>
                <c:choose>
                <c:when test="${user eq null}">
                    <li>
                        <a id="a-login" href="#"> 
                            <span class="glyphicon glyphicon-user" aria-hidden="true">&nbsp;로그인</span>
                        </a>
                        <a id="a-join" href="#"> 
                            <span class="glyphicon glyphicon-plus-sign" aria-hidden="true">&nbsp;회원가입</span>
                        </a>
                    </li>
                </c:when>
                <c:otherwise>
                    <li>
                        <a id="a-logout" href="#">
                            <span class="glyphicon glyphicon-log-out" aria-hidden="true">&nbsp;로그아웃</span>
                        </a>
                    </li>                
                </c:otherwise>
                </c:choose>
          </ul>
      </ul>
    </div>
  </div>
</nav>
<script>
	$('#a-login').on('click',function(){
		app.move("user/login");
	});
	$('#a-burgerking').on('click',function(){
		app.move("burgerking/main");
	});
	$('#a-bitcamp').on('click',function(){
		app.move("bitcamp/main");
	});
	$('#a-lotto').on('click',function(){
		app.move("lotto/main");
	});
	$('#a-kakao').on('click',function(){
		app.move("account/main");
	});
	$('#a-mobile').on('click',function(){	
		app.move("mobile/main");
	});
	$('#a-logout').on('click',function(){	
		location.href = '${path.context}/logout';
	});
	$('#a-mypage').on('click',function(){	
		location.href = '${path.context}/mypage';
	});
	$('#a-home').on('click',function(){	
		app.move("home");
	});
	$('#a-join').on('click',function(){	
		app.move("user/join");
	});
	$('#span-board').on('click',function(){
		alert('borad/list 이동');
		app.boardList(1);
    });
</script>
		
		
		