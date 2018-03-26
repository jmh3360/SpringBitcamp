package com.bitcamp.web.service;

import java.util.List;
import org.springframework.stereotype.Component;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.AdminDTO;

@Component
public interface AdminService {

	public void addAdmin(Command cmd);
	public void modifyAdmin(Command cmd);
	public void removeAdmin(Command cmd);
	public List<AdminDTO> list();
	public List<AdminDTO> findByName(Command cmd);
	public AdminDTO findById(Command cmd);
	public int count();



}
