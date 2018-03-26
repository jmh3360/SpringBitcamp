package com.bitcamp.web.service;

import java.util.List;
import org.springframework.stereotype.Component;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.FoodDTO;

@Component
public interface FoodService {

	public void addFood(Command cmd);
	public void modifyFood(Command cmd);
	public void removeFood(Command cmd);
	public List<FoodDTO> list();
	public List<FoodDTO> findByName(Command cmd);
	public FoodDTO findById(Command cmd);
	public int count();


}
