package kh.lclass.db1.member.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kh.lclass.db1.member.model.dao.MemberDao;
import kh.lclass.db1.member.model.vo.MemberVo;

@Service
public class MemberService {
	
	@Autowired
	private MemberDao dao;
	
	public List<MemberVo> selectList() {
		return dao.selectList(); 
	}
	
	public int selectOne(String pk) {
		return dao.selectOne(pk);
	}
	
	public int insert(MemberVo vo) {
		dao.update(vo);
		return dao.insert(vo);
	}
	@Transactional
	public int insertReply(MemberVo vo) {
		dao.update(vo);
		return dao.insert(vo);
	}
	
	public int update(MemberVo vo) {
		return dao.update(vo);
	}
	
	public int delete(String pk) {
		return dao.delete(pk);
	}
	
}
