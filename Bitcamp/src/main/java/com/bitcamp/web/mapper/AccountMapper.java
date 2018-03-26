package com.bitcamp.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.AccountDTO;

@Service
@Component
public interface AccountMapper {
	public void insertAccount(Command cmd);
	public void updateAccount(Command cmd);
	public void deleteAccount(Command cmd);
	public List<AccountDTO> selectAll();
	public List<AccountDTO> selectByName(Command cmd);
	public AccountDTO selectById(Command cmd);
	public int selectCount();


}
