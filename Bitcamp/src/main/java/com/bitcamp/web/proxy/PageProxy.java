package com.bitcamp.web.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Component;

import com.bitcamp.web.adapter.PageAdapter;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.Page;
import com.bitcamp.web.service.BoardService;

@Component
public class PageProxy extends Proxy{
	@Autowired PageAdapter adapter;
    @Autowired Command cmd;
    @Autowired BoardService boardService;
    @Autowired Page page;
 
    @Override
    public void execute(Model model, Object o) {
    	cmd = adapter.attr((Page)o);
    	page = cmd.getPaging();
    	model.addAttribute("page",page);
    	model.addAttribute("list",boardService.list(cmd));
        
    }
}