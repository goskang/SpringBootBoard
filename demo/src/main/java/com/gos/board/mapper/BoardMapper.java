package com.gos.board.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;

@Repository
@Mapper
public interface BoardMapper<BoardModel> {
	List<BoardModel> getBoard();
}
