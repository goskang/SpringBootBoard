package com.gos.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gos.board.model.BoardModel;
import com.gos.board.mapper.BoardMapper;

@Service
public class BoardService {
	@Autowired
	public BoardMapper mapper;
	
	public List<BoardModel> getBoard(){
		return mapper.getBoard();
	}
}
