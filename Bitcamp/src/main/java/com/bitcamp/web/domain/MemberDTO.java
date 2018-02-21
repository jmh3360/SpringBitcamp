package com.bitcamp.web.domain;

import lombok.Data;

@Data
public class MemberDTO {
	private String id, pass, name, ssn, 
						phone, email, profile, addr;
	private AccountDTO account;
	private MobileDTO mobile;
	private LottoDTO lotto;
	private FoodDTO food;

	@Override
	public String toString() {
		String temp = "";
		if(account == null) {
			temp = "회원정보 [ID: " + id + ", 비밀번호: " + pass + ", 이름: " + name + ", 주민번호(앞 여덟자리): " + ssn + ", 전화번호: " + phone
					+ ", 이메일: " + email + ", 프로필사진: " + profile + ", 주소: " + addr +"]";
		}else {
			temp = "회원정보 [ID: " + id + ", 비밀번호: " + pass + ", 이름: " + name + ", 주민번호(앞 여덟자리): " + ssn + ", 전화번호: " + phone
			+ ", 이메일: " + email + ", 프로필사진: " + profile + ", 주소: " + addr +"account" +account+"]";
		}
		return temp;
	}
	
}
