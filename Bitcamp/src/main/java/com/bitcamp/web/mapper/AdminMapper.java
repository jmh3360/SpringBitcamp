package com.bitcamp.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.AdminDTO;

@Service
@Component
public interface AdminMapper {
	public void insertAdmin(Command cmd);
	public void updateAdmin(Command cmd);
	public void deleteAdmin(Command cmd);
	public List<AdminDTO> selectAll();
	public List<AdminDTO> selectByName(Command cmd);
	public AdminDTO selectById(Command cmd);
	public int selectCount();


}
