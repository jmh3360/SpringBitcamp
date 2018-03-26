package com.bitcamp.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MemberDTO;

@Component
public interface MemberService {
	public void addMember(Command cmd);
	public MemberDTO findMemberById(Command cmd);
	public boolean exist(Command cmd);
	public void modifyMember(Command cmd);
	public void removeMember(Command cmd);
	public List<MemberDTO> list();
	public List<MemberDTO> findByName(Command cmd);
	public MemberDTO findById(Command cmd);
	public int count();


}
