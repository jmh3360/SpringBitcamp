package com.bitcamp.web.domain;

import lombok.Data;

@Data
public class MobileDTO {
	String mobileNum,regDate;

	@Override
	public String toString() {
		return "모바일 정보 [전화번호=" + mobileNum + ", 가입일=" + regDate + "]";
	} 
	
}
