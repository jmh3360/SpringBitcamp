<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<form action="/login" method="post" class="auth-form" id="login" style="z-index: 10001; display: block;">
        <h2 class="text-center">로그인</h2>
        <div class="form-group">
            <label class="label" for="form-login-id">아이디</label>
            <input type="text" name="id" id="form-login-id" class="border-input" autofocus="autofocus">
        </div>
        <div class="form-group">
            <label class="label" for="form-login-password">비밀번호</label>
            <input type="password" name="password" id="form-login-password" class="border-input">
        </div>
        <div class="form-group">
            <div class="wrap-check">
                <input type="checkbox" id="save_session" name="save_session" value="1" class="hidden">
                <label class="check" for="save_session"></label>
                <label for="save_session">로그인 상태 유지</label>
            </div>
        </div>
        <div class="wrap-btn">
            <button type="submit" class="btn mint long">로그인</button>
            <button class="btn gray close">닫기</button>
        </div>
                <div class="form-group auth-help">
            <div class="clearfix">
                <a href="#join" class="show-join pull-left">아이디가 없나요?</a>
                <a href="/findid" class="find-user pull-right">아이디/비밀번호 찾기</a>
            </div>
        </div>
    </form>