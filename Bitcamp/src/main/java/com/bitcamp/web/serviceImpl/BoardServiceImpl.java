package com.bitcamp.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.BoardDTO;
import com.bitcamp.web.mapper.BoardMapper;
import com.bitcamp.web.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired BoardMapper mapper;
	
	@Override
	public void addBoard(Command cmd) {
		
	}

	@Override
	public void modifyBoard(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeBoard(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BoardDTO> list(Command cmd) {
		return mapper.selectAll(cmd);
	}

	@Override
	public List<BoardDTO> findByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardDTO findById(Command cmd) {
		return (mapper.selectById(cmd));
	}

	@Override
	public int count(Command cmd) {
		return (mapper.selectCount(cmd));
	}

}
