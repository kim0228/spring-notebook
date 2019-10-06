package com.kboard.service;

import java.util.List;

import com.kboard.domain.BoardVO;

public interface BoardService {
	// Service는 dao와 컨트롤러를 연결해주는 역할과 데이터 가공 작업을 맡는다.
	// Service는 비즈니스로직인데, 여기서 데이터를 사용할 수 있는 형태로 가공하는 작업을 한다.
	public void write(BoardVO vo) throws Exception;
	
	public void update(BoardVO vo) throws Exception;
	
	public void delete(int bno) throws Exception;
	
	public BoardVO view(int bno) throws Exception;
	
	public List<BoardVO> list() throws Exception;

}
