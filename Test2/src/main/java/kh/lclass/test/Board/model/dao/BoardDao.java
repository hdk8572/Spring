package kh.lclass.test.Board.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.lclass.test.Board.model.vo.BoardVo;

@Repository
public class BoardDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<BoardVo> selectList() {
		return sqlSession.selectList("board.selectList");	
	}
	
	public BoardVo selectOne(int idx) {
		return sqlSession.selectOne("board.selectOne", idx);
	}
	
	
	public int insert(BoardVo vo) { 
		return sqlSession.insert("board.insert",vo); 
	}
	
	
	/*
	 * public BoardVo insert(BoardVo vo) { int result =
	 * sqlSession.insert("board.insert", vo); return vo; }
	 */
	
	public int delete(int idx) {
		return sqlSession.delete("board.delete", idx);
	}
	
	public int update(BoardVo vo) {
		return sqlSession.update("board.update", vo);
	}
	
	
}
