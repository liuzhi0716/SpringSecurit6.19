package com.ecnu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(Model model) {
		return "hello";
	}
	
	@RequestMapping("/login")
	public String login(Model model) {
		return "login";
	}
}
