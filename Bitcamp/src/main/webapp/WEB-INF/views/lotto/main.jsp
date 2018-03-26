<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
#kakao_nav {float:left; width: 10%; text-align: left}
#kakao_nav ul {list-style-type: none; margin: 0; padding-top: 40px; width: 100%; height: 620px; background-color: #f1f1f1}
#kakao_nav li a{display: block; height:30px; color: #000; margin-top: -11px; margin-bottom: -10px; padding: 8px 16px; 
	font-weight: bold; text-decoration: none; font-size: 15px}
#kakao_nav li a:hover {background-color: #555; color: white}
#kakao_nav li a.active {background-color: #4CAF50; color: white}

.lotto_menu_btn {margin-top: 30px}
.lotto_menu_btn button {width:200px; height: 350px; font-size: 30px; font-weight: bold; color: #333333; background-color: #ffdc00;
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19)}
.kakao_menu_btn button:hover {background-color: #555; color: white}}
</style>
<div>
<div id="kakao_nav">
	<ul>
		<li><a class="active" >Lotto</a><br /></li>
	</ul>
</div>
<section>
<article>
<h1 style ="text-align: left; padding: 15px; text-indent: 15px">Lotto</h1>
<div class="lotto_menu_btn">
	<button id="lotto-1-btn" value="1000">로또 1줄 구매<br />1000원</button>&nbsp;&nbsp;&nbsp; 
	<button id="lotto-2-btn" value="2000">로또 2줄 구매<br />2000원</button>&nbsp;&nbsp;&nbsp; 
	<button id="lotto-3-btn" value="3000">로또 3줄 구매<br />3000원</button>&nbsp;&nbsp;&nbsp; 
	<button id="lotto-4-btn" value="4000">로또 4줄 구매<br />4000원</button>&nbsp;&nbsp;&nbsp; 
	<button id="lotto-5-btn" value="5000">로또 5줄 구매<br />5000원</button>
	
</div>
</article>
</section>
<aside>
</aside>
</div>
<script>
	$('#lotto-1-btn').on('click',function(){
		var money = $('#lotto-1-btn').val();
		location.href = "${path.context}/lotto/"+money;
	});
	$('#lotto-2-btn').on('click',function(){
		var money = $('#lotto-2-btn').val();
		location.href = "${path.context}/lotto/"+money;
	});
	$('#lotto-3-btn').on('click',function(){
		var money = $('#lotto-3-btn').val();
		location.href = "${path.context}/lotto/"+money;
	});
	$('#lotto-4-btn').on('click',function(){
		var money = $('#lotto-4-btn').val();
		location.href = "${path.context}/lotto/"+money;
	});
	$('#lotto-5-btn').on('click',function(){
		var money = $('#lotto-5-btn').val();
		location.href = "${path.context}/lotto/"+money;
	});
</script>