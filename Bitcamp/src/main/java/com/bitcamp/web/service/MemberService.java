package com.bitcamp.web.service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;
import com.bitcamp.web.domain.MemberDTO;

public interface MemberService {
	public ResultMap findById (MemberDTO m);
	public ResultMap join(MemberDTO bean);
	public ResultMap login(Command cmd);
}
