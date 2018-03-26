package com.bitcamp.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.PhoneDTO;

@Component
@Service
public interface PhoneMapper {

	public List<PhoneDTO> selectAll();
	public void insertPhone(Command cmd);
	public void updatePhone(Command cmd);
	public void deletePhone(Command cmd);
	public List<PhoneDTO> selectByName(Command cmd);
	public PhoneDTO selectById(Command cmd);
	public int selectCount();



}
