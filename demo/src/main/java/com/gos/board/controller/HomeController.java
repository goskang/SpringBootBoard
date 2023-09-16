package com.gos.board.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gos.board.model.BoardModel;
import com.gos.board.model.BoardModel.BoardModelBuilder;
import com.gos.board.service.BoardService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
		@Autowired
		BoardService boardService;
		
		//로그 설정
		private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	
//		@RequestMapping("/home")
//		public String goHome(HttpServletRequest req) {
//			return "content/home";
//		}
		
		@RequestMapping("/home")
		public ModelAndView goHomeList(HttpServletRequest req) {
			
			//로그 단계별 남기기
			LOG.trace("Trace Level 테스트");
			LOG.debug("DEBUG Level 테스트");
			LOG.info("INFO Level 테스트");
			LOG.warn("Warn Level 테스트");
			LOG.error("ERROR Level 테스트");
	        
			ModelAndView mav = new ModelAndView();
			
//			List<String> list = new ArrayList<String>();
//			list.add("aaa1");
//			list.add("aaa2");
//			list.add("aaa3");
//			list.add("aaa4");
			
			//List<BoardModel> list = new ArrayList<BoardModel>();
			
//			BoardModel boardModel = new BoardModel();
//			boardModel.setTitle("상품1");
//			boardModel.setContent("상품설명1");
//			boardModel.setPrice(1000);
//			list.add(boardModel);
			
//			boardModel = new BoardModel();
//			boardModel.setTitle("상품2");
//			boardModel.setContent("상품설명2");
//			boardModel.setPrice(1000);
//			list.add(boardModel);
			
//			BoardModel boardModel;
//			boardModel = BoardModel.builder()
//					.title("상품4")
//					.content("상품설명4")
//					.price(1000).build();
			
			//list.add(boardModel);
			
			List<BoardModel> boardList = boardService.getBoard();
			
			
			mav.addObject("resultList", boardList);
			mav.setViewName("content/home");
			
			return mav;
		}
}
