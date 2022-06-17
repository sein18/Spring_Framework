package com.boot.leaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.boot.leaf.Dto.LeadfDto;

@Controller
public class LeafController {
	
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("name","Thymeleaf");
		return "hello";
	}
	
	@GetMapping("/util")
	public String util() {
		return "utility";
	}
	
	@GetMapping("/expression")
	public String expression(Model model) {
		model.addAttribute("name","Thymeleaf");
		
		LeadfDto dto = new LeadfDto("Spring",1);
		model.addAttribute("dto",dto);
		
		List<LeadfDto> list = new ArrayList<LeadfDto>();
		list.add(dto);
		list.add(new LeadfDto("java",2));
		list.add(new LeadfDto("css",3));
		list.add(new LeadfDto("github",4));
		model.addAttribute("list",list);
		
		return "pxpression";
	}
 
}
