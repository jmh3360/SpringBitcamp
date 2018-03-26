package com.bitcamp.web.mapperImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.AdminDTO;
import com.bitcamp.web.mapper.AdminMapper;

@Repository
public class AdminMapperImpl implements AdminMapper{

	@Override
	public void insertAdmin(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAdmin(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAdmin(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AdminDTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminDTO> selectByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdminDTO selectById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
