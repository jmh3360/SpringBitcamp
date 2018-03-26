package com.bitcamp.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.LottoDTO;

@Service
@Component
public interface LottoMapper {
	public void insertLotto(Command cmd);
	public void updateLotto(Command cmd);
	public void deleteLotto(Command cmd);
	public List<LottoDTO> selectAll();
	public List<LottoDTO> selectByName(Command cmd);
	public LottoDTO selectById(Command cmd);
	public int selectCount();


}
