package com.bitcamp.web.service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;

public interface FoodService {
	public ResultMap selectFoodById(Command cmd);

}
