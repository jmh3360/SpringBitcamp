package com.bitcamp.web.mapperImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.FoodDTO;
import com.bitcamp.web.mapper.FoodMapper;

@Repository
public class FoodMapperImpl implements FoodMapper{

	@Override
	public void insertFood(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateFood(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFood(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<FoodDTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FoodDTO> selectByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FoodDTO selectById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
