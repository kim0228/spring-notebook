package com.kboard.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.kboard.dao.BoardDAO;
import com.kboard.domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao; // DAO는 스프링과 데이터베이스를 연결해주는 역할을 한다.

	@Override
	public void write(BoardVO vo) throws Exception {
		dao.write(vo);
	}

	// 게시물 수정
	@Override
	public void update(BoardVO vo) throws Exception {
		dao.update(vo);
	}

	// 게시물 삭제
	@Override
	public void delete(int bno) throws Exception {
		dao.delete(bno);
	}

	// 게시물 조회
	@Override
	public BoardVO view(int bno) throws Exception {
		return dao.view(bno);
	}
	
	// 게시물 목록
	@Override
	public List<BoardVO> list() throws Exception{
		return dao.list();
	}

}