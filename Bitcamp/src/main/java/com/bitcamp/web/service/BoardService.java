package com.bitcamp.web.service;

import java.util.List;
import org.springframework.stereotype.Component;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.BoardDTO;

@Component
public interface BoardService {

	public void addBoard(Command cmd);
	public void modifyBoard(Command cmd);
	public void removeBoard(Command cmd);
	public List<BoardDTO> list(Command cmd);
	public List<BoardDTO> findByName(Command cmd);
	public BoardDTO findById(Command cmd);
	public int count(Command cmd);


}
