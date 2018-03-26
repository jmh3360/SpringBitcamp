package com.bitcamp.web.service;

import java.util.List;

import org.springframework.stereotype.Component;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.TxDTO;

@Component
public interface TxService {
	
	public void addTx(Command cmd);
	public void modifyTx(Command cmd);
	public void removeTx(Command cmd);
	public List<TxDTO> list();
	public List<TxDTO> findByName(Command cmd);
	public TxDTO findById(Command cmd);
	public int count();
	public void openPhone(Command cmd);
	public String createPhoneNum(Command cmd);
}
