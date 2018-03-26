package com.bitcamp.web.serviceImpl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.AdminDTO;
import com.bitcamp.web.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{

	@Override
	public void addAdmin(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyAdmin(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAdmin(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AdminDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminDTO> findByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdminDTO findById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
