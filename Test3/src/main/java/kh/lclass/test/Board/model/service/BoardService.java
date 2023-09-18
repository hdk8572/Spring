package kh.lclass.test.Board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.lclass.test.Board.model.dao.BoardDao;
import kh.lclass.test.Board.model.vo.BoardVo;

@Service
public class BoardService {
	
	@Autowired
	private BoardDao dao;
	
	public List<BoardVo> selectList() {
		return dao.selectList();
	}
	
	public BoardVo selectOne(int idx) {
		return dao.selectOne(idx);
	}
	
	public int insert(BoardVo vo) {
		return dao.insert(vo);
	}
	
	public int delete(int idx) {
		return dao.delete(idx);
	}
	
	public int update(BoardVo vo) {
		return dao.update(vo);
	}
	
}
