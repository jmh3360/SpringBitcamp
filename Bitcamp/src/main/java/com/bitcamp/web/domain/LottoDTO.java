package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class LottoDTO {
	private String randomNumber, lottoNumber, money, count;
}
