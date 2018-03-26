package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
public class TxDTO {
	private String txKey,id,count,total,regdate,telecom,phoneNum;
	private FoodDTO food;
	private PhoneDTO phone;
}
