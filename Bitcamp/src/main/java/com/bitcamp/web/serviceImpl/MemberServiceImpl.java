package com.bitcamp.web.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.mapper.MemberMapper;
import com.bitcamp.web.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{
	private static final Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);
	@Autowired MemberDTO member;
	@Autowired MemberMapper mapper;

	@Override
	public void addMember(Command cmd) {
		mapper.insertMember(cmd);
		
	}

	@Override
	public MemberDTO findMemberById(Command cmd) {
		return (mapper.selectMemberById(cmd));
	}

	@Override
	public boolean exist(Command cmd) {
		logger.info("MemberServiceImpl login() ID is {} ", cmd.getMember().getId());
		return (mapper.exist(cmd) != 0);
	}

	@Override
	public void modifyMember(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeMember(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MemberDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberDTO> findByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDTO findById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
