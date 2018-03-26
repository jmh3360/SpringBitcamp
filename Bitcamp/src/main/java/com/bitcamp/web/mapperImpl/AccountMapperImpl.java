package com.bitcamp.web.mapperImpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.AccountDTO;
import com.bitcamp.web.mapper.AccountMapper;

@Repository
public class AccountMapperImpl implements AccountMapper{

	@Override
	public void insertAccount(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAccount(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccount(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AccountDTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountDTO> selectByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountDTO selectById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
