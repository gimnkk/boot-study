package com.mino.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.annotations.Api;

@Controller
@Api
@RequestMapping("/view")
public class ViewController {

	@GetMapping("/index")
	public String viewTest(Model model) {
		model.addAttribute("name", "��ȣ");
		return "index";
	}
}
