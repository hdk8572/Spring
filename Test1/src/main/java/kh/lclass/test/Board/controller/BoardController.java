package kh.lclass.test.Board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kh.lclass.test.Board.model.service.BoardService;
import kh.lclass.test.Board.model.vo.BoardVo;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/board/boardlist.do")
	public String list(Model model) {
		model.addAttribute("list", boardService.selectList());
		return "board";
	}
	
	@GetMapping("/board/boardForm.do")
	public String boardForm() {
		return "boardForm"; // /WEB-INF/views/boardForm.jsp -> forward
	}
	
	@PostMapping("/board/boardInsert.do")
	public String boardInsert(BoardVo vo) {
		boardService.insert(vo); 
		return "redirect:/board/boardlist.do";
	}
	
	@GetMapping("/board/boardContent.do")
	public String selectOne(Model model, int idx) {
		BoardVo vo = boardService.selectOne(idx);
		model.addAttribute("vo", vo);
		return "boardContent";
	}
	
	@GetMapping("/board/boardDelete.do")
	public String boardDelete(int idx) {
		boardService.delete(idx);
		return "redirect:/board/boardlist.do";
	}
	
	@GetMapping("/board/boardUpdateForm.do")
	public String boardUpdateForm(Model model, int idx) {
		BoardVo vo = boardService.selectOne(idx);
		model.addAttribute("vo", vo);
		return "boardUpdate";
	}
	
	@PostMapping("board/boardUpdate.do")
	public String boardUpdate(BoardVo vo) {
		boardService.update(vo);
		return "redirect:/board/boardlist.do";
	}
	
		
}
