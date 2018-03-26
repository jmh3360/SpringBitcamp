package com.bitcamp.web.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.PhoneDTO;
import com.bitcamp.web.mapper.PhoneMapper;
import com.bitcamp.web.service.PhoneService;

@Service
public class PhoneServiceImpl implements PhoneService{
	@Autowired PhoneMapper mapper;
	
	@Override
	public void openPhone(Command cmd) {
		
	}
	@Override
	public List<PhoneDTO> phones() {
		return mapper.selectAll();
	}
	@Override
	public void addPhone(Command cmd) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void modifyPhone(Command cmd) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removePhone(Command cmd) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<PhoneDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<PhoneDTO> findByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public PhoneDTO findById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
