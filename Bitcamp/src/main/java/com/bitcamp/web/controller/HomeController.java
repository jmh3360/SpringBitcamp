package com.bitcamp.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.bitcamp.web.factory.ContextFactory;
import com.bitcamp.web.factory.ShiftFactory;

@Controller
@SessionAttributes("path")
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired ContextFactory contextFactory;
	@Autowired ShiftFactory shift;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		model.addAttribute("serverTime", new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm")
				.format(new Date()));
		model.addAttribute("path",contextFactory.path());
		return shift.create().toString();
	}
	@RequestMapping(value = "/move/{dir}/{page}", method = RequestMethod.GET)
	public String move(@PathVariable("dir")String dir, @PathVariable("page")String page) {
		logger.info(" Move To {} ", dir+"/"+page);
		return shift.create(dir, page);
	}
}
