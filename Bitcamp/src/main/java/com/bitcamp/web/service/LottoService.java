package com.bitcamp.web.service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;

public interface LottoService {
	public ResultMap selectLottoById(Command cmd);

}
