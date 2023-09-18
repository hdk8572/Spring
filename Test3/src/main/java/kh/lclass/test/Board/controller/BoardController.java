package kh.lclass.test.Board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kh.lclass.test.Board.model.service.BoardService;
import kh.lclass.test.Board.model.vo.BoardVo;

@Controller
public class BoardController {
	
	@Autowired
	BoardService service;
	
	@RequestMapping("/")
	public String main() {
		return "main";
	}
	
	
	// @ResponseBody -> jackson-databind(객체를 -> Json 데이터 포멧으로 변환)
	@RequestMapping("/boardList.do")
	public @ResponseBody List<BoardVo> boardList() {
		List<BoardVo> list = service.selectList();
		return list; // JSON 데이터 형식으로 변환해서 리턴(응답)하겠다.
	}
		
}



