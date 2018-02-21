package com.bitcamp.web.domain;

import lombok.Data;

@Data
public class AccountDTO {
	private String accountNum,money,customerNum;

	@Override
	public String toString() {
		return "계좌번호 [계좌번호=" + accountNum + ", 잔액=" + money + ", 고객번호=" + customerNum + "]";
	}

	
}
