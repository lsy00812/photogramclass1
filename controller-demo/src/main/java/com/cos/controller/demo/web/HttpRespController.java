package com.cos.controller.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HttpRespController {
	
	@GetMapping("/txt")
	public String txt() {
			return"a.txt";
	}
	
	@GetMapping("/mus")
	public String  mus() {
		return "b";
	}
	
	@GetMapping("/jsp")
	public String jsp() {
		return "c";
	}
}
