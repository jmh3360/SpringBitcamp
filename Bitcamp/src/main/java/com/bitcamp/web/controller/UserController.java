package com.bitcamp.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.factory.ContextFactory;
import com.bitcamp.web.factory.ShiftFactory;
import com.bitcamp.web.mapper.MemberMapper;
import com.bitcamp.web.service.LottoService;
import com.bitcamp.web.service.MemberService;


@SessionAttributes("user")
@Controller
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired ContextFactory contextfactory;
	@Autowired LottoService service;
	@Autowired LottoDTO lotto;
	@Autowired MemberService mService;
	@Autowired MemberMapper mapService;
	@Autowired MemberDTO member;
	@Autowired Command cmd;
	@Autowired ShiftFactory shift;
	
	
	@RequestMapping("/login/{userid}/{password}")
	public String login(Model model,
			@PathVariable("userid")String userid,
			@PathVariable("password")String password
			) {
		logger.info("UserController login() ID is {} ", userid);
		logger.info("UserController login() PASS is {} ", password);
		member.setId(userid);
		member.setPass(password);
		cmd.setMember(member);
		String path = shift.create("user", "login");
		if(mService.exist(cmd)) {
			model.addAttribute("user", mService.findMemberById(cmd));
			path = shift.create("user", "mypage");
		}
		return path;
	}
	@RequestMapping("/logout")
	public String logout(SessionStatus status) {
		status.setComplete();
		logger.info("[컨드롤러 : 로그아웃]");
		return shift.redirect("user", "login");
	}
	@RequestMapping("/join/{id}/{pass}/{name}")
	public String join(@PathVariable("id")String id,@PathVariable("pass")String pass,@PathVariable("name")String name) {
		logger.info("[컨드롤러 : 조인]");
		logger.info("UserController join() ID is {} ", id);
		logger.info("UserController join() PASS is {} ", pass);
		logger.info("UserController join() PASS is {} ", name);
		member.setId(id);
		member.setPass(pass);
		member.setName(name);
		cmd.setMember(member);
		mService.addMember(cmd);
		return shift.redirect("user", "login");
	}
	@RequestMapping("/mypage")
	public String mypage() {
		return shift.create("user", "mypage");
	}
	@RequestMapping("/lotto/{money}")
	public String lotto(@PathVariable String money, Model model) {
		logger.info("===UserController lotto() Money is {} ===", money);
		lotto.setMoney(money);
		model.addAttribute("lottos", service.createLottos(lotto));
		model.addAttribute("money", money);
		return shift.create("lotto", "result");
	}
}
