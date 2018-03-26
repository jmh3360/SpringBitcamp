package com.bitcamp.web.serviceImpl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.AccountDTO;
import com.bitcamp.web.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	@Override
	public void addAccount(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyAccount(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAccount(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AccountDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountDTO> findByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountDTO findById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}
}
