package com.bitcamp.web.service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;

public interface MobileService {

	public ResultMap openPhone(Command id);

	public ResultMap findMobileById(Command cmd);


}
