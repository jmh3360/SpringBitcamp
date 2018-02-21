package com.bitcamp.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitcamp.web.factory.ContextFactory;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	//컴포넌트 된 것을 오토와이어로 연결하여 사용할 수 있다
	@Autowired ContextFactory contextFactory;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		model.addAttribute("serverTime", new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm").format(new Date()));
		//cf에서 타입은 object를 준 이유는 사용하는 곳에 따라 casting을 하여 범용적으로 사용하게 하기 위해
		model.addAttribute("context",(String) contextFactory.create());
		
		return "index";
	}
	@RequestMapping(value="/home",method=RequestMethod.GET)
	//위에 홈이 있어도 상관없는 이유는 오버로드이다.
	public String home(Model model) {
		model.addAttribute("context",(String) contextFactory.create());
		model.addAttribute("js",contextFactory.path("js"));
		model.addAttribute("img",contextFactory.path("img"));
		model.addAttribute("css",contextFactory.path("css"));
		return "main/home";
	}
}
