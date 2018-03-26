package com.bitcamp.web.service;

import java.util.List;
import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.LottoDTO;

@Component
public interface LottoService {
	public LottoDTO findLottoCount(LottoDTO param);
	public LottoDTO createLotto();
	public List<LottoDTO> createLottos(LottoDTO param);
	public void addLotto(Command cmd);
	public void modifyLotto(Command cmd);
	public void removeLotto(Command cmd);
	public List<LottoDTO> list();
	public List<LottoDTO> findByName(Command cmd);
	public LottoDTO findById(Command cmd);
	public int count();


}
