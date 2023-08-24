package kh.lclass.db1.board.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.lclass.db1.board.model.service.BoardService;
import kh.lclass.db1.board.model.vo.BoardVo;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/board/list")
	public String list(Model model) {
		model.addAttribute("boardList", boardService.selectList());
		return "board/list"; 
	}
	
	@GetMapping("/board/get")
	public String get(Model model, int bno) {
		System.out.println(bno);
		model.addAttribute("boardVo", boardService.selectOne(bno));
		return "board/get"; 
	}
	
	@GetMapping("/board/insert")
	public String insert() {
		return "board/insert";
	}
	
	@PostMapping("/board/insert")
	public String insertDo(BoardVo vo) {
		System.out.println(vo);
		boardService.insert(vo);
		return "redirect:/board/list";
	}
	
}
