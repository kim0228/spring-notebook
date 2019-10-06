package com.kboard.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.kboard.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sql;

	private static String namespace = "com.kboard.mappers.boardMapper";

	@Override
	public void write(BoardVO vo) throws Exception {
		sql.insert(namespace + ".write", vo);
	}

	// 게시물 수정
	@Override
	public void update(BoardVO vo) throws Exception {
		sql.update(namespace + ".update", vo);
	}

	// 게시물 삭제
	@Override
	public void delete(int bno) throws Exception {
		sql.delete(namespace + ".delete", bno);
	}

	// 게시물 조회
	@Override
	public BoardVO view(int bno) throws Exception {
		return sql.selectOne(namespace + ".view", bno);
	}
	
	// 게시물 목록
	@Override
	public List<BoardVO> list() throws Exception{
		// 게시물 목록은 1개 이상의 데이터를 출력하기 때문에 one이 아니라 List형태로 쓰인다.
		return sql.selectList(namespace + ".list");
	}

}