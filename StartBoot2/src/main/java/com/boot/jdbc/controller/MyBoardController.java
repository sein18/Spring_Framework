package com.boot.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.jdbc.model.dto.MyDto;
import com.boot.jdbc.model.service.MyService;

@Controller
@RequestMapping("/myboard")
public class MyBoardController {

	@Autowired
	private MyService myService; 
	
	/*
	 *  /detail : 상세보기
	 *  /insertform : 글 작성 페이지이동
	 *  /insert : 작성글 저장
	 *  /updateform : 글 수정 페이지이동
	 *  /delete : 글 삭제
	*/
	
	@GetMapping("/list")
	public String selectList(Model model) {
		System.out.println("list !!");
		model.addAttribute("list",myService.selectList());
		return "myboardlist";
	}
	@GetMapping("/detail")
	public String detail(Model model, int myno) {
		model.addAttribute("dto",myService.selectOne(myno)); 
		return "myboarddetail";
	}
	@GetMapping("/insertform")
	public String insertform() {
		return "myboardinsert";
	}
	@PostMapping("/insert") 
	public String insert(MyDto dto) {
		System.out.println(dto);
		int res = myService.insert(dto);
		if(res>0) {
			return "redirect:list";
		}else {
			return "myboardinsert";
		}
	}
	@GetMapping("/updateform")
	public String updateform(Model model, int myno) {
		model.addAttribute("dto",myService.selectOne(myno)); 
		return "myboardupdate";
	}
	@PostMapping("/update")
	public String update(MyDto dto) {
		System.out.println(dto);
		int res = myService.upgrade(dto);
		if(res>0) {
			return "redirect:detail?myno="+dto.getMyno();
		}else {
			return "redirect:updateform?myno="+dto.getMyno();
		}
	}
}
