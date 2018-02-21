package com.bitcamp.web.command;

import java.util.Map;

import com.bitcamp.web.domain.AccountDTO;
import com.bitcamp.web.domain.AttendDTO;
import com.bitcamp.web.domain.FoodDTO;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.domain.MobileDTO;
import com.bitcamp.web.enums.Action;
import com.bitcamp.web.enums.Enums.TABLE;

import lombok.Data;

@Data
public class Command  {
	protected String dir,page,search,column,cmd,data,view;
	protected Action action;
	protected Map<?, ?> cmap;
	protected TABLE table;
	protected MemberDTO member;
	protected AccountDTO account;
	protected AttendDTO attend;
	protected LottoDTO lotto;
	protected FoodDTO food;
	protected MobileDTO mobile;

	
	}


