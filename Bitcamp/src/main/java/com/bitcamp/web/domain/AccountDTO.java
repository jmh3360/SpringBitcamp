package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
public class AccountDTO {
	private String 
		accSeq,accountNum,money,id;	
}
