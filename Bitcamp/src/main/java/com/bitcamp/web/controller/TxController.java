package com.bitcamp.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.domain.TxDTO;
import com.bitcamp.web.factory.ShiftFactory;
import com.bitcamp.web.service.TxService;

@SessionAttributes("user")
@Controller
public class TxController {
	private static final Logger logger = LoggerFactory.getLogger(TxController.class);
	@Autowired ShiftFactory shift;
	@Autowired Command cmd;
	@Autowired TxDTO tx;
	@Autowired TxService service;
	
	@RequestMapping(value="/mobile/openphone",method=RequestMethod.POST)
	public String openPhone(Model model,@RequestParam("phoneSeq") String phoneSeq, @RequestParam("telecom") String telecom, @ModelAttribute("user") MemberDTO member) {
		logger.info("PhoneController phoneSeq() phoneSeq is {} ", phoneSeq);
		logger.info("PhoneController telecom() telecom is {} ", telecom);
		tx.setTxKey(member.getId()+phoneSeq);
		tx.setId(member.getId());
		tx.setCount("1");
		tx.setTotal("1");
		tx.setTelecom(telecom);
		tx.setPhoneNum(service.createPhoneNum(cmd));
		System.out.println("핸드폰 번호 : "+tx.getPhoneNum());
		System.out.println("핸드폰 아이디 : "+tx.getTxKey());
		System.out.println("통신사 : "+tx.getTelecom());
		System.out.println("멤버ID : "+member.getId());
		cmd.setTx(tx);
		service.openPhone(cmd);
		return shift.create("user", "mypage");
	}

}
