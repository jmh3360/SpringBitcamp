package com.bitcamp.web.mapperImpl;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.PhoneDTO;
import com.bitcamp.web.mapper.PhoneMapper;

@Repository
public class PhoneMapperImpl implements PhoneMapper{
	@Autowired SqlSessionTemplate sqlSession;
	
	@Override
	public List<PhoneDTO> selectAll() {
		return sqlSession.selectList("list");
	}

	@Override
	public void insertPhone(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePhone(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePhone(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PhoneDTO> selectByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PhoneDTO selectById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
