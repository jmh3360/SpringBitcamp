package com.bitcamp.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.FoodDTO;

@Service
@Component
public interface FoodMapper {
	public void insertFood(Command cmd);
	public void updateFood(Command cmd);
	public void deleteFood(Command cmd);
	public List<FoodDTO> selectAll();
	public List<FoodDTO> selectByName(Command cmd);
	public FoodDTO selectById(Command cmd);
	public int selectCount();


}
