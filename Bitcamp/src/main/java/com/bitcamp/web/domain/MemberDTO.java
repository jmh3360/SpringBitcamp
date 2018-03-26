package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class MemberDTO {
	private String id,pass,name,ssn,
				phone,email,profile,addr;
	private AccountDTO account;
	private PhoneDTO mobile;
	private LottoDTO lotto;
	private FoodDTO food;
}
