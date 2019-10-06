package com.kboard.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kboard.domain.BoardVO;
import com.kboard.service.BoardService;

/**
 * Handles requests for the application home page.
 */
@Controller // 이 어노테이션은 이 클래스가 컨트롤러임을 스프링에게 알려주는 역할을 한다.
@RequestMapping("/board/")
// url주소가 최상위 url로 되어있을 때 이 클래스로 연결해준다는 의미를 가진다.
// 최상위 url은 localhost:[포트번호]이며,실제로 서버에 올릴 경우엔 서버의 IP나 구입한 도메인이 된다.
public class BoardController {

	@Inject
	// 이 어노테이션을 이용해, boardservice를 가져온다.
	BoardService service;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void list(Model model) throws Exception {
		List<BoardVO> list = null;
		list = service.list();
		// list메소드에서 boardservice의 list() 메소드를 호출한다.
		// list메소드의 결과는 변수 list에 저장하고
		model.addAttribute("list", list);
		// model에 추가를 하게 된다.
		// 여기서 model은 컨트롤러에서 뷰로 넘어갈 때 데이터를 전달할 수 있게 해주는 객체이다.
		// model을 이용하면 컨트롤러에서 사용하던 데이터들을 jsp에서 사용할 수 있게 된다.
	}

	// 게시물 작성
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public void getWrite() throws Exception {
	}

	// 게시물 작성
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String postWrite(BoardVO vo) throws Exception {
		// 매개변수에 BoardVO가 있는데, 이는 전송받은 데이터 중 BoardVO형태의 데이터가 있으면
		// 받겠다는 의미이다. 이 데이터는 vo라는 변수에 담기게 된다.
		service.write(vo); // 여기에서 vo는 service-DAO-Mapper를 통해 데이터베이스에 접속하여
		// 우리가 작성한 게시물을 저장하게 된다.

		return "redirect:/board/list"; // board/list로 이동하겠다는 의미이다.

	}
	
	// 게시물 조회
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public void getView(@RequestParam("bno")int bno, Model model) throws Exception {
	 
	  BoardVO view = null;
	  view =  service.view(bno);

	  model.addAttribute("view", view);
	}

}
