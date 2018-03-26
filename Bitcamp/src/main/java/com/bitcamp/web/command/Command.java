package com.bitcamp.web.command;

import org.springframework.stereotype.Component;
import com.bitcamp.web.domain.AccountDTO;
import com.bitcamp.web.domain.BoardDTO;
import com.bitcamp.web.domain.FoodDTO;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.domain.PhoneDTO;
import com.bitcamp.web.domain.TxDTO;
import com.bitcamp.web.enums.Action;
import com.bitcamp.web.enums.Table;

import lombok.Data;

@Data
@Component
public class Command{
	protected String cmd,dir,page,view,column,data;
	protected Action action;
	protected Table table;
	protected MemberDTO member;
	protected AccountDTO account;
	protected BoardDTO attend;
	protected LottoDTO lotto;
	protected FoodDTO food;
	protected PhoneDTO phone;
	protected TxDTO tx;
	protected BoardDTO board;
	protected Page paging;
}
