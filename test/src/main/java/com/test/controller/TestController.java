package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.model.dto.TestDto;
import com.test.model.service.TestService;

@Controller
public class TestController {
	@Autowired
	private TestService service;
	
	@GetMapping("/input")
	public String input() {
		return "testinput";
	}

	@PostMapping("/output")
	public String output(Model model,TestDto dto) {
		if(service.insert(dto) > 0) {
			model.addAttribute("dto",service.selectOne(dto.getName()));
			return "testoutput";			
		}
		else {
			return "redirect:/input";
		}
	}

}
