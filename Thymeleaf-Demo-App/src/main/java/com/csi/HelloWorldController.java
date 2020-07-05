package com.csi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("message", "Hello World");
		return "helloWorld";
	}

	@GetMapping("/style")
	public String style() {
		return "add_css_js_demo";
	}
	
	@GetMapping("/boot")
	public String bootstrap() {
		return "add_bootstrap";
	}
}
