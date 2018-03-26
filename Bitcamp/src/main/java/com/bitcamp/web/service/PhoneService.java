package com.bitcamp.web.service;

import java.util.List;
import org.springframework.stereotype.Component;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.PhoneDTO;

@Component
public interface PhoneService {

	public void openPhone(Command cmd);
	public List<PhoneDTO> phones();
	public void addPhone(Command cmd);
	public void modifyPhone(Command cmd);
	public void removePhone(Command cmd);
	public List<PhoneDTO> list();
	public List<PhoneDTO> findByName(Command cmd);
	public PhoneDTO findById(Command cmd);
	public int count();



}
