package com.bitcamp.web.mapperImpl;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.TxDTO;
import com.bitcamp.web.mapper.TxMapper;

@Repository
public class TxMapperImpl implements TxMapper{
	@Autowired SqlSessionTemplate sqlSession;
	
	@Override
	public void insertPhone(Command cmd) {
		sqlSession.insert("insertPhone",cmd);
	}

	@Override
	public void insertTx(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTx(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTx(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TxDTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TxDTO> selectByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TxDTO selectById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
