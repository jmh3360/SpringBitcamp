package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
public class FoodDTO {
	private String foodSeq, menu, price;
}
