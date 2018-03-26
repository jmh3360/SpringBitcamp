package com.bitcamp.web.mapperImpl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.BoardDTO;
import com.bitcamp.web.mapper.BoardMapper;

@Repository
public class BoardMapperImpl implements BoardMapper{
	String ns = "com.bitcamp.web.mapperImpl.BoardMapperImpl.";
	@Autowired SqlSessionTemplate sqlSession;
	
	@Override
	public void insertBoard(Command cmd) {
	}

	@Override
	public void updateBoard(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoard(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BoardDTO> selectAll(Command cmd) {
		return sqlSession.selectList(ns+"selectAll",cmd);
	}

	@Override
	public List<BoardDTO> selectByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardDTO selectById(Command cmd) {
		return sqlSession.selectOne(ns+"selectById",cmd);
	}

	@Override
	public int selectCount(Command cmd) {
		return sqlSession.selectOne(ns+"selectCount",cmd);
	}

}
