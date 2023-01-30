package com.douzone.hellospring.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @RequestMapping 메소드 단독 매핑
 *
 */


//@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@ResponseBody
	@RequestMapping("/board/write")
	public String write() {
		return "BoardController.wirte()";
	}
	
	@ResponseBody
	@RequestMapping("/board/view")
	public String view(Long no) {
		return "BoardController.view("+no+")";
	}
	
	@ResponseBody
	@RequestMapping("/board/view/{no}")
	public String view1(@PathVariable("no") Long no) {
		return "BoardController.view("+no+")";
	}
}
