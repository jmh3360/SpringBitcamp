package com.bitcamp.web.service;

import java.util.List;
import org.springframework.stereotype.Component;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.AccountDTO;

@Component
public interface AccountService {

	public void addAccount(Command cmd);
	public void modifyAccount(Command cmd);
	public void removeAccount(Command cmd);
	public List<AccountDTO> list();
	public List<AccountDTO> findByName(Command cmd);
	public AccountDTO findById(Command cmd);
	public int count();


}
